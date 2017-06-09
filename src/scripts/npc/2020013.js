engine.eval("load('nashorn:mozilla_compat.js');");
/*
	NPC Name: 			Pedro
	Map(s): 			El Nath: Chief's Residence (211000001)
	Description: 		Pirate 3rd Job Advancement
	Original Author:	Xterminator
	Custom Quest(s):	100100, 100102
*/

importPackage(Packages.net.sf.odinms.client);
status = -1;
var job;
var sel;
actionx = {"Mental" : false, "Physical" : false};

function start() {
    if (!(cm.getJob().equals(MapleJob.BRAWLER) || cm.getJob().equals(MapleJob.GUNSLINGER))){
		cm.sendOk("May #rSimplicity#k be with you!");
		cm.dispose();
		return;
    } else if (cm.getLevel() <=69){
        cm.sendOk("You're not ready yet...");
        cm.dispose();
        return;
    }
    if (cm.haveItem(4031058))
        actionx["Mental"] = true;
    else if (cm.haveItem(4031057))
        actionx["Physical"] = true;
	cm.sendSimple("Can I help you#b " + cm.getPlayer().getName() + "#k?\r\n#L0#I want to make the 3rd job advancement.");
    //\r\n#L1#Please allow me to do the Zakum Dungeon Quest
}


function action(mode, type, selection){
    status++;
    if (mode == 0 && type == 0) {
        status -= 2;
    } else if ((mode != 1) || (status > 2 && !actionx["Mental"] && sel != 0) || (status > 3 && sel != 0)) {
        if (mode == 0 && type == 1)
            cm.sendNext("Make up your mind.");
            cm.dispose();
            return;
    }
    if (actionx["Mental"]) {
        if (status == 0)
			cm.sendNext("Great job completing the mental part of the test. You have wisely answered all the questions correctly. I must say, I am quite impressed with the level of wisdom you have displayed there. Please hand me the necklace first, before we take on the next step.");
        else if (status == 1)
			cm.sendYesNo("Great! You may now become the kind of Pirate you've always dreamed of! With newfound power and stellar new skills, your power has endless possibilities! Since you've already chosen which of the two paths you wanted to take for the Pirate's 2nd job advancement, this will not require much thought. Do you wish to make the job advancement right now?");
        else if (status == 2) {
            if (cm.getPlayer().getRemainingSp() > 0)
                if (cm.getPlayer().getRemainingSp() > (cm.getLevel() - 70) * 3) {
                    cm.sendNext("Please, use all your SP before continuing.");
                    cm.dispose();
                    return;
                }
            if (cm.getJob().equals(MapleJob.BRAWLER)) {
                cm.changeJob(MapleJob.MARAUDER);
                cm.getChar().gainAp(5);
                cm.gainItem(4031058, -1);
                cm.sendNext("Great! You are now a #bMarauder#k. As a Marauder, you will learn some of the most sophisticated skills related to melee-based attacks.");
            }
            if (cm.getJob().equals(MapleJob.GUNSLINGER)) {
                cm.changeJob(MapleJob.OUTLAW);
                cm.getChar().gainAp(5);
                cm.gainItem(4031058, -1);
				cm.sendNext("Great! You are now an #bOutlaw#k. As an Outlaw, you will learn some of the most sophisticated skills related to ranged-based attacks.")
            }
			cm.completeQuest(100102);
        } else if (status == 3) {
			cm.sendOk("I have also given you Skill Points and Ability Points, so please apply them when you get a chance. Now that you have made the job advancement, I believe you have now become a formidable Pirate. Remember, though, that this will open up a whole new set of difficult journeys for you to take.")
        }
    } else if (actionx["Physical"]) {
        if (status == 0)
            cm.sendNext("Great job completing the physical part of the test. I knew you could do it. Now that you have passed the first half of the test, here's the second half. Please give me the necklace first.");
        else if (status == 1) {
            if (cm.haveItem(4031057)) {
                cm.gainItem(4031057, -1);
                cm.completeQuest(100100);
                cm.startQuest(100102);
				cm.sendNext("Here's the 2nd half of the test. This test will determine whether you are smart enough to take the next step towards greatness. There is a dark, snow-covered area called the Holy Ground at the snowfield in Ossyria, where even the monsters can't reach. On the center of the area lies a huge stone called the Holy Stone. You'll need to offer a #b#t4005004##k as sacrifice, then the Holy Stone will test your wisdom. The #b#t4005004##k can be crafted by Vogen here in El Nath.");
			}
		} else if (status == 2) {
            cm.sendOk("You'll need to answer each and every question given to you with honesty and conviction. If you correctly answer all the questions, then the Holy Stone will formally accept you and hand you #b#t4031058##k. Bring back the necklace, and I will help you to the next step forward. Good luck.");
			cm.dispose();
		}
	} else if (cm.getQuestStatus(100102).equals(MapleQuestStatus.Status.STARTED)){
		cm.sendOk("Go, bring a #b#t4005004##k to the #b#p2030006##k, and return to me with #b#t4031058##k #i4031058#");
		cm.dispose();
	} else if (cm.getQuestStatus(100100).equals(MapleQuestStatus.Status.COMPLETED)) {
		cm.sendOk("Now, go see #b#p2030006##k and bring me #b#i4031058#\r\n#t4031058##k.You'll need to answer the #b#p2030006#s#k each and every question with honesty and conviction. Bring back the necklace, and I will help you to the next step forward. Good luck.");
		cm.dispose();
	} else if (cm.getQuestStatus(100100).equals(MapleQuestStatus.Status.STARTED) && (sel != 0)) {
		cm.sendOk("The mental half of the test can only start after you pass the physical part of the test. #b#t4031057##k will be the proof that you have indeed passed the test. I'll let \r\n#b#p1012100##k know in advance that you're making your way there, so get ready. It won't be easy, but I have the utmost faith in you. Good luck.");    
		cm.dispose();
	} else {
		if (sel == undefined)
			sel = selection;
		if (sel == 0){
			if (cm.getPlayer().getLevel() >= 70 && cm.getJob().equals(MapleJob.BRAWLER) || cm.getJob().equals(MapleJob.GUNSLINGER)) {
				if (status == 0) {
					cm.sendNext("Hmm. So you want to become a stronger Pirate by making the 3rd job advancement? First let me say congratulations! Few have this level of dedication...");
				} else if (status == 1) {
					cm.sendNextPrev("I can certainly make you stronger with my powers, but I'll need to test your strength to see if your training has been adequate. Many come professing their strength, few are actually able to prove it.")
				} else if (status == 2) {
					cm.sendYesNo("Are you ready for me to test your strength?");
				} else if (status == 3) {
					cm.sendNext("Great! Now you will have to prove your strength and intelligence. Let me first explain the strength test. Do you remember #bKyrin#k from The Nautilus who helped you make the 1st and 2nd job advancements?");
					cm.startQuest(100100);
				} else if (status == 4) {
					cm.sendOk("Go to see her and she will give you a task to fulfill. Complete the task to receive #bThe Necklace of Strength#k which I'd like you to bring back to me.")
				}
			}
		} else {
			cm.sendNext("Not done yet.");
			cm.dispose();
		}
	}
}
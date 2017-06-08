engine.eval("load('nashorn:mozilla_compat.js');");
/*  
	NPC Name: 			Athena Pierce
	Map(s): 			Victoria Road : Bowman Instructional School (100000201)
	Description: 		Bowman Job Advancement
	Original Author:	Xterminator
	Custom Quest(s):	100000, 100002, 100100, 100101
*/

importPackage(Packages.net.sf.odinms.client);

var status = 0;
var job;

function start() {
	status = -1;
	action(1, 0, 0);
}

function action(mode, type, selection) {	
	if (mode == -1) {
		cm.dispose();
	} else {
		if (mode == 0 && status == 2) {
			cm.sendOk("Make up your mind and visit me again.");
			cm.dispose();
			return;
		}
		if (mode == 1)
			status++;
		else
			status--;
		if (status == 0) {
			if (cm.getJob().equals(MapleJob.BEGINNER)) {
				if (cm.getLevel() >= 10 && cm.getChar().getDex() >= 25)
					cm.sendNext("So you decided to become a #rBowman#k?");
				else {
					cm.sendOk("Train a bit more and I can show you the way of the #rBowman#k.")
					cm.dispose();
				}
			} else {
				if (cm.getLevel() >= 30 && cm.getJob().equals(MapleJob.BOWMAN)) {
					if (cm.getQuestStatus(100000).getId() >= MapleQuestStatus.Status.STARTED.getId()) {
						cm.completeQuest(100002);
						if (cm.getQuestStatus(100002) == MapleQuestStatus.Status.COMPLETED) {
							status = 20;
							cm.sendNext("I see you have done well. I will allow you to take the next step on your long road.");
						} else {
							cm.sendOk("Go and see the #rJob Instructor#k.")
							cm.dispose();
						}
					} else {
						status = 10;
						cm.sendNext("The progress you have made is astonishing.");
					}
				} else if (cm.getLevel() >= 70 && cm.getQuestStatus(100100) == MapleQuestStatus.Status.NOTSTARTED) {
					cm.sendOk("I see you have been training hard. You should go see #bRene#kin El Nath to continue your progress.");
					cm.dispose();
				} else if (cm.getQuestStatus(100100).equals(MapleQuestStatus.Status.STARTED)) {
					if (cm.haveItem(4031059)) { //Has black charm
						cm.removeAll(4031059);
						cm.completeQuest(100101)
					}
					if (cm.getQuestStatus(100101).equals(MapleQuestStatus.Status.COMPLETED) && !(cm.haveItem(4031057))) {
						cm.sendOk("Alright, now take this #i4031057# to #bRene#k.");
						cm.gainItem(4031057);
					} else if (cm.getQuestStatus(100101).equals(MapleQuestStatus.Status.COMPLETED) && (cm.haveItem(4031057))) {
						cm.sendOk("Go and take #bThe Necklace of Strength#k to #bRene#k.");
					} else {
						cm.sendOk("Hey, " + cm.getChar().getName() + "! I need a #bBlack Charm#k. Go and find the Door of Dimension.");
						cm.startQuest(100101);
					}
					cm.dispose();
				} else {
					cm.sendOk("You have chosen wisely.");
					cm.dispose();
				}
			}
		} else if (status == 1) {
			cm.sendNextPrev("It is an important and final choice. You will not be able to turn back.");
		} else if (status == 2) {
			cm.sendYesNo("Do you want to become a #rBowman#k?");
		} else if (status == 3) {
			if (cm.getJob().equals(MapleJob.BEGINNER)) {
				cm.changeJob(MapleJob.BOWMAN);
				cm.gainItem(1452002, 1);
				cm.gainItem(2060000, 1000);
				cm.sendOk("So be it! Now go, and go with pride.");
			}
			cm.dispose();
		} else if (status == 11) {
			cm.sendNextPrev("You may be ready to take the next step as a #rHunter#k or #rCrossbowman#k.")
		} else if (status == 12) {
			cm.sendAcceptDecline("But first I must test your skills. Are you ready?");
		} else if (status == 13) {
			if (cm.haveItem(4031010)) {
				cm.sendOk("Please report this bug at http://odinms.de/forum/.\r\nstatus = 13");
			} else {
				cm.startQuest(100000);
				cm.sendOk("Go see the #bJob Instructor#k near Henesys. He will show you the way.");
				cm.dispose();
			}
		} else if (status == 21) {
			cm.sendSimple("What do you want to become?#b\r\n#L0#Hunter#l\r\n#L1#Crossbowman#l#k");
		} else if (status == 22) {
			var jobName;
			if (selection == 0) {
				jobName = "Hunter";
				job = MapleJob.HUNTER;
			} else {
				jobName = "Crossbowman";
				job = MapleJob.CROSSBOWMAN;
			}
			cm.sendYesNo("Do you want to become a #r" + jobName + "#k?");
		} else if (status == 23) {
			if (job.equals(MapleJob.HUNTER))
				cm.gainItem(1452033);
			else
				cm.gainItem(1462029);
			cm.changeJob(job);
			cm.sendOk("So be it! Now go, and go with pride.");
		}
	}
}
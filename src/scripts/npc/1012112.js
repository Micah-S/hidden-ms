/*
  Torry
  FightDesign @RageZONE
  */
var status = 0;
var chosen = 0;

function start() {
    status = -1;
    action(1, 0, 0);
}

function action(mode, type, selection) {
    if (mode == -1) {
        cm.dispose();
    } else {
        if (mode == 0 && status == 0) {
            cm.dispose();
            return;
        }
        if (mode == 1) {
            status++;
        } else {
            cm.dispose();
			return;
		}
        if (cm.getPlayer().getMapId() == 100000200){
		if (cm.getParty() == null) {
                        cm.sendOk("You are not in a party.");
                        cm.dispose();
                        return;
                    }
            if (!cm.getParty().getLeader().getName() == cm.getPlayer().getName()) {
                if (status == 0) {
                    cm.sendNext("Hi there! I'm Tory. This place is covered with mysterious aura of the full moon, and no one person can enter here by him/herself.");
                } else if (status == 1) {
                    cm.sendSimple("If you'd like to enter here, the leader of your party will have to talk to me. Talk to your party leader about this.");
                } 
            } else {
                if (status == 0) {
                    cm.sendNext("I'm Tory. Inside here is a beautiful hill where the primrose blooms. There's a tiger that lives in the hill, Growlie, and he seems to be looking for something to eat.");
                } else if (status == 1) {
                    cm.sendSimple("Would you like to head over to the hill of primrose and join forces with your party members to help Growlie out?\r\n#b#L0# Yes, I will go.#l");
                } else if (status == 2) {
                    if (cm.getParty() == null) {
                        cm.sendOk("You are not in a party.");
                        cm.dispose();
                        return;
                    } else {
                        var cango = true;
                        var things = cm.getParty().getMembers();
                        var onmap = 0;
                        for (var i = 0; i < things.size(); i++) {
                            if (things.get(i).getMapid() == cm.getPlayer().getParty().getLeader().getMapid()) {
                                if (things.get(i).getLevel() < 10) {
                                    cango = false;
                                    break;
                                }
                                onmap++;
                            }
                        }
                        if (onmap < 2 && cm.getClient().getChannelServer().getMapFactory().getMap(910010000).getAllPlayer().size() > 0)
                            cango = false;
                        if (cango) {
                            var em = cm.getEventManager("HenesysPQ");
                if (em == null) {
                    cm.sendOk("This PQ is currently unavailable.");
                } else if (em.getProperty("HPQOpen").equals("true")) {
                    // Operation HenesysPQ : GO.
					em.setProperty("latestLeader", cm.getPlayer().getName());
                    em.startInstance(cm.getParty(), cm.getPlayer().getMap());
                    em.setProperty("HPQOpen" , "false");
					cm.dispose();
                } else {
                    cm.sendNext("There is already another party inside. Please wait !");
                }
                        } else {
                            cm.sendOk("Unfortunately, Henesys Party Quest is currently unavailable.");
                            cm.dispose();
                        }
                    }
                }
            }
        } else if (cm.getPlayer().getMap().getId() == 910010100) {
            if (status == 0) {
                cm.sendYesNo("I appreciate you giving some rice cakes for the hungry Growlie. It looks like you have nothing else to do now. Would you like to leave this place?");
            } else if (status == 1) {
                chosen = selection;
                if (mode == 0) {
                    cm.sendOk("Humm... Well, okay.\r\nBut you have nothing else to do here, anyway...");
                } else if (mode == 1) {
                    cm.warp(100000200);
                }
                cm.dispose();
            } 
        } else if (cm.getPlayer().getMap().getId() == 910010400) {
            if (status == 0) {
                cm.sendSimple("Are you guys done putting a good whooping on those pigs? It looks like you'll have nothing else to do here now. Would you like to leave this place? \r\n#b#L0# Yes, I'd like to leave here.#l");
            } else if (status == 1) {
			    if (selection == 0) {
                    if (cm.getParty() != null)
                        cm.warpParty(100000200);
				}
                cm.dispose();
            }
        }
    }
}
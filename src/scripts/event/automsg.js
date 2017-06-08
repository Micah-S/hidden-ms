engine.eval("load('nashorn:mozilla_compat.js');");
var setupTask;

function init() {
    scheduleNew();
}

function scheduleNew() {
	setupTask = em.scheduleAtFixedRate("start", 30 * (1000 * 60));
}

function cancelSchedule() {
    setupTask.cancel(true);
}

function start() {
    var Message = new Array("@commands Will show a list of commands!");
    em.getChannelServer().broadcastPacket(Packages.net.sf.odinms.tools.MaplePacketCreator.sendYellowTip("[MapleTip] " + Message[Math.floor(Math.random() * Message.length)]));
}
package net.sf.odinms.net;

import net.sf.odinms.net.channel.handler.AllianceOperationHandler;
import net.sf.odinms.net.channel.handler.AutoAggroHandler;
import net.sf.odinms.net.channel.handler.BBSOperationHandler;
import net.sf.odinms.net.channel.handler.BuddylistModifyHandler;
import net.sf.odinms.net.channel.handler.BuyCSItemHandler;
import net.sf.odinms.net.channel.handler.CancelBuffHandler;
import net.sf.odinms.net.channel.handler.CancelChairHandler;
import net.sf.odinms.net.channel.handler.CancelDebuffHandler;
import net.sf.odinms.net.channel.handler.CancelItemEffectHandler;
import net.sf.odinms.net.channel.handler.ChangeChannelHandler;
import net.sf.odinms.net.channel.handler.ChangeMapHandler;
import net.sf.odinms.net.channel.handler.ChangeMapSpecialHandler;
import net.sf.odinms.net.channel.handler.CharInfoRequestHandler;
import net.sf.odinms.net.channel.handler.CloseChalkboardHandler;
import net.sf.odinms.net.channel.handler.CloseRangeDamageHandler;
import net.sf.odinms.net.channel.handler.CouponCodeHandler;
import net.sf.odinms.net.channel.handler.DamageSummonHandler;
import net.sf.odinms.net.channel.handler.DenyGuildRequestHandler;
import net.sf.odinms.net.channel.handler.DenyPartyRequestHandler;
import net.sf.odinms.net.channel.handler.DistributeAPHandler;
import net.sf.odinms.net.channel.handler.DistributeSPHandler;
import net.sf.odinms.net.channel.handler.DoorHandler;
import net.sf.odinms.net.channel.handler.DueyHandler;
import net.sf.odinms.net.channel.handler.EnergyOrbDamageHandler;
import net.sf.odinms.net.channel.handler.EnterCashShopHandler;
import net.sf.odinms.net.channel.handler.EnterMTSHandler;
import net.sf.odinms.net.channel.handler.FaceExpressionHandler;
import net.sf.odinms.net.channel.handler.GeneralchatHandler;
import net.sf.odinms.net.channel.handler.GiveFameHandler;
import net.sf.odinms.net.channel.handler.GuildOperationHandler;
import net.sf.odinms.net.channel.handler.HealOvertimeHandler;
import net.sf.odinms.net.channel.handler.HiredMerchantRequest;
import net.sf.odinms.net.channel.handler.InnerPortalHandler;
import net.sf.odinms.net.channel.handler.ItemMoveHandler;
import net.sf.odinms.net.channel.handler.ItemPickupHandler;
import net.sf.odinms.net.channel.handler.ItemSortHandler;
import net.sf.odinms.net.channel.handler.KeymapChangeHandler;
import net.sf.odinms.net.channel.handler.MTSHandler;
import net.sf.odinms.net.channel.handler.MagicDamageHandler;
import net.sf.odinms.net.channel.handler.MapleTVHandler;
import net.sf.odinms.net.channel.handler.MesoDropHandler;
import net.sf.odinms.net.channel.handler.MessengerHandler;
import net.sf.odinms.net.channel.handler.MobDamageMobHandler;
import net.sf.odinms.net.channel.handler.MonsterBombHandler;
import net.sf.odinms.net.channel.handler.MonsterCarnivalHandler;
import net.sf.odinms.net.channel.handler.MoveLifeHandler;
import net.sf.odinms.net.channel.handler.MovePetHandler;
import net.sf.odinms.net.channel.handler.MovePlayerHandler;
import net.sf.odinms.net.channel.handler.MoveSummonHandler;
import net.sf.odinms.net.channel.handler.NPCAnimation;
import net.sf.odinms.net.channel.handler.NPCMoreTalkHandler;
import net.sf.odinms.net.channel.handler.NPCShopHandler;
import net.sf.odinms.net.channel.handler.NPCTalkHandler;
import net.sf.odinms.net.channel.handler.NoteActionHandler;
import net.sf.odinms.net.channel.handler.PartyOperationHandler;
import net.sf.odinms.net.channel.handler.PartySearchHandler;
import net.sf.odinms.net.channel.handler.PartychatHandler;
import net.sf.odinms.net.channel.handler.PetAutoPotHandler;
import net.sf.odinms.net.channel.handler.PetChatHandler;
import net.sf.odinms.net.channel.handler.PetCommandHandler;
import net.sf.odinms.net.channel.handler.PetFoodHandler;
import net.sf.odinms.net.channel.handler.PetLootHandler;
import net.sf.odinms.net.channel.handler.PlayerInteractionHandler;
import net.sf.odinms.net.channel.handler.PlayerLoggedinHandler;
import net.sf.odinms.net.channel.handler.PlayerUpdateHandler;
import net.sf.odinms.net.channel.handler.QuestActionHandler;
import net.sf.odinms.net.channel.handler.RangedAttackHandler;
import net.sf.odinms.net.channel.handler.ReactorHitHandler;
import net.sf.odinms.net.channel.handler.ReportHandler;
import net.sf.odinms.net.channel.handler.RingActionHandler;
import net.sf.odinms.net.channel.handler.ScrollHandler;
import net.sf.odinms.net.channel.handler.SkillBookHandler;
import net.sf.odinms.net.channel.handler.SkillEffectHandler;
import net.sf.odinms.net.channel.handler.SkillMacroHandler;
import net.sf.odinms.net.channel.handler.SpawnPetHandler;
import net.sf.odinms.net.channel.handler.SpecialMoveHandler;
import net.sf.odinms.net.channel.handler.StorageHandler;
import net.sf.odinms.net.channel.handler.SummonDamageHandler;
import net.sf.odinms.net.channel.handler.TakeDamageHandler;
import net.sf.odinms.net.channel.handler.TouchingCashShopHandler;
import net.sf.odinms.net.channel.handler.UseCashItemHandler;
import net.sf.odinms.net.channel.handler.UseCatchItemHandler;
import net.sf.odinms.net.channel.handler.UseChairHandler;
import net.sf.odinms.net.channel.handler.UseItemEffectHandler;
import net.sf.odinms.net.channel.handler.UseItemHandler;
import net.sf.odinms.net.channel.handler.UseMountFoodHandler;
import net.sf.odinms.net.channel.handler.UseSummonBag;
import net.sf.odinms.net.channel.handler.VIPAddMapHandler;
import net.sf.odinms.net.channel.handler.WhisperHandler;
import net.sf.odinms.net.channel.handler.useSolomonHandler;
import net.sf.odinms.net.handler.KeepAliveHandler;
import net.sf.odinms.net.handler.LoginRequiringNoOpHandler;
import net.sf.odinms.net.login.handler.AfterLoginHandler;
import net.sf.odinms.net.login.handler.CharSelectedHandler;
import net.sf.odinms.net.login.handler.CharlistRequestHandler;
import net.sf.odinms.net.login.handler.CheckCharNameHandler;
import net.sf.odinms.net.login.handler.CreateCharHandler;
import net.sf.odinms.net.login.handler.DeleteCharHandler;
import net.sf.odinms.net.login.handler.GuestLoginHandler;
import net.sf.odinms.net.login.handler.LoginPasswordHandler;
import net.sf.odinms.net.login.handler.PickCharHandler;
import net.sf.odinms.net.login.handler.PlayerDCHandler;
import net.sf.odinms.net.login.handler.RelogRequestHandler;
import net.sf.odinms.net.login.handler.ServerStatusRequestHandler;
import net.sf.odinms.net.login.handler.ServerlistRequestHandler;
import net.sf.odinms.net.login.handler.ViewCharHandler;

public final class PacketProcessor {

	public enum Mode {
		LOGINSERVER, CHANNELSERVER
	};

	private static PacketProcessor	instance;
	private MaplePacketHandler[]	handlers;

	private PacketProcessor() {
		int maxRecvOp = 0;
		for (RecvPacketOpcode op : RecvPacketOpcode.values()) {
			if (op.getValue() > maxRecvOp) {
				maxRecvOp = op.getValue();
			}
		}
		handlers = new MaplePacketHandler[maxRecvOp + 1];
	}

	public MaplePacketHandler getHandler(short packetId) {
		if (packetId > handlers.length) {
			return null;
		}
		MaplePacketHandler handler = handlers[packetId];
		if (handler != null) {
			return handler;
		}
		return null;
	}

	public void registerHandler(RecvPacketOpcode code, MaplePacketHandler handler) {
		try {
			handlers[code.getValue()] = handler;
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Check your Recv Packet Opcodes - Something is wrong");
		}
	}

	public synchronized static PacketProcessor getProcessor(Mode mode) {
		if (instance == null) {
			instance = new PacketProcessor();
			instance.reset(mode);
		}
		return instance;
	}

	public void reset(Mode mode) {
		handlers = new MaplePacketHandler[handlers.length];
		registerHandler(RecvPacketOpcode.PONG, new KeepAliveHandler());
		if (mode == Mode.LOGINSERVER) {
			registerHandler(RecvPacketOpcode.AFTER_LOGIN, new AfterLoginHandler());
			registerHandler(RecvPacketOpcode.SERVERLIST_REREQUEST, new ServerlistRequestHandler());
			registerHandler(RecvPacketOpcode.CHARLIST_REQUEST, new CharlistRequestHandler());
			registerHandler(RecvPacketOpcode.CHAR_SELECT, new CharSelectedHandler());
			registerHandler(RecvPacketOpcode.LOGIN_PASSWORD, new LoginPasswordHandler());
			registerHandler(RecvPacketOpcode.RELOG, new RelogRequestHandler());
			registerHandler(RecvPacketOpcode.GUEST_LOGIN, new GuestLoginHandler());
			registerHandler(RecvPacketOpcode.SERVERLIST_REQUEST, new ServerlistRequestHandler());
			registerHandler(RecvPacketOpcode.PLAYER_DC, new PlayerDCHandler());
			registerHandler(RecvPacketOpcode.SERVERSTATUS_REQUEST, new ServerStatusRequestHandler());
			registerHandler(RecvPacketOpcode.CHECK_CHAR_NAME, new CheckCharNameHandler());
			registerHandler(RecvPacketOpcode.CREATE_CHAR, new CreateCharHandler());
			registerHandler(RecvPacketOpcode.DELETE_CHAR, new DeleteCharHandler());
			registerHandler(RecvPacketOpcode.VIEW_ALL_CHAR, new ViewCharHandler());
			registerHandler(RecvPacketOpcode.PICK_ALL_CHAR, new PickCharHandler());
		} else if (mode == Mode.CHANNELSERVER) {
			registerHandler(RecvPacketOpcode.CHANGE_CHANNEL, new ChangeChannelHandler());
			registerHandler(RecvPacketOpcode.STRANGE_DATA, LoginRequiringNoOpHandler.getInstance());
			registerHandler(RecvPacketOpcode.GENERAL_CHAT, new GeneralchatHandler());
			registerHandler(RecvPacketOpcode.WHISPER, new WhisperHandler());
			registerHandler(RecvPacketOpcode.NPC_TALK, new NPCTalkHandler());
			registerHandler(RecvPacketOpcode.NPC_TALK_MORE, new NPCMoreTalkHandler());
			registerHandler(RecvPacketOpcode.QUEST_ACTION, new QuestActionHandler());
			registerHandler(RecvPacketOpcode.NPC_SHOP, new NPCShopHandler());
			registerHandler(RecvPacketOpcode.ITEM_SORT, new ItemSortHandler());
			registerHandler(RecvPacketOpcode.ITEM_MOVE, new ItemMoveHandler());
			registerHandler(RecvPacketOpcode.MESO_DROP, new MesoDropHandler());
			registerHandler(RecvPacketOpcode.PLAYER_LOGGEDIN, new PlayerLoggedinHandler());
			registerHandler(RecvPacketOpcode.CHANGE_MAP, new ChangeMapHandler());
			registerHandler(RecvPacketOpcode.MOVE_LIFE, new MoveLifeHandler());
			registerHandler(RecvPacketOpcode.CLOSE_RANGE_ATTACK, new CloseRangeDamageHandler());
			registerHandler(RecvPacketOpcode.RANGED_ATTACK, new RangedAttackHandler());
			registerHandler(RecvPacketOpcode.MAGIC_ATTACK, new MagicDamageHandler());
			registerHandler(RecvPacketOpcode.TAKE_DAMAGE, new TakeDamageHandler());
			registerHandler(RecvPacketOpcode.MOVE_PLAYER, new MovePlayerHandler());
			registerHandler(RecvPacketOpcode.USE_CASH_ITEM, new UseCashItemHandler());
			registerHandler(RecvPacketOpcode.USE_ITEM, new UseItemHandler());
			registerHandler(RecvPacketOpcode.USE_RETURN_SCROLL, new UseItemHandler());
			registerHandler(RecvPacketOpcode.USE_UPGRADE_SCROLL, new ScrollHandler());
			registerHandler(RecvPacketOpcode.USE_SUMMON_BAG, new UseSummonBag());
			registerHandler(RecvPacketOpcode.FACE_EXPRESSION, new FaceExpressionHandler());
			registerHandler(RecvPacketOpcode.HEAL_OVER_TIME, new HealOvertimeHandler());
			registerHandler(RecvPacketOpcode.ITEM_PICKUP, new ItemPickupHandler());
			registerHandler(RecvPacketOpcode.CHAR_INFO_REQUEST, new CharInfoRequestHandler());
			registerHandler(RecvPacketOpcode.SPECIAL_MOVE, new SpecialMoveHandler());
			registerHandler(RecvPacketOpcode.USE_INNER_PORTAL, new InnerPortalHandler());
			registerHandler(RecvPacketOpcode.CANCEL_BUFF, new CancelBuffHandler());
			registerHandler(RecvPacketOpcode.CANCEL_ITEM_EFFECT, new CancelItemEffectHandler());
			registerHandler(RecvPacketOpcode.PLAYER_INTERACTION, new PlayerInteractionHandler());
			registerHandler(RecvPacketOpcode.DISTRIBUTE_AP, new DistributeAPHandler());
			registerHandler(RecvPacketOpcode.DISTRIBUTE_SP, new DistributeSPHandler());
			registerHandler(RecvPacketOpcode.CHANGE_KEYMAP, new KeymapChangeHandler());
			registerHandler(RecvPacketOpcode.CHANGE_MAP_SPECIAL, new ChangeMapSpecialHandler());
			registerHandler(RecvPacketOpcode.STORAGE, new StorageHandler());
			registerHandler(RecvPacketOpcode.GIVE_FAME, new GiveFameHandler());
			registerHandler(RecvPacketOpcode.PARTY_OPERATION, new PartyOperationHandler());
			registerHandler(RecvPacketOpcode.DENY_PARTY_REQUEST, new DenyPartyRequestHandler());
			registerHandler(RecvPacketOpcode.PARTYCHAT, new PartychatHandler());
			registerHandler(RecvPacketOpcode.USE_DOOR, new DoorHandler());
			registerHandler(RecvPacketOpcode.ENTER_MTS, new EnterMTSHandler());
			registerHandler(RecvPacketOpcode.ENTER_CASH_SHOP, new EnterCashShopHandler());
			registerHandler(RecvPacketOpcode.DAMAGE_SUMMON, new DamageSummonHandler());
			registerHandler(RecvPacketOpcode.MOVE_SUMMON, new MoveSummonHandler());
			registerHandler(RecvPacketOpcode.SUMMON_ATTACK, new SummonDamageHandler());
			registerHandler(RecvPacketOpcode.BUDDYLIST_MODIFY, new BuddylistModifyHandler());
			registerHandler(RecvPacketOpcode.USE_ITEMEFFECT, new UseItemEffectHandler());
			registerHandler(RecvPacketOpcode.USE_CHAIR, new UseChairHandler());
			registerHandler(RecvPacketOpcode.CANCEL_CHAIR, new CancelChairHandler());
			registerHandler(RecvPacketOpcode.DAMAGE_REACTOR, new ReactorHitHandler());
			registerHandler(RecvPacketOpcode.GUILD_OPERATION, new GuildOperationHandler());
			registerHandler(RecvPacketOpcode.DENY_GUILD_REQUEST, new DenyGuildRequestHandler());
			registerHandler(RecvPacketOpcode.BBS_OPERATION, new BBSOperationHandler());
			registerHandler(RecvPacketOpcode.SKILL_EFFECT, new SkillEffectHandler());
			registerHandler(RecvPacketOpcode.MESSENGER, new MessengerHandler());
			registerHandler(RecvPacketOpcode.NPC_ACTION, new NPCAnimation());
			registerHandler(RecvPacketOpcode.TOUCHING_CS, new TouchingCashShopHandler());
			registerHandler(RecvPacketOpcode.BUY_CS_ITEM, new BuyCSItemHandler());
			registerHandler(RecvPacketOpcode.COUPON_CODE, new CouponCodeHandler());
			registerHandler(RecvPacketOpcode.SPAWN_PET, new SpawnPetHandler());
			registerHandler(RecvPacketOpcode.MOVE_PET, new MovePetHandler());
			registerHandler(RecvPacketOpcode.PET_CHAT, new PetChatHandler());
			registerHandler(RecvPacketOpcode.PET_COMMAND, new PetCommandHandler());
			registerHandler(RecvPacketOpcode.PET_FOOD, new PetFoodHandler());
			registerHandler(RecvPacketOpcode.PET_LOOT, new PetLootHandler());
			registerHandler(RecvPacketOpcode.AUTO_AGGRO, new AutoAggroHandler());
			registerHandler(RecvPacketOpcode.MONSTER_BOMB, new MonsterBombHandler());
			registerHandler(RecvPacketOpcode.CANCEL_DEBUFF, new CancelDebuffHandler());
			registerHandler(RecvPacketOpcode.USE_SKILL_BOOK, new SkillBookHandler());
			registerHandler(RecvPacketOpcode.SKILL_MACRO, new SkillMacroHandler());
			registerHandler(RecvPacketOpcode.NOTE_ACTION, new NoteActionHandler());
			registerHandler(RecvPacketOpcode.MAPLETV, new MapleTVHandler());
			registerHandler(RecvPacketOpcode.PLAYER_UPDATE, new PlayerUpdateHandler());
			registerHandler(RecvPacketOpcode.USE_CATCH_ITEM, new UseCatchItemHandler());
			registerHandler(RecvPacketOpcode.CLOSE_CHALKBOARD, new CloseChalkboardHandler());
			registerHandler(RecvPacketOpcode.MONSTER_CARNIVAL, new MonsterCarnivalHandler());
			registerHandler(RecvPacketOpcode.USE_MOUNT_FOOD, new UseMountFoodHandler());
			registerHandler(RecvPacketOpcode.VIP_ADD_MAP, new VIPAddMapHandler());
			registerHandler(RecvPacketOpcode.RING_ACTION, new RingActionHandler());
			registerHandler(RecvPacketOpcode.MOB_DAMAGE_MOB, new MobDamageMobHandler());
			registerHandler(RecvPacketOpcode.REPORT_PLAYER, new ReportHandler());
			registerHandler(RecvPacketOpcode.PARTY_SEARCH_REGISTER, new PartySearchHandler());
			registerHandler(RecvPacketOpcode.DUEY_ACTION, new DueyHandler());
			registerHandler(RecvPacketOpcode.PET_AUTO_POT, new PetAutoPotHandler());
			registerHandler(RecvPacketOpcode.MTS_OP, new MTSHandler());
			registerHandler(RecvPacketOpcode.ENERGY_ORB_ATTACK, new EnergyOrbDamageHandler());
			registerHandler(RecvPacketOpcode.USE_SOLOMAN_ITEM, new useSolomonHandler());
			registerHandler(RecvPacketOpcode.ALLIANCE_OPERATION, new AllianceOperationHandler());
			registerHandler(RecvPacketOpcode.HIRED_MERCHANT_REQUEST, new HiredMerchantRequest());
		} else {
			throw new RuntimeException("Unknown packet processor mode");
		}
	}
}
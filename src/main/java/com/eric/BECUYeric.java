package com.eric;

import com.eric.tools.weapon.*;
import com.sun.jna.platform.win32.WinDef;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class BECUYeric implements ModInitializer {
	public static final String MOD_ID = "becuyeric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//服务器
	// 相关
	//物品
	public static final Block miantain = new Block(FabricBlockSettings.create().strength(100.0f,1400f).nonOpaque());
	public static final Block miantain2 = new Block(FabricBlockSettings.create().strength(100.0f, 1400.0f).nonOpaque());
	public static final Block miantain3 = new Block(FabricBlockSettings.create().strength(100.0f, 1400.0f).nonOpaque());
	public static final Block miantain4 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain5 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain6 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain7 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain8 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain9 = new Block(FabricBlockSettings.create().strength(1000.f,1400.0f).nonOpaque());
	public static final Block miantain10 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain11 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Block miantain12 = new Block(FabricBlockSettings.create().strength(1000.0f,1400.0f).nonOpaque());
	public static final Item becuymoney_10 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_1 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_50 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item becuymoney_100 = new Item(new FabricItemSettings().maxCount(50));
	public static final Item gold = new Item(new FabricItemSettings().maxCount(64));
	//除夕夜跨年
	public static final Block spring_festival_activity = new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	//方块相关
	public  static final Block FunctionBlocks_GreenScreen= new Block(FabricBlockSettings.create().strength(80.0f,1400.0f).nonOpaque());
	public static final Block  JoinGame = new Block(FabricBlockSettings.create().strength(80.0f, 1400.0f).nonOpaque());
	public static final Block kick = new Block(FabricBlockSettings.create().strength(46.00f, 1400.0f).nonOpaque());
	public static final Block gold_block = new Block(FabricBlockSettings.create().strength(2.0f, 1400.0f).nonOpaque().requiresTool());
	//tools
	public static final gold_weapon gold_weapon = new gold_weapon(new com.eric.tools.gold_weapon(),8,-0.8f,new Item.Settings());
	public static final Eric_052 Eric_052 = new Eric_052(new com.eric.tools.Eric_052(),60,-0.8f,new Item.Settings());
	public static final Ilikebvvd Ilikebvvd = new Ilikebvvd(new com.eric.tools.Ilikebvvd(),50,-0.8f,new Item.Settings());
	public static final wcn wcn = new wcn(new com.eric.tools.wcn(),55,-0.8f,new Item.Settings());
	public static final dengji1 dengji1 = new dengji1(new com.eric.tools.dengji1(),10,-0.8f,new Item.Settings());
	public static final dengji2 dengji2 = new dengji2(new com.eric.tools.dengji2(),15,-0.8f,new Item.Settings());
	public static final miaosha miaosha = new miaosha(new com.eric.tools.miaosha(),100,-0.8f,new Item.Settings());
	public static final miaoshamuch miaoshamuch = new miaoshamuch(new com.eric.tools.miaoshamuch(),1000,1f,new Item.Settings());
	@Override
	public void onInitialize() {
		//物品服务器相关
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_10"),becuymoney_10);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_1"),becuymoney_1);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_50"),becuymoney_50);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "becuymoney_100"),becuymoney_100);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold"),gold);
		//spring festival
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID,"spring_festival_activity"),spring_festival_activity) ;
		Registry.register(Registries.ITEM,new Identifier(MOD_ID,"spring_festival_activity"),new BlockItem(spring_festival_activity,new Item.Settings()));
		//方块相关
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "functionblocks_greenscreen"),FunctionBlocks_GreenScreen);
	        Registry.register(Registries.ITEM,new Identifier(MOD_ID, "functioblocks_greenscreen"),new BlockItem(FunctionBlocks_GreenScreen,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "joingame"),JoinGame);
		    Registry.register(Registries.ITEM, new Identifier(MOD_ID, "joingame"),new BlockItem(JoinGame,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "kick"),kick);
		    Registry.register(Registries.ITEM,new Identifier(MOD_ID, "kick"),new BlockItem(kick,new Item.Settings()));
        Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "gold_block"),gold_block);
			Registry.register(Registries.ITEM,new Identifier(MOD_ID, "gold_block"),new BlockItem(gold_block,new Item.Settings()));
        Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain1"),miantain);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain1"),new BlockItem(miantain,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain2"),miantain2);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain2"),new BlockItem(miantain2,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain3"),miantain3);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain3"),new BlockItem(miantain3,new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain4"),miantain4);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain4"),new BlockItem(miantain4, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain5"),miantain5);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain5"),new BlockItem(miantain5, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain6"),miantain6);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain6"),new BlockItem(miantain6, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain7"),miantain7);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain7"),new BlockItem(miantain7, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain8"),miantain8);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain8"),new BlockItem(miantain8, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain9"),miantain9);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain9"),new BlockItem(miantain9, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain10"),miantain10);
		  Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain10"),new BlockItem(miantain10, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain11"),miantain11);
		  Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain11"),new BlockItem(miantain11, new Item.Settings()));
		Registry.register(Registries.BLOCK,new Identifier(MOD_ID, "miantain12"),miantain12);
		   Registry.register(Registries.ITEM,new Identifier(MOD_ID, "miantain12"),new BlockItem(miantain12, new Item.Settings()));

		//tools
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_weapon"),gold_weapon);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eric_052"), Eric_052);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ilikebvvd"),Ilikebvvd);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wcn"),wcn);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dengji1"), dengji1);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dengji2"), dengji2);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miaosha"), miaosha);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "miaoshamuch"), miaoshamuch);
	}
}
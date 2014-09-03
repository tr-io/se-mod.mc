package com.camp.world;

import java.util.Random;

import com.camp.block.BlockManager;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreManager implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch(world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		//this.addOrSpawn(BlockManager.AsteroidBlock, world, random, i, j, 20, 20, 24, 12, 1, 12);
	}

	private void generateSurface(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		this.addOrSpawn(BlockManager.AsteroidBlock, world, random, i, j, 16, 16, 24, 24, 1, 64);
		this.mineSpawn(BlockManager.CobaltOre, world, random, i, j, 12, 12, 8, 8, 1, 16);
		this.mineSpawn(BlockManager.IridiumOre, world, random, i, j, 14, 14, 16, 16, 1, 36);
		this.mineSpawn(BlockManager.RutheniumOre, world, random, i, j, 10, 10, 4, 4, 1, 8);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	public void addOrSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		int maxPosY = minY + (maxY - 1);
		int diffBtwn = maxY - minY;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwn);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
	
	public void mineSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		int maxPosY = minY + (maxY - 1);
		int diffBtwn = maxY - minY;
		
		for (int i = 0; i < chancesToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwn);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenAsteroid(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
	
}

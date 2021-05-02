package featurecreep.ores;

import java.util.Random;

import featurecreep.FeatureCreepMC;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class RUBYWORLDGEN implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		
		switch(world.provider.dimensionId)
		{
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);

		}
		
		
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		// TODO Auto-generated method stub
for(int i = 0; i <5; i++) {
			int Xcoord = blockX + random.nextInt(16);
int Ycoord = random.nextInt(200);		
int Zcoord = blockZ + random.nextInt(16);

new WorldGenMinable(featurecreep.FeatureCreepMC.RUBY_ORE.blockID, 20).generate(world, random, Xcoord, Ycoord, Zcoord );
}
	
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	
	
	
	
	
	
}

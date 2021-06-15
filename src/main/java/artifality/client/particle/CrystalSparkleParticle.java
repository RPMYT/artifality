package artifality.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class CrystalSparkleParticle extends SpriteBillboardParticle {

    private final SpriteProvider spriteProvider;

    protected CrystalSparkleParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider) {
        super(world, x, y, z, 0, 0, 0);

        this.maxAge = 6 + this.random.nextInt(4);

        this.spriteProvider = spriteProvider;
        this.setSpriteForAge(spriteProvider);
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.age++ >= this.maxAge) {
            this.markDead();
        } else {
            this.setSpriteForAge(this.spriteProvider);
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_LIT;
    }

    @Environment(EnvType.CLIENT)
    public record Factory(SpriteProvider spriteProvider) implements ParticleFactory<DefaultParticleType> {

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {

            return new CrystalSparkleParticle(clientWorld, d, e, f, spriteProvider);
        }
    }
}
package abbanon.books.mixin;

import net.minecraft.item.EnchantedBookItem;
        import net.minecraft.item.ItemStack;
        import org.spongepowered.asm.mixin.Mixin;
        import org.spongepowered.asm.mixin.injection.At;
        import org.spongepowered.asm.mixin.injection.Inject;
        import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantedBookItem.class)
public class EnchantedBookItemMixin {

    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    public void removeGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}

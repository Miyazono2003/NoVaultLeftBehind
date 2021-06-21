package world.bentobox.novaultleftbehind;

import world.bentobox.bentobox.api.addons.Addon;
import world.bentobox.bentobox.hooks.VaultHook;

public class NoVaultLeftBehind extends Addon {

    @Override
    public void onEnable() {
        // This addon is simple - just attempt to hook Vault again
        // This relies on this addon being enabled FIRST
        if (!getPlugin().getHooks().getHook("Vault").isPresent()) {
            getLogger().info("Vault was not previously hooked when BentoBox was loading.");
            getLogger().info("Attempting to hook again, just in case...");
            getPlugin().getHooks().registerHook(new VaultHook());
        }
    }

    @Override
    public void onDisable() { }
}
package org.dreeam.leaf.event;

import org.bukkit.entity.Entity;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.NotNull;

public class EntityCacheHardCollisionEvent extends EntityEvent {
    private static final HandlerList handlers = new HandlerList();

    private boolean hardCollision;

    public EntityCacheHardCollisionEvent(@NotNull Entity entity, boolean hardCollision) {
        super(entity);
        this.hardCollision = hardCollision;
    }

    public boolean isHardCollision() {
        return hardCollision;
    }

    public void setHardCollision(boolean hardCollision) {
        this.hardCollision = hardCollision;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}

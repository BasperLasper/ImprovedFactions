package io.github.toberocat.improvedfactions.api.events

import io.github.toberocat.improvedfactions.factions.Faction
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Fired when a faction gets deleted.
 */
class FactionDeleteEvent(val faction: Faction) : Event() {
    override fun getHandlers(): HandlerList = handlerList

    companion object {
        @JvmStatic
        val handlerList = HandlerList()
    }
}

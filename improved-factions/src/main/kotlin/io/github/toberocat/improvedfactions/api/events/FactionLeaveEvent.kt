package io.github.toberocat.improvedfactions.api.events

import io.github.toberocat.improvedfactions.factions.Faction
import io.github.toberocat.improvedfactions.user.FactionUser
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * Fired when a player leaves a faction.
 */
class FactionLeaveEvent(val faction: Faction, val user: FactionUser) : Event() {
    override fun getHandlers(): HandlerList = handlerList

    companion object {
        @JvmStatic
        val handlerList = HandlerList()
    }
}

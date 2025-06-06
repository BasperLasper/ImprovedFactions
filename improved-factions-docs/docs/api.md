# API Usage

Improved Factions exposes a small API that can be used by other plugins.

## JitPack

The plugin is published on [JitPack](https://jitpack.io) so you can depend on it directly in your Gradle build.

```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.ToberoCat:ImprovedFactions:\${version}")
}
```

Replace `\${version}` with the desired release tag or commit.

## Available Methods

Use the `ImprovedFactionsAPI` object to interact with factions:

```kotlin
val faction = ImprovedFactionsAPI.getFaction("Knights")
```

You can also create factions programmatically:

```kotlin
ImprovedFactionsAPI.createFaction(player.uniqueId, "MyFaction")
```

## Events

Several Bukkit events are fired by the plugin:

- `FactionCreateEvent` – when a faction is created
- `FactionDeleteEvent` – when a faction is deleted
- `FactionJoinEvent` – when a player joins a faction
- `FactionLeaveEvent` – when a player leaves a faction

Listen to them as you would for any other Bukkit event.

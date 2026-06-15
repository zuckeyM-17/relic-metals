# Relic Metals

A Fabric mod for Minecraft that adds fantasy relic metals (mithril, etc.) and the gear forged from them.

A personal learning playground for Fabric mod development.

## Development

Requires JDK 25 (the current Fabric toolchain target).

```sh
./gradlew runClient
```

## Branch policy

Branches follow the **Minecraft version** they target (e.g. `26.1.2`), matching the convention used by Fabric Example Mod and major Fabric mods (Sodium, Iris, Lithium, etc.). The default branch is whichever Minecraft version is currently being developed against. No `main` branch is kept — when a new Minecraft version arrives, a new branch is cut from the previous one and becomes the new default. Older Minecraft versions continue to live on their own branches for back-port fixes.

## License

MIT — see [LICENSE](./LICENSE).

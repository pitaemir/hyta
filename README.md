# Legends of the Ascended - LOA

![Hytale](https://img.shields.io/badge/Game-Hytale-purple)
![Framework](https://img.shields.io/badge/Framework-ECS-blue)
![Language](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-In_Development-yellow)

A modular **RPG progression overhaul** for *Hytale*, focused on delivering deeper gameplay through **player leveling, equipment mastery, and ascension systems**.

This project is built using an **Entity Component System (ECS)** architecture, allowing scalability, maintainability, and easy expansion.

---

## Overview

**Legends of the Ascended** transforms the core gameplay loop into a continuous progression experience.

Players start as ordinary adventurers and evolve through:

- level-based progression (XP system)
- equipment mastery
- unlockable abilities
- advanced progression systems (Ascension)

The goal is to create a system where **every action contributes to player growth**.

---

## Features

✔ XP and leveling system  
✔ Configurable progression via XP table  
✔ Custom HUD (XP bar)  
✔ Persistent player data component  
✔ Event-driven ECS architecture  
✔ Debug and testing commands  
✔ Modular and expandable structure  

---

## System Architecture

The project follows an **ECS (Entity Component System)** design:

```
src/
│
├── main
│   Mod initialization
│
├── components
│   PlayerRPGComponent (player data)
│
├── systems
│   XPGainSystem
│   PlayerJoinSystem
│
├── events
│   GiveXPEvent
│   LevelUpEvent
│
├── handlers
│   LevelUpHandler
│
├── commands
│   Debug and control commands
│
├── ui
│   XP HUD interface
│
└── util
    XPTable and utilities
```

Each module encapsulates specific responsibilities, making the system easy to extend.

---

## Implemented Systems

### Player XP & Level System

- XP gain handled via events (`GiveXPEvent`)
- Level progression using a configurable table (`XPTable`)
- Automatic level-up handling
- Designed for scalability

---

### Player RPG Component

Stores persistent player data:

- current level  
- accumulated XP  
- progression state  

---

### ECS Systems

- **XPGainSystem** → handles XP logic  
- **PlayerJoinSystem** → initializes player data  
- **Event + Handler system** → decoupled logic   

---

### Commands

Used for testing and debugging:

- `/rpgxp` → grant XP  
- `/rpgstats` → display player stats   

---

## Planned Systems

### Equipment Mastery
- Weapons gain experience through usage  
- Unlock unique perks and abilities  
- Enables different playstyles  

---

### Ascension System
- Progression beyond level caps  
- Permanent upgrades and specialization  
- New layers of power  

---

### Ability System
- Active and passive skills  
- Synergy with weapons and progression  

---

### Dynamic Content
- Custom mobs  
- Scalable challenges  
- Progression-based objectives  

---

## Roadmap

- [x] Core XP system  
- [x] Level progression  
- [x] Player component  
- [x] XP HUD  
- [ ] Equipment mastery system  
- [ ] Ability system  
- [ ] Ascension system  
- [ ] Content expansion  
- [ ] Balancing & polish  

---

## Author

Project developed for practical study of:

- Game Systems Design  
- ECS Architecture  
- RPG Progression Systems  
- Hytale Mod Development  

---

## Vision

> *Forge your legend. Ascend beyond limits.*
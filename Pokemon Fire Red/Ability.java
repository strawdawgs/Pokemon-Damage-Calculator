public enum Ability{
    Overgrow(1.5, Type.Grass), Blaze(1.5, Type.Fire), Torrent(1.5, Type.Water), Shield_Dust(0, null), Shed_Skin(0, null), Compound_Eyes(1.3, null), 
    Swarm(1.5, Type.Bug), Keen_Eye(0, null), Run_Away(0, null), Guts(1.5, null), Intimidate(0.67, null), Static(0, null), Sand_Veil(0, null),
    Poison_Point(0, null), Cute_Charm(0, null), Flash_Fire(1.5, Type.Fire), Inner_Focus(0, null), Chlorophyll(2.0, null), Effect_Spore(0, null),
    Arena_Trap(0, null), Pick_Up(0, null), Limber(0, null), Damp(0, null), Cloud_Nine(0, null), Vital_Spirit(0, null), Water_Absorb(0, null),
    Synchronize(0, null), Clear_Body(0, null), Liquid_Ooze(0, null), Rock_Head(0, null), Sturdy(0, null), Oblivious(0, null), Own_Tempo(0, null),
    Magnet_Pull(0, null), Early_Bird(0, null), Thick_Fat(0, null), Stench(0, null), Sticky_Hold(0, null), Shell_Armor(0, null), Levitate(0, null),
    Insomnia(0, null), Hyper_Cutter(0, null), Soundproof(0, null), Lightning_Rod(1.5, null), Natural_Cure(0, null), Serene_Grace(0, null),
    Swift_Swim(2.0, null), Water_Veil(0, null), Illuminate(0, null), Flame_Body(0, null), Volt_Absorb(0, null), Trace(0, null), Battle_Armor(0, null),
    Pressure(0, null), Immunity(0, null);
    
    double modifier;
    Type type;
    private Ability(double modifier, Type type){
        this.modifier = modifier;
        this.type = type;
    }
}
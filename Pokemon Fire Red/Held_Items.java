public enum Held_Items {
    Black_Belt(1.1, Type.Fight), Black_Glasses(1.1, Type.Dark), Charcoal(1.1, Type.Fire), Choice_Band(1.5, null), Dragon_Fang(1.1, Type.Dragon), 
    Hard_Stone(1.1, Type.Rock), Light_Ball(2, null), Magnet(1.1, Type.Electric), Metal_Coat(1.1, Type.Steel), Metal_Powder(1.5, null), 
    Miracle_Seed(1.1, Type.Grass), Mystic_Water(1.1, Type.Water), Nevermeltice(1.1, Type.Ice), Poison_Barb(1.1, Type.Poison), Sea_Incense(1.2, Type.Water),
    Sharp_Beak(1.1, Type.Flying), Silk_Scarf(1.1, Type.Normal), Silver_Powder(1.1, Type.Bug), Soft_Sand(1.1, Type.Ground), Spell_Tag(1.1, Type.Ghost), 
    Thick_Club(2, null), Twisted_Spoon(1.1, Type.Psychic);

    double modifier;
    Type type;
    private Held_Items(double modifier, Type type){
        this.modifier = modifier;
        this.type = type;
    }
}

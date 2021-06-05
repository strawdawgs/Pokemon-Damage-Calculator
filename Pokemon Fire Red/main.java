class main{
    public static void main(String[] args){
        System.out.println("Welcome to the Kanto region!");
        /*
        1. choose attacking pokemon
            - set EVs, IVs, level, nature, ability, move, items and status
        2. choose defending pokemon
            - set EVs, IVs, level, nature, ability, items and status
        3. in the "calculateDamage" parameters
            - (move, attack/special attack stage, defeneding pokemon, defense/special defense stage, weather, screens)
        */
        Type.buildTypingMaps();
        Pokedex pokedex = new Pokedex();

        Pokemon tentacool = pokedex.Tentacool;
        tentacool.setLevel(50);
        tentacool.setAbility(Ability.Clear_Body);
        tentacool.setItem(Held_Items.Mystic_Water);
        tentacool.setMove(Move.Surf);
        tentacool.setNature(Nature.Timid);
        tentacool.setStatus(Status.Normal);
        tentacool.setHitpointsEV(0);
        tentacool.setAttackEV(0);
        tentacool.setDefenseEV(0);
        tentacool.setSpecialAttackEV(252);
        tentacool.setSpecialDefenseEV(4);
        tentacool.setSpeedEV(252);
        tentacool.setHitpointsIV(31);
        tentacool.setAttackIV(31);
        tentacool.setDefenseIV(31);
        tentacool.setSpecialAttackIV(31);
        tentacool.setSpecialDefenseIV(31);
        tentacool.setSpeedIV(31);

        Pokemon magnemite = pokedex.Magnemite;
        magnemite.setLevel(50);
        magnemite.setAbility(Ability.Sturdy);
        magnemite.setItem(Held_Items.Magnet);
        magnemite.setMove(Move.Thunder);
        magnemite.setNature(Nature.Calm);
        magnemite.setStatus(Status.Burn);
        magnemite.setHitpointsEV(252);
        magnemite.setAttackEV(0);
        magnemite.setDefenseEV(0);
        magnemite.setSpecialAttackEV(4);
        magnemite.setSpecialDefenseEV(252);
        magnemite.setSpeedEV(0);
        magnemite.setHitpointsIV(31);
        magnemite.setAttackIV(31);
        magnemite.setDefenseIV(31);
        magnemite.setSpecialAttackIV(31);
        magnemite.setSpecialDefenseIV(31);
        magnemite.setSpeedIV(31);

        Pokemon gastly = pokedex.Gastly;
        gastly.setLevel(50);
        gastly.setAbility(Ability.Levitate);
        gastly.setItem(null);
        gastly.setMove(null);
        gastly.setNature(null);
        gastly.setStatus(null);
        gastly.setHitpointsEV(0);
        gastly.setAttackEV(0);
        gastly.setDefenseEV(0);
        gastly.setSpecialAttackEV(0);
        gastly.setSpecialDefenseEV(0);
        gastly.setSpeedEV(0);
        gastly.setHitpointsIV(0);
        gastly.setAttackIV(0);
        gastly.setDefenseIV(0);
        gastly.setSpecialAttackIV(0);
        gastly.setSpecialDefenseIV(0);
        gastly.setSpeedIV(0);
        
        Pokemon jynx = pokedex.Jynx;
        jynx.setLevel(75);
        jynx.setAttackIV(31);
        jynx.setAttackEV(108);
        jynx.setMove(Move.Ice_Punch);

        Pokemon dragonite = pokedex.Dragonite;
        dragonite.setLevel(75);
        dragonite.setDefenseIV(21);

        double[] dmg;
        dmg = magnemite.calculateDamage(magnemite.move, 0, tentacool, 0, null, null);
        //dmg = jynx.calculateDamage(jynx.move1, 0, dragonite, 0, null, null);

        /*Calculate the percentage of damage*/

        System.out.println("Possible damage rolls:");
        for(int i=0; i<dmg.length; i++){
            if(i == dmg.length - 1)
                System.out.println(dmg[i]);
            else
                System.out.print(dmg[i] + ", ");
        }
    }
}
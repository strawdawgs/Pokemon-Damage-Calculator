import java.lang.Math;
public class Pokemon {
    final String name;
    final Type type1;
    final Type type2;
    final int pokedexNumber;
    final int evolutionStage;
    final double baseHitpoints;
    final double baseAttack;
    final double baseDefense;
    final double baseSpecialAttack;
    final double baseSpecialDefense;
    final double baseSpeed;
    final Ability[] possibleAbilities;
    Ability ability;
    Nature nature = Nature.Hardy;
    Held_Items item = null;
    Move move = null;
    Status status;
    String gender = "not set yet";
    double level = 1.0;
    double hitpointsIV = 0;
    double attackIV = 0;
    double defenseIV = 0;
    double specialAttackIV = 0;
    double specialDefenseIV = 0;
    double speedIV = 0;
    double hitpointsEV = 0;
    double attackEV = 0;
    double defenseEV = 0;
    double specialAttackEV = 0;
    double specialDefenseEV = 0;
    double speedEV = 0;
    double currentHitpointsStat;
    double actualHitpointsStat;
    double actualAttackStat;
    double actualDefenseStat;
    double actualSpecialAttackStat;
    double actualSpecialDefenseStat;
    double actualSpeedStat;
    double maxEVs = 508.0;
    double individualMaxEVs = 252.0;
    double currentEVs = 0.0;
    double maxIVs = 31.0;

    public Pokemon(String name, Type type1, Type type2, Ability[] possibleAbilities, int pokedexNumber, 
                   int evolutionStage, int baseHitpoints, int baseAttack, int baseDefense, 
                   int baseSpecialAttack, int baseSpecialDefense, int baseSpeed){
                this.name = name;
                this.type1 = type1;
                this.type2 = type2;
                this.pokedexNumber = pokedexNumber;
                this.evolutionStage = evolutionStage;
                this.baseHitpoints = baseHitpoints;
                this.baseAttack = baseAttack;
                this.baseDefense = baseDefense;
                this.baseSpecialAttack = baseSpecialAttack;
                this.baseSpecialDefense = baseSpecialDefense;
                this.baseSpeed = baseSpeed;
                this.possibleAbilities = possibleAbilities;
                setActualHPStat();
                setActualAttackStat();
                setActualDefenseStat();
                setActualSpecialAttackStat();
                setActualSpecialDefenseStat();
                setActualSpeedStat();
    }

    public String getName(){return this.name;}
    public Type getType1(){return this.type1;}
    public Type getType2(){return this.type2;}
    public int getPokedexNumber(){return this.pokedexNumber;}
    public int getEvolutionStage(){return this.evolutionStage;}
    public double getBaseHitpoints(){return this.baseHitpoints;}
    public double getBaseAttack(){return this.baseAttack;}
    public double getBaseDefense(){return this.baseDefense;}
    public double getBaseSpecialAttack(){return this.baseSpecialAttack;}
    public double getBaseSpecialDefense(){return this.baseSpecialDefense;}
    public double getBaseSpeed(){return this.baseSpeed;}
    public Ability[] getPossibleAbilities(){return this.possibleAbilities;}
    public Ability getAbility(){return this.ability;}
    public void setAbility(Ability ability){
        boolean canLearn = false;
        for(int i=0; i<possibleAbilities.length; i++){
            if(possibleAbilities[i] == ability)
              canLearn = true;
        }
        if(canLearn)
            this.ability = ability;
        else if(ability == null){
            System.out.println(this.name + "'s ability is set to null,");
            System.out.println(this.name + "'s possible abilities include:");
            for(int i=0; i<possibleAbilities.length; i++){
                if(i == possibleAbilities.length - 1){
                    System.out.println(possibleAbilities[i]);
                    System.exit(0);
                }
                else
                    System.out.print(possibleAbilities[i] + ", ");
            }
        }
        else{
            System.out.println(this.name + " cannot have the ability " + ability + ",");
            System.out.println(this.name + "'s possible abilities include:");
            for(int i=0; i<possibleAbilities.length; i++){
                if(i == possibleAbilities.length - 1){
                    System.out.println(possibleAbilities[i]);
                    System.exit(0);
                }
                else
                    System.out.print(possibleAbilities[i] + ", ");
            }
            System.exit(0);
        }
    }
    public Nature getNature(){return this.nature;}
    public void setNature(Nature nature){this.nature = nature;}
    public Held_Items getItem(){return this.item;}
    public void setItem(Held_Items item){this.item = item;}
    public Move getMove(){return this.move;}
    public void setMove(Move move){this.move = move;}
    public Status getStatus(){return this.status;}
    public void setStatus(Status status){this.status = status;}
    public String getGender(){return this.gender;}
    public void setGender(String gender){this.gender = gender;}
    public double getLevel(){return this.level;}
    public void setLevel(double level){
        if(level > 100){
            System.out.println("A Pokemon's level can't exceed 100.");
            System.out.println("You set " + this.name + "'s level to " + String.format("%.0f", level) + ".");
            System.exit(0);
        }
        if(level < 1){
            System.out.println("A Pokemon's level can't be set below 1.");
            System.out.println("You set " + this.name + "'s level to " + String.format("%.0f", level) + ".");
            System.exit(0);
        }
        this.level = level;
        setActualHPStat();
        setActualAttackStat();
        setActualDefenseStat();
        setActualSpecialAttackStat();
        setActualSpecialDefenseStat();
        setActualSpeedStat();
    }
    public double getHitpointsIV(){return this.hitpointsIV;}
    public void setHitpointsIV(double hitpointsIV){
        if(hitpointsIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s hp IV to " + String.format("%.0f", hitpointsIV) + ".");
            System.exit(0);
        }
        if(hitpointsIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s hp IV to " + String.format("%.0f", hitpointsIV) + ".");
            System.exit(0);
        }
        this.hitpointsIV = hitpointsIV; 
        setActualHPStat();    
    }
    public double getAttackIV(){return this.attackIV;}
    public void setAttackIV(double attackIV){
        if(attackIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s attack IV to " + String.format("%.0f", attackIV) + ".");
            System.exit(0);
        }
        if(attackIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s attack IV to " + String.format("%.0f", attackIV) + ".");
            System.exit(0);
        }
        this.attackIV = attackIV; 
        setActualAttackStat();
    }
    public double getDefenseIV(){return this.defenseIV;}
    public void setDefenseIV(double defenseIV){
        if(defenseIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s defense IV to " + String.format("%.0f", defenseIV) + ".");
            System.exit(0);
        }
        if(defenseIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s defense IV to " + String.format("%.0f", defenseIV) + ".");
            System.exit(0);
        }
        this.defenseIV = defenseIV;
        setActualDefenseStat();
    }
    public double getSpecialAttackIV(){return this.specialAttackIV;}
    public void setSpecialAttackIV(double specialAttackIV){
        if(specialAttackIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s special attack IV to " + String.format("%.0f", specialAttackIV) + ".");
            System.exit(0);
        }
        if(specialAttackIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s special attack IV to " + String.format("%.0f", specialAttackIV) + ".");
            System.exit(0);
        }
        this.specialAttackIV = specialAttackIV;
        setActualSpecialAttackStat();
    }
    public double getSpecialDefenseIV(){return this.specialDefenseIV;}
    public void setSpecialDefenseIV(double specialDefenseIV){
        if(specialDefenseIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s special defense IV to " + String.format("%.0f", specialDefenseIV) + ".");
            System.exit(0);
        }
        if(specialDefenseIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s special defense IV to " + String.format("%.0f", specialDefenseIV) + ".");
            System.exit(0);
        }
        this.specialDefenseIV = specialDefenseIV;
        setActualSpecialDefenseStat();
    }
    public double getSpeedIV(){return this.speedIV;}
    public void setSpeedIV(double speedIV){
        if(speedIV > maxIVs){
            System.out.println("The IV for a single stat can't exceed 31.");
            System.out.println("You set " + this.name + "'s speed IV to " + String.format("%.0f", speedIV) + ".");
            System.exit(0);
        }
        if(speedIV < 0){
            System.out.println("The IV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s speed IV to " + String.format("%.0f", speedIV) + ".");
            System.exit(0);
        }
        this.speedIV = speedIV;
        setActualSpeedStat();
    }
    public double getHitpointsEV(){return this.hitpointsEV;}
    public void setHitpointsEV(double hitpointsEV){
        if(hitpointsEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s hp EV to " + String.format("%.0f", hitpointsEV) + ".");
            System.exit(0);
        }
        if(hitpointsEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s hp EV to " + String.format("%.0f", hitpointsEV) + ".");
            System.exit(0);
        }
        currentEVs += hitpointsEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.hitpointsEV = hitpointsEV;
        setActualHPStat();
    }
    public double getAttackEV(){return this.attackEV;}
    public void setAttackEV(double attackEV){
        if(attackEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s attack EV to " + String.format("%.0f", attackEV) + ".");
            System.exit(0);
        }
        if(attackEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s attack EV to " + String.format("%.0f", attackEV) + ".");
            System.exit(0);
        }
        currentEVs += attackEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.attackEV = attackEV; 
        setActualAttackStat();
    }
    public double getDefenseEV(){return this.defenseEV;}
    public void setDefenseEV(double defenseEV){
        if(defenseEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s defense EV to " + String.format("%.0f", defenseEV) + ".");
            System.exit(0);
        }
        if(defenseEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s defense EV to " + String.format("%.0f", defenseEV) + ".");
            System.exit(0);
        }
        currentEVs += defenseEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.defenseEV = defenseEV;
        setActualDefenseStat();
    }
    public double getSpecialAttackEV(){return this.specialAttackEV;}
    public void setSpecialAttackEV(double specialAttackEV){
        if(specialAttackEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s special attack EV to " + String.format("%.0f", specialAttackEV) + ".");
            System.exit(0);
        }
        if(specialAttackEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s special attack EV to " + String.format("%.0f", specialAttackEV) + ".");
            System.exit(0);
        }
        currentEVs += specialAttackEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.specialAttackEV = specialAttackEV;
        setActualSpecialAttackStat();
    }
    public double getSpecialDefenseEV(){return this.specialDefenseEV;}
    public void setSpecialDefenseEV(double specialDefenseEV){
        if(specialDefenseEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s special defense EV to " + String.format("%.0f", specialDefenseEV) + ".");
            System.exit(0);
        }
        if(specialDefenseEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s special defense EV to " + String.format("%.0f", specialDefenseEV) + ".");
            System.exit(0);
        }
        currentEVs += specialDefenseEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.specialDefenseEV = specialDefenseEV;
        setActualSpecialDefenseStat();
    }
    public double getSpeedEV(){return this.speedEV;}
    public void setSpeedEV(double speedEV){
        if(speedEV > individualMaxEVs){
            System.out.println("The EV for a single stat can't exceed 252.");
            System.out.println("You set " + this.name + "'s speed EV to " + String.format("%.0f", speedEV) + ".");
            System.exit(0);
        }
        if(speedEV < 0){
            System.out.println("The EV for a single stat can't be set below 0.");
            System.out.println("You set " + this.name + "'s speed EV to " + String.format("%.0f", speedEV) + ".");
            System.exit(0);
        }
        currentEVs += speedEV;
        if(currentEVs > maxEVs){
            System.out.println("The max EVs for a single Pokemon can't exceed 508.");
            System.out.println("Check your EVs again.");
            System.exit(0);
        }
        this.speedEV = speedEV;
        setActualSpeedStat();
    }
    public double getCurrenHPStat(){return this.currentHitpointsStat;}
    public void setCurrentHPStat(double hitpoints){
        if(hitpoints > actualHitpointsStat){
            System.out.println("The current hp can't exceed the max hp.");
            System.out.println("You set " + this.name + "'s current hp to " + String.format("%.0f", hitpoints) + ",");
            System.out.println("it can't exceed " + this.actualHitpointsStat + ".");
            System.exit(0);
        }
        if(hitpoints < 1){
            System.out.println("A Pokemon's current hp can't be set below 1.");
            System.out.println("You set " + this.name + "'s current hp to " + String.format("%.0f", hitpoints) + ".");
            System.exit(0);
        }
        this.currentHitpointsStat = hitpoints;
    }
    private void setActualHPStat(){
        this.actualHitpointsStat = Math.floor(0.01 * ((2 * this.baseHitpoints) + this.hitpointsIV + Math.floor(0.25 * this.hitpointsEV)) * this.level) + this.level + 10;
    }
    private void setActualAttackStat(){
        if(this.nature == Nature.Lonely || this.nature == Nature.Adamant || this.nature == Nature.Naughty || this.nature == Nature.Brave){
            double temp =  Math.floor((0.01 * (((2 * this.baseAttack) + this.attackIV + Math.floor(0.25 * this.attackEV)) * this.level)) + 5);
            this.actualAttackStat =  Math.floor(temp + (temp * 0.1));
        }
        else if(this.nature == Nature.Bold || this.nature == Nature.Modest || this.nature == Nature.Calm || this.nature == Nature.Timid){
            double temp =  Math.floor((0.01 * (((2 * this.baseAttack) + this.attackIV + Math.floor(0.25 * this.attackEV)) * this.level)) + 5);
            this.actualAttackStat =  Math.floor(temp - (temp * 0.1));
        }
        else
            this.actualAttackStat = Math.floor((0.01 * (((2 * this.baseAttack) + this.attackIV + Math.floor(0.25 * this.attackEV)) * this.level)) + 5) * 1;
    }
    private void setActualDefenseStat(){
        if(this.nature == Nature.Bold || this.nature == Nature.Impish || this.nature == Nature.Lax || this.nature == Nature.Relaxed){
            double temp =  Math.floor((0.01 * (((2 * this.baseDefense) + this.defenseIV + Math.floor(0.25 * this.defenseEV)) * this.level)) + 5);
            this.actualDefenseStat =  Math.floor(temp + (temp * 0.1));
        }
        else if(this.nature == Nature.Lonely || this.nature == Nature.Mild || this.nature == Nature.Gentle || this.nature == Nature.Hasty){
            double temp =  Math.floor((0.01 * (((2 * this.baseDefense) + this.defenseIV + Math.floor(0.25 * this.defenseEV)) * this.level)) + 5);
            this.actualDefenseStat =  Math.floor(temp - (temp * 0.1));
        }
        else
            this.actualDefenseStat = Math.floor((0.01 * (((2 * this.baseDefense) + this.defenseIV + Math.floor(0.25 * this.defenseEV)) * this.level)) + 5) * 1;
    }
    private void setActualSpecialAttackStat(){
        if(this.nature == Nature.Modest || this.nature == Nature.Mild || this.nature == Nature.Rash || this.nature == Nature.Quiet){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpecialAttack) + this.specialAttackIV + Math.floor(0.25 * this.specialAttackEV)) * this.level)) + 5);
            this.actualSpecialAttackStat =  Math.floor(temp + (temp * 0.1));
        }
        else if(this.nature == Nature.Adamant || this.nature == Nature.Impish || this.nature == Nature.Careful || this.nature == Nature.Jolly){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpecialAttack) + this.specialAttackIV + Math.floor(0.25 * this.specialAttackEV)) * this.level)) + 5);
            this.actualSpecialAttackStat =  Math.floor(temp - (temp * 0.1));
        }
        else
            this.actualSpecialAttackStat = Math.floor((0.01 * (((2 * this.baseSpecialAttack) + this.specialAttackIV + Math.floor(0.25 * this.specialAttackEV)) * this.level)) + 5) * 1;
    }
    private void setActualSpecialDefenseStat(){
        if(this.nature == Nature.Calm || this.nature == Nature.Gentle || this.nature == Nature.Careful || this.nature == Nature.Sassy){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpecialDefense) + this.specialDefenseIV + Math.floor(0.25 * this.specialDefenseEV)) * this.level)) + 5);
            this.actualSpecialDefenseStat =  Math.floor(temp + (temp * 0.1));
        }
        else if(this.nature == Nature.Naughty || this.nature == Nature.Lax || this.nature == Nature.Rash || this.nature == Nature.Naive){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpecialDefense) + this.specialDefenseIV + Math.floor(0.25 * this.specialDefenseEV)) * this.level)) + 5);
            this.actualSpecialDefenseStat =  Math.floor(temp - (temp * 0.1));
        }
        else
            this.actualSpecialDefenseStat = Math.floor((0.01 * (((2 * this.baseSpecialDefense) + this.specialDefenseIV + Math.floor(0.25 * this.specialDefenseEV)) * this.level)) + 5) * 1;
    }
    private void setActualSpeedStat(){
        if(this.nature == Nature.Timid || this.nature == Nature.Hasty || this.nature == Nature.Jolly || this.nature == Nature.Naive){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpeed) + this.speedIV + Math.floor(0.25 * this.speedEV)) * this.level)) + 5);
            this.actualSpeedStat =  Math.floor(temp + (temp * 0.1));
            if(this.status == Status.Paralyzed)
                this.actualSpeedStat *= 0.5;
        }
        else if(this.nature == Nature.Brave || this.nature == Nature.Relaxed || this.nature == Nature.Quiet || this.nature == Nature.Sassy){
            double temp =  Math.floor((0.01 * (((2 * this.baseSpeed) + this.speedIV + Math.floor(0.25 * this.speedEV)) * this.level)) + 5);
            this.actualSpeedStat =  Math.floor(temp - (temp * 0.1));
        }
        else
            this.actualSpeedStat = Math.floor((0.01 * (((2 * this.baseSpeed) + this.speedIV + Math.floor(0.25 * this.speedEV)) * this.level)) + 5) * 1;
    }

    public double[] calculateDamage(Move move, int attackStage, Pokemon opponentPokemon, int defenseStage, Weather weather, Move fieldMove){
        double baseDamage = 1.0;
        double numberOfTargets = 1.0;
        double weatherModifier = 1.0;
        double stabModifier = 1.0;
        double typeModifier = 1.0;
        double burnModifier = 1.0;
        double moveModifier = 1.0;
        double abilityModifier = 1.0;
        double itemModifier = 1.0;
        double finalModifier = 1.0;
        double attackStageModifier = 1.0;
        double defenseStageModifier = 1.0;

        for(Type listTypes : Type.noEffectMap.get(move.type)){
            if(opponentPokemon.type1.equals(listTypes) || opponentPokemon.type2.equals(listTypes)){
                System.out.println(this.move + " has no effect on " + opponentPokemon.name + "'s type.");
                return new double[]{0};
            }
        }
        for(Type listType : Type.superEffectiveMap.get(move.type)){
            if(opponentPokemon.type1.equals(listType))
                typeModifier *= 2.0;
        }
        for(Type listType : Type.superEffectiveMap.get(move.type)){
            if(opponentPokemon.type2 != null && opponentPokemon.type2.equals(listType))
                typeModifier *= 2.0;
        }
        for(Type listType : Type.notEffectiveMap.get(move.type)){
            if(typeModifier == 4.0)
                break;
            if(opponentPokemon.type1.equals(listType))
                typeModifier *= 0.5;
        }
        for(Type listType : Type.notEffectiveMap.get(move.type)){
            if(typeModifier == 4.0)
                break;
            if(opponentPokemon.type2 != null && opponentPokemon.type2.equals(listType))
                typeModifier *= 0.5;
        }

        if(typeModifier == 2.0)
            System.out.println(this.move + " is super effective against " + opponentPokemon.name + ".");
        else if(typeModifier == 4.0)
            System.out.println(this.move + " is double super effective against " + opponentPokemon.name + ".");
        else if(typeModifier == 0.5)
            System.out.println(this.move + " is not that effective against " + opponentPokemon.name + ".");
        else if(typeModifier == 0.25)
            System.out.println(this.move + " is not effective against " + opponentPokemon.name + ".");
        else
            System.out.println(this.move + " is effective against " + opponentPokemon.name + ".");

        switch(attackStage){
            case -6: attackStageModifier = 0.25; break;
            case -5: attackStageModifier = 0.28; break;
            case -4: attackStageModifier = 0.33; break;
            case -3: attackStageModifier = 0.4; break;
            case -2: attackStageModifier = 0.5; break;
            case -1: attackStageModifier = 0.67; break;
            case 0: attackStageModifier = 1.0; break;
            case 1: attackStageModifier = 1.5; break;
            case 2: attackStageModifier = 2.0; break;
            case 3: attackStageModifier = 2.5; break;
            case 4: attackStageModifier = 3.0; break;
            case 5: attackStageModifier = 3.5; break;
            case 6: attackStageModifier = 4.0; break;
        }

        switch(defenseStage){
            case -6: defenseStageModifier = 0.25; break;
            case -5: defenseStageModifier = 0.28; break;
            case -4: defenseStageModifier = 0.33; break;
            case -3: defenseStageModifier = 0.4; break;
            case -2: defenseStageModifier = 0.5; break;
            case -1: defenseStageModifier = 0.67; break;
            case 0: defenseStageModifier = 1.0; break;
            case 1: defenseStageModifier = 1.5; break;
            case 2: defenseStageModifier = 2.0; break;
            case 3: defenseStageModifier = 2.5; break;
            case 4: defenseStageModifier = 3.0; break;
            case 5: defenseStageModifier = 3.5; break;
            case 6: defenseStageModifier = 4.0; break;
        }

        if(move.type.equals(this.type1) || move.type.equals(this.type2)){
            System.out.println(this.name + " receives a STAB bonus from this attack.");
            stabModifier = 1.5;
        }

        if(weather != null && weather.equals(Weather.Rain)){
            if(move.type.equals(Type.Water)){
                System.out.println("The rain boosts this moves' power.");
                weatherModifier = 1.5;
            }
            else if(move.type.equals(Type.Fire)){
                System.out.println("The rain lessens this moves' power.");
                weatherModifier = 0.5;
            }
        }
        if(weather != null && weather.equals(Weather.Sun)){
            if(move.type.equals(Type.Fire)){
                System.out.println("The sun boosts this moves' power.");
                weatherModifier = 1.5;
            }
            else if(move.type.equals(Type.Water)){
                System.out.println("The sun lessens this moves' power.");
                weatherModifier = 0.5;
            }
        }
        if(weather != null && weather.equals(Weather.Sandstorm) && opponentPokemon.type1 == Type.Ground || 
           weather != null && weather.equals(Weather.Sandstorm) && opponentPokemon.type2 != null && opponentPokemon.type2 == Type.Ground){
                System.out.println("The sandstorm raises " + opponentPokemon.name + "'s special defense stat.");
                opponentPokemon.actualSpecialDefenseStat *= 1.5;
        }

        if(move.category == Move_Cat.Physical && this.status == Status.Burn){
            System.out.println(this.name + " is burned and it's attack is cut in half.");
            burnModifier = 0.5;
        }
        if(fieldMove != null && fieldMove == Move.Reflect && move.category == Move_Cat.Physical){
            System.out.println("Reflect cuts the physical attack's power in half.");
            moveModifier = 0.5;
        }
        else if(fieldMove != null && fieldMove == Move.Light_Screen && move.category == Move_Cat.Special){
            System.out.println("Light Screen cuts the special attack's power in half.");
            moveModifier = 0.5;
        }

        if(this.item != null){
            if(this.item == Held_Items.Light_Ball && this.pokedexNumber == 25)
                itemModifier = this.item.modifier;
            else if(this.item == Held_Items.Thick_Club && (this.pokedexNumber == 104 || this.pokedexNumber == 105))
                itemModifier = this.item.modifier;
            else if(this.item == Held_Items.Metal_Powder && this.pokedexNumber == 132)
                itemModifier = this.item.modifier;
            else if(this.item == Held_Items.Choice_Band)
                itemModifier = this.item.modifier;
            else if(this.item.type == move.type)
                itemModifier = this.item.modifier;
        }

        double thirtyPercent = this.actualHitpointsStat * 0.3;
        if(this.currentHitpointsStat <= thirtyPercent && this.ability != null && this.ability == Ability.Overgrow && move.type == Type.Grass)
            move.power *= this.ability.modifier;
        else if(this.currentHitpointsStat <= thirtyPercent && this.ability != null && this.ability == Ability.Blaze && move.type == Type.Fire)
            move.power *= this.ability.modifier;
        else if(this.currentHitpointsStat <= thirtyPercent && this.ability != null && this.ability == Ability.Torrent && move.type == Type.Water)
            move.power *= this.ability.modifier;
        else if(this.currentHitpointsStat <= thirtyPercent && this.ability != null && this.ability == Ability.Swarm && move.type == Type.Bug)
            move.power *= this.ability.modifier;

        //var baseDamage = Math.floor(Math.floor((Math.floor((2 * lv) / 5 + 2) * at * bp) / df) / 50);
        finalModifier = numberOfTargets * weatherModifier * stabModifier * typeModifier * burnModifier * attackStageModifier * defenseStageModifier * (moveModifier * abilityModifier * itemModifier);
        if(move.category == Move_Cat.Physical)
            baseDamage = Math.floor((Math.floor(Math.floor(Math.floor((2.0 * this.level) / 5.0 + 2.0) * move.power * this.actualAttackStat / opponentPokemon.actualDefenseStat) / 50.0) + 2.0) * finalModifier);
        else
            baseDamage = Math.floor((Math.floor(Math.floor(Math.floor((2.0 * this.level) / 5.0 + 2.0) * move.power * this.actualSpecialAttackStat / opponentPokemon.actualSpecialDefenseStat) / 50.0) + 2.0) * finalModifier);
        
        double[] resultDamage = new double[16];
        for(int i=85; i<=100; i++)
            resultDamage[i-85] = Math.max(1, Math.floor((baseDamage * i) / 100));

        return resultDamage;
    }
}
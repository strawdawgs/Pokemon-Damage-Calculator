import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public enum Type {
    Bug, Dark, Dragon, Electric, Fight, Fire, Flying, Ghost, 
    Grass, Ground, Ice, Normal, Poison, Psychic, Rock, Steel, Water;

    final static Map<Type, ArrayList<Type>> superEffectiveMap = new HashMap<>();
    final static Map<Type, ArrayList<Type>> notEffectiveMap = new HashMap<>();
    final static Map<Type, ArrayList<Type>> noEffectMap = new HashMap<>();

    public static void buildTypingMaps(){
        buildSuperEffectiveMap();
        buildNotEffectiveMap();
        buildNoEffectMap();
    }

    static void buildSuperEffectiveMap(){
        superEffectiveMap.put(Type.Bug, new ArrayList<Type>(){{add(Type.Grass); add(Type.Psychic); add(Type.Dark);}});
        superEffectiveMap.put(Type.Dark, new ArrayList<Type>(){{add(Type.Psychic); add(Type.Ghost);}});
        superEffectiveMap.put(Type.Dragon, new ArrayList<Type>(){{add(Type.Dragon);}});
        superEffectiveMap.put(Type.Electric, new ArrayList<Type>(){{add(Type.Water); add(Type.Flying);}});
        superEffectiveMap.put(Type.Fight, new ArrayList<Type>(){{add(Type.Normal); add(Type.Ice); add(Type.Rock); add(Type.Dark); add(Type.Steel);}});
        superEffectiveMap.put(Type.Fire, new ArrayList<Type>(){{add(Type.Grass); add(Type.Ice); add(Type.Bug); add(Type.Steel);}});
        superEffectiveMap.put(Type.Flying, new ArrayList<Type>(){{add(Type.Grass); add(Type.Fight); add(Type.Bug);}});
        superEffectiveMap.put(Type.Ghost, new ArrayList<Type>(){{add(Type.Ghost); add(Type.Psychic);}});
        superEffectiveMap.put(Type.Grass, new ArrayList<Type>(){{add(Type.Water); add(Type.Ground); add(Type.Rock);}});
        superEffectiveMap.put(Type.Ground, new ArrayList<Type>(){{add(Type.Fire); add(Type.Electric); add(Type.Poison); add(Type.Rock); add(Type.Steel);}});
        superEffectiveMap.put(Type.Ice, new ArrayList<Type>(){{add(Type.Grass); add(Type.Ground); add(Type.Flying); add(Type.Dragon);}});
        superEffectiveMap.put(Type.Normal, new ArrayList<Type>(){{}});
        superEffectiveMap.put(Type.Poison, new ArrayList<Type>(){{add(Type.Grass);}});
        superEffectiveMap.put(Type.Psychic, new ArrayList<Type>(){{add(Type.Fight); add(Type.Poison);}});
        superEffectiveMap.put(Type.Rock, new ArrayList<Type>(){{add(Type.Fire); add(Type.Flying); add(Type.Ice); add(Type.Bug);}});
        superEffectiveMap.put(Type.Steel, new ArrayList<Type>(){{add(Type.Ice); add(Type.Rock);}});
        superEffectiveMap.put(Type.Water, new ArrayList<Type>(){{add(Type.Fire); add(Type.Ground); add(Type.Rock);}});
    }
    static void buildNotEffectiveMap(){
        notEffectiveMap.put(Type.Bug, new ArrayList<Type>(){{add(Type.Fire); add(Type.Fight); add(Type.Poison); add(Type.Flying); add(Type.Ghost); add(Type.Steel);}});
        notEffectiveMap.put(Type.Dark, new ArrayList<Type>(){{add(Type.Fight); add(Type.Dark);}});
        notEffectiveMap.put(Type.Dragon, new ArrayList<Type>(){{add(Type.Steel);}});
        notEffectiveMap.put(Type.Electric, new ArrayList<Type>(){{add(Type.Electric); add(Type.Grass); add(Type.Dragon);}});
        notEffectiveMap.put(Type.Fight, new ArrayList<Type>(){{add(Type.Poison); add(Type.Flying); add(Type.Psychic); add(Type.Bug);}});
        notEffectiveMap.put(Type.Fire, new ArrayList<Type>(){{add(Type.Fire); add(Type.Water); add(Type.Rock); add(Type.Dragon);}});
        notEffectiveMap.put(Type.Flying, new ArrayList<Type>(){{add(Type.Electric); add(Type.Rock); add(Type.Steel);}});
        notEffectiveMap.put(Type.Ghost, new ArrayList<Type>(){{add(Type.Dark);}});
        notEffectiveMap.put(Type.Grass, new ArrayList<Type>(){{add(Type.Fire); add(Type.Grass); add(Type.Poison); add(Type.Flying); add(Type.Bug); add(Type.Dragon); add(Type.Steel);}});
        notEffectiveMap.put(Type.Ground, new ArrayList<Type>(){{add(Type.Bug); add(Type.Grass);}});
        notEffectiveMap.put(Type.Ice, new ArrayList<Type>(){{add(Type.Fire); add(Type.Water); add(Type.Ice); add(Type.Steel);}});
        notEffectiveMap.put(Type.Normal, new ArrayList<Type>(){{add(Type.Rock); add(Type.Steel);}});
        notEffectiveMap.put(Type.Poison, new ArrayList<Type>(){{add(Type.Poison); add(Type.Ground); add(Type.Rock); add(Type.Ghost);}});
        notEffectiveMap.put(Type.Psychic, new ArrayList<Type>(){{add(Type.Psychic); add(Type.Steel);}});
        notEffectiveMap.put(Type.Rock, new ArrayList<Type>(){{add(Type.Fight); add(Type.Ground); add(Type.Steel);}});
        notEffectiveMap.put(Type.Steel, new ArrayList<Type>(){{add(Type.Fire); add(Type.Water); add(Type.Electric); add(Type.Steel);}});
        notEffectiveMap.put(Type.Water, new ArrayList<Type>(){{add(Type.Water); add(Type.Grass); add(Type.Dragon);}});
    }
    static void buildNoEffectMap(){
        noEffectMap.put(Type.Bug, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Dark, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Dragon, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Electric, new ArrayList<Type>(){{add(Type.Ground);}});
        noEffectMap.put(Type.Fight, new ArrayList<Type>(){{add(Type.Ghost);}});
        noEffectMap.put(Type.Fire, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Flying, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Ghost, new ArrayList<Type>(){{add(Type.Normal);}});
        noEffectMap.put(Type.Grass, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Ground, new ArrayList<Type>(){{add(Type.Flying);}});
        noEffectMap.put(Type.Ice, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Normal, new ArrayList<Type>(){{add(Type.Ghost);}});
        noEffectMap.put(Type.Poison, new ArrayList<Type>(){{add(Type.Steel);}});
        noEffectMap.put(Type.Psychic, new ArrayList<Type>(){{add(Type.Dark);}});
        noEffectMap.put(Type.Rock, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Steel, new ArrayList<Type>(){{}});
        noEffectMap.put(Type.Water, new ArrayList<Type>(){{}});
    }
}
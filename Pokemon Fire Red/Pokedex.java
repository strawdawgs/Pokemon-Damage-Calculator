public class Pokedex{
    public Pokedex(){
    }
    Pokemon Bulbasaur = new Pokemon("Bublasaur", Type.Grass, Type.Poison, new Ability[]{Ability.Overgrow},
                                    1, 1, 45, 49, 49, 65, 65, 45);
    Pokemon Ivysaur = new Pokemon("Ivysaur", Type.Grass, Type.Poison, new Ability[]{Ability.Overgrow},
                                  2, 2, 60, 62, 63, 80, 80, 60);
    Pokemon Venusaur = new Pokemon("Vanusaur", Type.Grass, Type.Poison, new Ability[]{Ability.Overgrow},
                                   3, 3, 80, 82, 83, 100, 100, 80);
    Pokemon Charmander = new Pokemon("Charmander", Type.Fire, null, new Ability[]{Ability.Blaze},
                                     4, 1, 39, 52, 43, 60, 50, 65);
    Pokemon Charmeleon = new Pokemon("Charmeleon", Type.Fire, null, new Ability[]{Ability.Blaze},
                                     5, 2, 58, 64, 58, 80, 65, 80);
    Pokemon Charizard = new Pokemon("Charizard", Type.Fire, Type.Flying, new Ability[]{Ability.Blaze},
                                    6, 3, 78, 84, 78, 109, 85, 100);
    Pokemon Squirtle = new Pokemon("Squirtle", Type.Water, null, new Ability[]{Ability.Torrent},
                                   7, 1, 44, 48, 65, 50, 64, 43);
    Pokemon Wartortle = new Pokemon("Wartortle", Type.Water, null, new Ability[]{Ability.Torrent},
                                    8, 2, 59, 63, 80, 65, 80, 58);
    Pokemon Blastoise = new Pokemon("Blastoise", Type.Water, null, new Ability[]{Ability.Torrent},
                                    9, 3, 79, 83, 100, 85, 105, 78);
    Pokemon Caterpie = new Pokemon("Caterpie", Type.Bug, null, new Ability[]{Ability.Shield_Dust},
                                   10, 1, 45, 30, 35, 20, 20, 45);
    Pokemon Metapod = new Pokemon("Metapod", Type.Bug, null, new Ability[]{Ability.Shed_Skin},
                                  11, 2, 50, 20, 55, 25, 25, 30);
    Pokemon Butterfree = new Pokemon("Butterfree", Type.Bug, Type.Flying, new Ability[]{Ability.Compound_Eyes},
                                     12, 3, 60, 45, 50, 80, 80, 70);
    Pokemon Weedle = new Pokemon("Weedle", Type.Bug, Type.Poison, new Ability[]{Ability.Shield_Dust},
                                 13, 1, 40, 35, 30, 20, 20, 50);
    Pokemon Kakuna = new Pokemon("Kakuna", Type.Bug, Type.Poison, new Ability[]{Ability.Shed_Skin},
                                 14, 2, 45, 25, 50, 25, 25, 35);
    Pokemon Beedrill = new Pokemon("Beedrill", Type.Bug, Type.Poison, new Ability[]{Ability.Swarm},
                                   15, 3, 65, 80, 40, 45, 80, 75);
    Pokemon Pidgey = new Pokemon("Pidgey", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye},
                                 16, 1, 40, 45, 40, 35, 35, 56);
    Pokemon Pidgeotto = new Pokemon("Pidgeotto", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye},
                                    17, 2, 63, 60, 55, 50, 50, 71);
    Pokemon Pidgeot = new Pokemon("Pidgeot", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye},
                                  18, 3, 83, 80, 75, 70, 70, 91);
    Pokemon Rattata = new Pokemon("Rattata", Type.Normal, null, new Ability[]{Ability.Run_Away, Ability.Guts},
                                  19, 1, 30, 56, 35, 25, 35, 72);
    Pokemon Raticate = new Pokemon("Raticate", Type.Normal, null, new Ability[]{Ability.Run_Away, Ability.Guts},
                                   20, 2, 55, 81, 60, 50, 70, 97);
    Pokemon Spearow = new Pokemon("Spearow", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye},
                                  21, 1, 40, 60, 30, 31, 31, 70);
    Pokemon Fearow = new Pokemon("Fearow", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye},
                                 22, 2, 65, 90, 65, 61, 61, 100);
    Pokemon Ekans = new Pokemon("Ekans", Type.Poison, null, new Ability[]{Ability.Shed_Skin, Ability.Intimidate},
                                23, 1, 35, 60, 44, 40, 54, 55);
    Pokemon Arbok = new Pokemon("Arbok", Type.Poison, null, new Ability[]{Ability.Shed_Skin, Ability.Intimidate},
                                24, 2, 60, 85, 69, 65, 79, 80);
    Pokemon Pikachu = new Pokemon("Pikachu", Type.Electric, null, new Ability[]{Ability.Static},
                                  25, 1, 35, 55, 30, 50, 40, 90);
    Pokemon Raichu = new Pokemon("Raichu", Type.Electric, null, new Ability[]{Ability.Static},
                                 26, 2, 60, 90, 55, 90, 80, 100);
    Pokemon Sandshrew = new Pokemon("Sandshrew", Type.Ground, null, new Ability[]{Ability.Sand_Veil},
                                    27, 1, 50, 75, 85, 20, 30, 40);
    Pokemon Sandslash = new Pokemon("Sandslash", Type.Ground, null, new Ability[]{Ability.Sand_Veil},
                                    28, 2, 75, 100, 110, 45, 55, 65);
    Pokemon Nidoran_F = new Pokemon("Nidoran Female", Type.Poison, null, new Ability[]{Ability.Poison_Point},
                                    29, 1, 55, 47, 52, 40, 40, 41);
    Pokemon Nidorina = new Pokemon("Nidorina", Type.Poison, null, new Ability[]{Ability.Poison_Point},
                                   30, 2, 70, 62, 67, 55, 55, 56);
    Pokemon Nidoqueen = new Pokemon("Nidoqueen", Type.Poison, Type.Ground, new Ability[]{Ability.Poison_Point},
                                    31, 3, 90, 82, 87, 75, 85, 76);
    Pokemon Nidoran_M = new Pokemon("Nidoran Male", Type.Poison, null, new Ability[]{Ability.Poison_Point},
                                    32, 1, 46, 57, 40, 40, 40, 50);
    Pokemon Nidorino = new Pokemon("Nidorino", Type.Poison, null, new Ability[]{Ability.Poison_Point},
                                   33, 2, 61, 72, 57, 55, 55, 65);
    Pokemon Nidoking = new Pokemon("Nidoking", Type.Poison, Type.Ground, new Ability[]{Ability.Poison_Point},
                                   34, 3, 81, 92, 77, 85, 75, 85);
    Pokemon Clefairy = new Pokemon("Clefairy", Type.Normal, null, new Ability[]{Ability.Cute_Charm},
                                   35, 1, 70, 45, 48, 60, 65, 35);
    Pokemon Clefable = new Pokemon("Clefable", Type.Normal, null, new Ability[]{Ability.Cute_Charm},
                                   36, 2, 95, 70, 73, 85, 90, 60);
    Pokemon Vulpix = new Pokemon("Vulpix", Type.Fire, null, new Ability[]{Ability.Flash_Fire},
                                 37, 1, 38, 41, 40, 50, 65, 65);
    Pokemon Ninetales = new Pokemon("Ninetales", Type.Fire, null, new Ability[]{Ability.Flash_Fire},
                                    38, 2, 73, 76, 75, 81, 100, 100);
    Pokemon Jigglypuff = new Pokemon("Jigglypuff", Type.Normal, null, new Ability[]{Ability.Cute_Charm},
                                     39, 1, 115, 45, 20, 45, 25, 20);
    Pokemon Wigglytuff = new Pokemon("Wigglytuff", Type.Normal, null, new Ability[]{Ability.Cute_Charm},
                                     40, 2, 140, 70, 45, 75, 50, 45);
    Pokemon Zubat = new Pokemon("Zubat", Type.Poison, Type.Flying, new Ability[]{Ability.Inner_Focus},
                                41, 1, 40, 45, 35, 30, 40, 55);
    Pokemon Golbat = new Pokemon("Golbat", Type.Poison, Type.Flying, new Ability[]{Ability.Inner_Focus},
                                 42, 2, 75, 80, 70, 65, 75, 90);
    Pokemon Oddish = new Pokemon("Oddish", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                 43, 1, 45, 50, 55, 75, 65, 30);
    Pokemon Gloom = new Pokemon("Gloom", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                44, 2, 60, 65, 70, 85, 75, 40);
    Pokemon Vileplume = new Pokemon("Vileplume", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                    45, 3, 75, 80, 85, 100, 90, 50);
    Pokemon Paras = new Pokemon("Paras", Type.Bug, Type.Grass, new Ability[]{Ability.Effect_Spore},
                                46, 1, 35, 70, 55, 45, 55, 25);
    Pokemon Parasect = new Pokemon("Parasect", Type.Bug, Type.Grass, new Ability[]{Ability.Effect_Spore},
                                   47, 2, 60, 95, 80, 60, 80, 30);
    Pokemon Venonat = new Pokemon("Venonat", Type.Bug, Type.Poison, new Ability[]{Ability.Compound_Eyes},
                                  48, 1, 60, 55, 50, 40, 55, 45);
    Pokemon Venomoth = new Pokemon("Venomoth", Type.Bug, Type.Poison, new Ability[]{Ability.Shield_Dust},
                                   49, 2, 70, 65, 60, 90, 75, 90);
    Pokemon Diglett = new Pokemon("Diglett", Type.Ground, null, new Ability[]{Ability.Sand_Veil, Ability.Arena_Trap},
                                  50, 1, 10, 55, 25, 35, 45, 95);
    Pokemon Dugtrio = new Pokemon("Dugtrio", Type.Ground, null, new Ability[]{Ability.Sand_Veil, Ability.Arena_Trap},
                                  51, 2, 35, 80, 50, 50, 70, 120);
    Pokemon Meowth = new Pokemon("Meowth", Type.Normal, null, new Ability[]{Ability.Pick_Up},
                                 52, 1, 40, 45, 35, 40, 40, 90);
    Pokemon Persian = new Pokemon("Persian", Type.Normal, null, new Ability[]{Ability.Limber},
                                  53, 2, 65, 70, 60, 65, 65, 115);
    Pokemon Psyduck = new Pokemon("Psyduck", Type.Water, null, new Ability[]{Ability.Damp, Ability.Cloud_Nine},
                                  54, 1, 50, 52, 48, 65, 50, 55);
    Pokemon Golduck = new Pokemon("Golduck", Type.Water, null, new Ability[]{Ability.Damp, Ability.Cloud_Nine},
                                  55, 2, 80, 82, 78, 95, 80, 85);
    Pokemon Mankey = new Pokemon("Mankey", Type.Fight, null, new Ability[]{Ability.Vital_Spirit},
                                 56, 1, 40, 80, 35, 35, 45, 70);
    Pokemon Primeape = new Pokemon("Primeape", Type.Fight, null, new Ability[]{Ability.Vital_Spirit},
                                   57, 2, 65, 105, 60, 60, 70, 95);
    Pokemon Growlithe = new Pokemon("Growlithe", Type.Fire, null, new Ability[]{Ability.Intimidate, Ability.Flash_Fire},
                                    58, 1, 55, 70, 45, 70, 50, 60);
    Pokemon Arcanine = new Pokemon("Arcanine", Type.Fire, null, new Ability[]{Ability.Intimidate, Ability.Flash_Fire},
                                   59, 2, 90, 110, 80, 100, 80, 95);
    Pokemon Polywag = new Pokemon("polywag", Type.Water, null, new Ability[]{Ability.Damp, Ability.Water_Absorb},
                                  60, 1, 40, 50, 40, 40, 40, 90);
    Pokemon Polywhirl = new Pokemon("Polywhirl", Type.Water, null, new Ability[]{Ability.Damp, Ability.Water_Absorb},
                                    61, 2, 65, 65, 65, 50, 50, 90);
    Pokemon Polywrath = new Pokemon("Polywrath", Type.Water, Type.Fight, new Ability[]{Ability.Damp, Ability.Water_Absorb},
                                    62, 3, 90, 85, 95, 70, 90, 70);
    Pokemon Abra = new Pokemon("Abra", Type.Psychic, null, new Ability[]{Ability.Synchronize, Ability.Inner_Focus},
                               63, 1, 25, 20, 15, 105, 55, 90);
    Pokemon Kadabra = new Pokemon("Kadabra", Type.Psychic, null, new Ability[]{Ability.Synchronize, Ability.Inner_Focus},
                                  64, 2, 40, 35, 30, 120, 70, 105);
    Pokemon Alakazam = new Pokemon("Alakazam", Type.Psychic, null, new Ability[]{Ability.Synchronize, Ability.Inner_Focus},
                                   65, 3, 55, 50, 45, 135, 85, 120);
    Pokemon Machop = new Pokemon("Machop", Type.Fight, null, new Ability[]{Ability.Guts},
                                 66, 1, 70, 80, 50, 35, 35, 35);
    Pokemon Machoke = new Pokemon("Machoke", Type.Fight, null, new Ability[]{Ability.Guts},
                                  67, 2, 80, 100, 70, 50, 60, 45);
    Pokemon Machamp = new Pokemon("Machamp", Type.Fight, null, new Ability[]{Ability.Guts},
                                  68, 3, 90, 130, 80, 65, 85, 55);
    Pokemon Bellsprout = new Pokemon("Bellsprout", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                     69, 1, 50, 75, 35, 70, 30, 40);
    Pokemon Weepingbell = new Pokemon("Weepingbell", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                      70, 2, 65, 90, 50, 85, 45, 55);
    Pokemon Victreebell = new Pokemon("Victreebell", Type.Grass, Type.Poison, new Ability[]{Ability.Chlorophyll},
                                      71, 3, 80, 105, 65, 100, 60, 70);
    Pokemon Tentacool = new Pokemon("Tentacool", Type.Water, Type.Poison, new Ability[]{Ability.Clear_Body, Ability.Liquid_Ooze},
                                    72, 1, 40, 40, 35, 50, 100, 70);
    Pokemon Tentacruel = new Pokemon("Tentacruel", Type.Water, Type.Poison, new Ability[]{Ability.Clear_Body, Ability.Liquid_Ooze},
                                     73, 2, 80, 70, 65, 80, 120, 100);
    Pokemon Geodude = new Pokemon("Geodude", Type.Rock, Type.Ground, new Ability[]{Ability.Rock_Head, Ability.Sturdy},
                                  74, 1, 40, 80, 100, 30, 30, 20);
    Pokemon Graveler = new Pokemon("Graveler", Type.Rock, Type.Ground, new Ability[]{Ability.Rock_Head, Ability.Sturdy},
                                   75, 2, 55, 95, 115, 45, 45, 35);
    Pokemon Golem = new Pokemon("Golem", Type.Rock, Type.Ground, new Ability[]{Ability.Rock_Head, Ability.Sturdy},
                                76, 3, 80, 110, 130, 55, 65, 45);
    Pokemon Ponyta = new Pokemon("Ponyta", Type.Fire, null, new Ability[]{Ability.Run_Away, Ability.Flash_Fire},
                                 77, 1, 50, 85, 55, 65, 65, 90);
    Pokemon Rapidash = new Pokemon("Rapidash", Type.Fire, null, new Ability[]{Ability.Run_Away, Ability.Flash_Fire},
                                   78, 2, 65, 100, 70, 80, 80, 105);
    Pokemon Slowpoke = new Pokemon("Slowpoke", Type.Water, Type.Psychic, new Ability[]{Ability.Oblivious, Ability.Own_Tempo},
                                   79, 1, 90, 65, 65, 40, 40, 15);
    Pokemon Slowbro = new Pokemon("Slowbro", Type.Water, Type.Psychic, new Ability[]{Ability.Oblivious, Ability.Own_Tempo},
                                  80, 2, 95, 75, 110, 100, 80, 30);
    Pokemon Magnemite = new Pokemon("Magnemite", Type.Electric, Type.Steel, new Ability[]{Ability.Magnet_Pull, Ability.Sturdy},
                                    81, 1, 25, 35, 70, 95, 55, 45);
    Pokemon Magneton = new Pokemon("Megneton", Type.Electric, Type.Steel, new Ability[]{Ability.Magnet_Pull, Ability.Sturdy},
                                   82, 2, 50, 60, 95, 120, 70, 70);
    Pokemon Farfetched = new Pokemon("Farfetched", Type.Normal, Type.Flying, new Ability[]{Ability.Keen_Eye, Ability.Inner_Focus},
                                     83, 1, 52, 65, 55, 58, 62, 60);
    Pokemon Doduo = new Pokemon("Doduo", Type.Normal, Type.Flying, new Ability[]{Ability.Run_Away, Ability.Early_Bird},
                                84, 1, 35, 85, 45, 35, 35, 75);
    Pokemon Dodrio = new Pokemon("Dodrio", Type.Normal, Type.Flying, new Ability[]{Ability.Run_Away, Ability.Early_Bird},
                                 85, 2, 60, 110, 70, 60, 60, 100);
    Pokemon Seel = new Pokemon("Seel", Type.Water, null, new Ability[]{Ability.Thick_Fat},
                               86, 1, 65, 45, 55, 45, 70, 45);
    Pokemon Dewgong = new Pokemon("Dewgong", Type.Water, Type.Ice, new Ability[]{Ability.Thick_Fat},
                                  87, 2, 90, 70, 80, 70, 95, 70);
    Pokemon Grimer = new Pokemon("Grimer", Type.Poison, null, new Ability[]{Ability.Stench, Ability.Sticky_Hold},
                                 88, 1, 80, 80, 50, 40, 50, 25);
    Pokemon Muk = new Pokemon("Muk", Type.Poison, null, new Ability[]{Ability.Stench, Ability.Sticky_Hold},
                              89, 2, 105, 105, 75, 65, 100, 50);
    Pokemon Shellder = new Pokemon("Shellder", Type.Water, null, new Ability[]{Ability.Shell_Armor},
                                   90, 1, 30, 65, 100, 45, 25, 40);
    Pokemon Cloyster = new Pokemon("Cloyster", Type.Water, Type.Ice, new Ability[]{Ability.Shell_Armor},
                                   91, 2, 50, 95, 180, 85, 45, 70);
    Pokemon Gastly = new Pokemon("Gastly", Type.Ghost, Type.Poison, new Ability[]{Ability.Levitate},
                                  92, 1, 30, 35, 30, 100, 35, 80);
    Pokemon Haunter = new Pokemon("Haunter", Type.Ghost, Type.Poison, new Ability[]{Ability.Levitate},
                                  93, 2, 45, 50, 45, 115, 55, 95);
    Pokemon Gengar = new Pokemon("Gengar", Type.Ghost, Type.Poison, new Ability[]{Ability.Levitate},
                                 94, 3, 60, 65, 60, 130, 75, 110);
    Pokemon Onix = new Pokemon("Onix", Type.Rock, Type.Ground, new Ability[]{Ability.Rock_Head, Ability.Sturdy},
                               95, 1, 35, 45, 160, 30, 45, 70);
    Pokemon Drowzee = new Pokemon("Drowzee", Type.Psychic, null, new Ability[]{Ability.Insomnia},
                                  96, 1, 60, 48, 45, 43, 90, 42);
    Pokemon Hypno = new Pokemon("Hypno", Type.Psychic, null, new Ability[]{Ability.Insomnia},
                                97, 2, 85, 73, 70, 73, 115, 67);
    Pokemon Krabby = new Pokemon("Krabby", Type.Water, null, new Ability[]{Ability.Hyper_Cutter, Ability.Shell_Armor},
                                 98, 1, 30, 105, 90, 25, 25, 50);
    Pokemon Kingler = new Pokemon("Kingler", Type.Water, null, new Ability[]{Ability.Hyper_Cutter, Ability.Shell_Armor},
                                  99, 2, 55, 130, 115, 50, 50, 75);
    Pokemon Voltorb = new Pokemon("Voltorb", Type.Electric, null, new Ability[]{Ability.Soundproof, Ability.Static},
                                  100, 1, 40, 30, 50, 55, 55, 100);
    Pokemon Electrode = new Pokemon("Electrode", Type.Electric, null, new Ability[]{Ability.Soundproof, Ability.Static},
                                    101, 2, 60, 50, 70, 80, 80, 140);
    Pokemon Exeggcute = new Pokemon("Exeggcute", Type.Grass, Type.Psychic, new Ability[]{Ability.Chlorophyll},
                                    102, 1, 60, 40, 80, 60, 45, 40);
    Pokemon Exeggutor = new Pokemon("Exeggutor", Type.Grass, Type.Psychic, new Ability[]{Ability.Chlorophyll},
                                    103, 2, 95, 95, 85, 125, 65, 55);
    Pokemon Cubone = new Pokemon("Cubone", Type.Ground, null, new Ability[]{Ability.Rock_Head, Ability.Lightning_Rod},
                                 104, 1, 50, 50, 95, 40, 50, 35);
    Pokemon Marowak = new Pokemon("Marowak", Type.Ground, null, new Ability[]{Ability.Rock_Head, Ability.Lightning_Rod},
                                  105, 2, 60, 80, 110, 50, 80, 45);
    Pokemon Hitmonlee = new Pokemon("Hitmonlee", Type.Fight, null,  new Ability[]{Ability.Limber},
                                    106, 1, 50, 120, 53, 35, 110, 87);
    Pokemon Hitmonchan = new Pokemon("Hitmonchan", Type.Fight, null, new Ability[]{Ability.Keen_Eye},
                                     107, 1, 50, 105, 79, 35, 110, 76);
    Pokemon Lickitung = new Pokemon("Lickitung", Type.Normal, null, new Ability[]{Ability.Oblivious, Ability.Own_Tempo},
                                    108, 1, 90, 55, 75, 60, 75, 30);
    Pokemon Koffing = new Pokemon("Koffing", Type.Poison, null, new Ability[]{Ability.Levitate},
                                  109, 1, 40, 65, 95, 60, 45, 35);
    Pokemon Weezing = new Pokemon("Weezing", Type.Poison, null, new Ability[]{Ability.Levitate},
                                  110, 2, 65, 90, 120, 85, 70, 60);
    Pokemon Rhyhorn = new Pokemon("Rhyhorn", Type.Ground, Type.Rock, new Ability[]{Ability.Rock_Head, Ability.Lightning_Rod},
                                  111, 1, 80, 85, 95, 30, 30, 25);
    Pokemon Rhydon = new Pokemon("Rhydon", Type.Ground, Type.Rock, new Ability[]{Ability.Rock_Head, Ability.Lightning_Rod},
                                 112, 2, 105, 130, 120, 45, 45, 40);
    Pokemon Chansey = new Pokemon("Chansey", Type.Normal, null, new Ability[]{Ability.Natural_Cure, Ability.Serene_Grace},
                                  113, 1, 250, 5, 5, 35, 105, 50);
    Pokemon Tangela = new Pokemon("Tangela", Type.Grass, null, new Ability[]{Ability.Chlorophyll},
                                  114, 1, 65, 55, 115, 100, 40, 60);
    Pokemon Kangaskhan = new Pokemon("Kangaskhan", Type.Normal, null, new Ability[]{Ability.Early_Bird},
                                     115, 1, 105, 95, 80, 40, 80, 90);
    Pokemon Horsey = new Pokemon("Horsey", Type.Water, null, new Ability[]{Ability.Swift_Swim},
                                 116, 1, 30, 40, 70, 70, 25, 60);
    Pokemon Seadra = new Pokemon("Seadra", Type.Water, null, new Ability[]{Ability.Poison_Point},
                                 117, 2, 55, 65, 95, 95, 45, 85);
    Pokemon Goldeen = new Pokemon("Goldeen", Type.Water, null, new Ability[]{Ability.Swift_Swim, Ability.Water_Veil},
                                  118, 1, 45, 67, 60, 35, 50, 63);
    Pokemon Seaking = new Pokemon("Seaking", Type.Water, null, new Ability[]{Ability.Swift_Swim, Ability.Water_Veil},
                                  119, 2, 80, 92, 65, 65, 80, 68);
    Pokemon Staryu = new Pokemon("Staryu", Type.Water, null, new Ability[]{Ability.Illuminate, Ability.Natural_Cure},
                                 120, 1, 30, 45, 55, 70, 55, 85);
    Pokemon Starmie = new Pokemon("Starmie", Type.Water, Type.Psychic, new Ability[]{Ability.Illuminate, Ability.Natural_Cure},
                                  121, 2, 60, 75, 85, 100, 85, 115);
    Pokemon Mr_Mime = new Pokemon("Mr. Mime", Type.Psychic, null, new Ability[]{Ability.Soundproof},
                                  122, 1, 40, 45, 65, 100, 120, 90);
    Pokemon Scyther = new Pokemon("Scyther", Type.Bug, Type.Flying, new Ability[]{Ability.Swarm},
                                  123, 1, 70, 110, 80, 55, 80, 105);
    Pokemon Jynx = new Pokemon("Jynx", Type.Ice, Type.Psychic, new Ability[]{Ability.Oblivious},
                               124, 1, 65, 50, 35, 115, 95, 95);
    Pokemon Electabuzz = new Pokemon("Electabuzz", Type.Electric, null,  new Ability[]{Ability.Static},
                                     125, 1, 65, 83, 57, 95, 85, 105);
    Pokemon Magmar = new Pokemon("Magmar", Type.Fire, null, new Ability[]{Ability.Flame_Body},
                                 126, 1, 65, 95, 57, 100, 85, 93);
    Pokemon Pinsir = new Pokemon("Pinsir", Type.Bug, null, new Ability[]{Ability.Hyper_Cutter},
                                 127, 1, 65, 125, 100, 55, 70, 85);
    Pokemon Tauros = new Pokemon("Tauros", Type.Normal, null, new Ability[]{Ability.Intimidate},
                                 128, 1, 75, 100, 95, 40, 70, 100);
    Pokemon Magikarp = new Pokemon("Magikarp", Type.Water, null, new Ability[]{Ability.Swift_Swim},
                                   129, 1, 20, 10, 55, 15, 20, 80);
    Pokemon Gyarados = new Pokemon("Gyarados", Type.Water, Type.Flying, new Ability[]{Ability.Intimidate},
                                   130, 2, 95, 125, 79, 60, 100, 81);
    Pokemon Lapras = new Pokemon("Lapras", Type.Water, Type.Ice, new Ability[]{Ability.Water_Absorb, Ability.Shell_Armor},
                                 131, 1, 130, 85, 80, 85, 95, 60);
    Pokemon Ditto = new Pokemon("Ditto", Type.Normal, null, new Ability[]{Ability.Limber},
                                132, 1, 48, 48, 48, 48, 48, 48);
    Pokemon Eevee = new Pokemon("Eevee", Type.Normal, null, new Ability[]{Ability.Run_Away},
                                133, 1, 55, 55, 50, 45, 65, 55);
    Pokemon Vaporeon = new Pokemon("Vaporeon", Type.Water, null, new Ability[]{Ability.Water_Absorb},
                                   134, 2, 130, 65, 60, 110, 95, 65);
    Pokemon Jolteon = new Pokemon("Jolteon", Type.Electric, null, new Ability[]{Ability.Volt_Absorb},
                                  135, 2, 65, 65, 60, 110, 95, 130);
    Pokemon Flareon = new Pokemon("Flareon", Type.Fire, null, new Ability[]{Ability.Flash_Fire},
                                  136, 2, 65, 130, 60, 95, 110, 65);
    Pokemon Porygon = new Pokemon("Porygon", Type.Normal, null, new Ability[]{Ability.Trace},
                                  137, 1, 65, 60, 70, 85, 75, 40);
    Pokemon Omanyte = new Pokemon("Omanyte", Type.Rock, Type.Water, new Ability[]{Ability.Swift_Swim, Ability.Shell_Armor},
                                  138, 1, 35, 40, 100, 90, 55, 35);
    Pokemon Omastar = new Pokemon("Omastar", Type.Rock, Type.Water, new Ability[]{Ability.Swift_Swim, Ability.Shell_Armor},
                                  139, 2, 70, 60, 125, 115, 70, 55);
    Pokemon Kabuto = new Pokemon("Kabuto", Type.Rock, Type.Water, new Ability[]{Ability.Swift_Swim, Ability.Battle_Armor},
                                 140, 1, 30, 80, 90, 55, 45, 55);
    Pokemon Kabutops = new Pokemon("Kabutops", Type.Rock, Type.Water, new Ability[]{Ability.Swift_Swim, Ability.Battle_Armor},
                                   141, 2, 60, 115, 105, 65, 70, 80);
    Pokemon Aerodactyl = new Pokemon("Aerodactyl", Type.Rock, Type.Flying, new Ability[]{Ability.Rock_Head, Ability.Pressure},
                                     142, 1, 80, 105, 65, 60, 75, 130);
    Pokemon Snorlax = new Pokemon("Snorlax", Type.Normal, null,  new Ability[]{Ability.Immunity, Ability.Thick_Fat},
                                  143, 1, 160, 110, 65, 65, 110, 30);
    Pokemon Articuno = new Pokemon("Articuno", Type.Ice, Type.Flying, new Ability[]{Ability.Pressure},
                                   144, 1, 90, 85, 100, 95, 125, 85);
    Pokemon Zapdos = new Pokemon("Zapdos", Type.Electric, Type.Flying, new Ability[]{Ability.Pressure},
                                 145, 1, 90, 90, 85, 125, 90, 100);
    Pokemon Moltres = new Pokemon("Moltres", Type.Fire, Type.Flying, new Ability[]{Ability.Pressure},
                                  146, 1, 90, 100, 90, 125, 85, 90);
    Pokemon Dratini = new Pokemon("Dratini", Type.Dragon, null, new Ability[]{Ability.Shed_Skin},
                                  147, 1, 41, 64, 45, 50, 50, 50);
    Pokemon Dragonair = new Pokemon("Dragonair", Type.Dragon, null, new Ability[]{Ability.Shed_Skin},
                                    148, 2, 61, 84, 65, 70, 70, 70);
    Pokemon Dragonite = new Pokemon("Dragonite", Type.Dragon, Type.Flying, new Ability[]{Ability.Inner_Focus},
                                    149, 3, 91, 134, 95, 100, 100, 80);
    Pokemon Mewtwo = new Pokemon("Mewtwo", Type.Psychic, null, new Ability[]{Ability.Pressure},
                                 150, 1, 106, 110, 90, 154, 90, 130);
    Pokemon Mew = new Pokemon("Mew", Type.Psychic, null, new Ability[]{Ability.Synchronize},
                              151, 1, 100, 100, 100, 100, 100, 100);
}
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("NPCComposition")
public class NPCComposition extends CacheableNode {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ljf;"
   )
   @Export("NpcDefinition_indexCache")
   public static IndexDataBase NpcDefinition_indexCache;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljf;"
   )
   @Export("NpcDefinition_modelIndexCache")
   public static IndexDataBase NpcDefinition_modelIndexCache;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   @Export("npcs")
   static NodeCache npcs;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   @Export("npcModelCache")
   static NodeCache npcModelCache;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 810016143
   )
   @Export("id")
   public int id;
   @ObfuscatedName("m")
   @Export("name")
   public String name;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1191741209
   )
   public int field3720;
   @ObfuscatedName("i")
   @Export("models")
   int[] models;
   @ObfuscatedName("u")
   int[] field3711;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -245521569
   )
   public int field3712;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -847438703
   )
   public int field3716;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1664514725
   )
   public int field3714;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1399586949
   )
   public int field3732;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1392574473
   )
   public int field3736;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 282238707
   )
   public int field3717;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -447164707
   )
   public int field3706;
   @ObfuscatedName("v")
   @Export("colors")
   short[] colors;
   @ObfuscatedName("q")
   @Export("modifiedColors")
   short[] modifiedColors;
   @ObfuscatedName("r")
   short[] field3721;
   @ObfuscatedName("j")
   short[] field3740;
   @ObfuscatedName("b")
   @Export("actions")
   public String[] actions;
   @ObfuscatedName("g")
   @Export("isMinimapVisible")
   public boolean isMinimapVisible;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -316620067
   )
   @Export("combatLevel")
   public int combatLevel;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1777996525
   )
   @Export("widthScale")
   int widthScale;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1857324877
   )
   @Export("heightScale")
   int heightScale;
   @ObfuscatedName("c")
   @Export("isVisible")
   public boolean isVisible;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 869631619
   )
   int field3729;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1068666911
   )
   int field3730;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 608267971
   )
   public int field3715;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -261996981
   )
   public int field3733;
   @ObfuscatedName("ac")
   @Export("configs")
   public int[] configs;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 354105725
   )
   @Export("varpIndex")
   int varpIndex;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 450415395
   )
   @Export("varp32Index")
   int varp32Index;
   @ObfuscatedName("af")
   public boolean field3724;
   @ObfuscatedName("aq")
   @Export("isClickable")
   public boolean isClickable;
   @ObfuscatedName("ai")
   public boolean field3738;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   IterableHashTable field3735;

   static {
      npcs = new NodeCache(64);
      npcModelCache = new NodeCache(50);
   }

   NPCComposition() {
      this.name = "null";
      this.field3720 = 1;
      this.field3712 = -1;
      this.field3716 = -1;
      this.field3714 = -1;
      this.field3732 = -1;
      this.field3736 = -1;
      this.field3717 = -1;
      this.field3706 = -1;
      this.actions = new String[5];
      this.isMinimapVisible = true;
      this.combatLevel = -1;
      this.widthScale = 128;
      this.heightScale = 128;
      this.isVisible = false;
      this.field3729 = 0;
      this.field3730 = 0;
      this.field3715 = -1;
      this.field3733 = 32;
      this.varpIndex = -1;
      this.varp32Index = -1;
      this.field3724 = true;
      this.isClickable = true;
      this.field3738 = false;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-560586944"
   )
   @Export("post")
   void post() {
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lgc;I)V",
      garbageValue = "886263203"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.readNext(var1, var2);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lgc;II)V",
      garbageValue = "-348981362"
   )
   @Export("readNext")
   void readNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.models = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.models[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 12) {
         this.field3720 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field3712 = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.field3732 = var1.readUnsignedShort();
      } else if(var2 == 15) {
         this.field3716 = var1.readUnsignedShort();
      } else if(var2 == 16) {
         this.field3714 = var1.readUnsignedShort();
      } else if(var2 == 17) {
         this.field3732 = var1.readUnsignedShort();
         this.field3736 = var1.readUnsignedShort();
         this.field3717 = var1.readUnsignedShort();
         this.field3706 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readString();
         if(this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.colors = new short[var3];
         this.modifiedColors = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.colors[var4] = (short)var1.readUnsignedShort();
            this.modifiedColors[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.field3721 = new short[var3];
         this.field3740 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3721[var4] = (short)var1.readUnsignedShort();
            this.field3740[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.field3711 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3711[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 93) {
         this.isMinimapVisible = false;
      } else if(var2 == 95) {
         this.combatLevel = var1.readUnsignedShort();
      } else if(var2 == 97) {
         this.widthScale = var1.readUnsignedShort();
      } else if(var2 == 98) {
         this.heightScale = var1.readUnsignedShort();
      } else if(var2 == 99) {
         this.isVisible = true;
      } else if(var2 == 100) {
         this.field3729 = var1.readByte();
      } else if(var2 == 101) {
         this.field3730 = var1.readByte();
      } else if(var2 == 102) {
         this.field3715 = var1.readUnsignedShort();
      } else if(var2 == 103) {
         this.field3733 = var1.readUnsignedShort();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.field3724 = false;
         } else if(var2 == 109) {
            this.isClickable = false;
         } else if(var2 == 111) {
            this.field3738 = true;
         } else if(var2 == 249) {
            this.field3735 = class28.readStringIntParameters(var1, this.field3735);
         }
      } else {
         this.varpIndex = var1.readUnsignedShort();
         if(this.varpIndex == 65535) {
            this.varpIndex = -1;
         }

         this.varp32Index = var1.readUnsignedShort();
         if(this.varp32Index == 65535) {
            this.varp32Index = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.configs = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.configs[var5] = var1.readUnsignedShort();
            if(this.configs[var5] == 65535) {
               this.configs[var5] = -1;
            }
         }

         this.configs[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lke;ILke;IB)Lei;",
      garbageValue = "0"
   )
   @Export("getModel")
   public final Model getModel(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.configs != null) {
         NPCComposition var12 = this.transform();
         return var12 == null?null:var12.getModel(var1, var2, var3, var4);
      } else {
         Model var5 = (Model)npcModelCache.get((long)this.id);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.models.length; ++var7) {
               if(!NpcDefinition_modelIndexCache.tryLoadRecord(this.models[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            ModelData[] var8 = new ModelData[this.models.length];

            int var9;
            for(var9 = 0; var9 < this.models.length; ++var9) {
               var8[var9] = ModelData.method2645(NpcDefinition_modelIndexCache, this.models[var9], 0);
            }

            ModelData var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new ModelData(var8, var8.length);
            }

            if(this.colors != null) {
               for(var9 = 0; var9 < this.colors.length; ++var9) {
                  var11.recolor(this.colors[var9], this.modifiedColors[var9]);
               }
            }

            if(this.field3721 != null) {
               for(var9 = 0; var9 < this.field3721.length; ++var9) {
                  var11.method2613(this.field3721[var9], this.field3740[var9]);
               }
            }

            var5 = var11.light(this.field3729 + 64, this.field3730 * 5 + 850, -30, -50, -30);
            npcModelCache.put(var5, (long)this.id);
         }

         Model var10;
         if(var1 != null && var3 != null) {
            var10 = var1.applyTransformations(var5, var2, var3, var4);
         } else if(var1 != null) {
            var10 = var1.transformActorModel(var5, var2);
         } else if(var3 != null) {
            var10 = var3.transformActorModel(var5, var4);
         } else {
            var10 = var5.toSharedModel(true);
         }

         if(this.widthScale != 128 || this.heightScale != 128) {
            var10.scale(this.widthScale, this.heightScale, this.widthScale);
         }

         return var10;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Ldg;",
      garbageValue = "-19"
   )
   public final ModelData method5148() {
      if(this.configs != null) {
         NPCComposition var1 = this.transform();
         return var1 == null?null:var1.method5148();
      } else if(this.field3711 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field3711.length; ++var2) {
            if(!NpcDefinition_modelIndexCache.tryLoadRecord(this.field3711[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            ModelData[] var6 = new ModelData[this.field3711.length];

            for(int var3 = 0; var3 < this.field3711.length; ++var3) {
               var6[var3] = ModelData.method2645(NpcDefinition_modelIndexCache, this.field3711[var3], 0);
            }

            ModelData var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new ModelData(var6, var6.length);
            }

            int var4;
            if(this.colors != null) {
               for(var4 = 0; var4 < this.colors.length; ++var4) {
                  var7.recolor(this.colors[var4], this.modifiedColors[var4]);
               }
            }

            if(this.field3721 != null) {
               for(var4 = 0; var4 < this.field3721.length; ++var4) {
                  var7.method2613(this.field3721[var4], this.field3740[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(B)Ljr;",
      garbageValue = "120"
   )
   @Export("transform")
   public final NPCComposition transform() {
      int var1 = -1;
      if(this.varpIndex != -1) {
         var1 = DynamicObject.getVarbit(this.varpIndex);
      } else if(this.varp32Index != -1) {
         var1 = class237.clientVarps[this.varp32Index];
      }

      int var2;
      if(var1 >= 0 && var1 < this.configs.length - 1) {
         var2 = this.configs[var1];
      } else {
         var2 = this.configs[this.configs.length - 1];
      }

      return var2 != -1?class234.getNpcDefinition(var2):null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2054152504"
   )
   public boolean method5123() {
      if(this.configs == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.varpIndex != -1) {
            var1 = DynamicObject.getVarbit(this.varpIndex);
         } else if(this.varp32Index != -1) {
            var1 = class237.clientVarps[this.varp32Index];
         }

         return var1 >= 0 && var1 < this.configs.length?this.configs[var1] != -1:this.configs[this.configs.length - 1] != -1;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-71"
   )
   public int method5124(int var1, int var2) {
      IterableHashTable var4 = this.field3735;
      int var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.get((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.value;
         }
      }

      return var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-820378305"
   )
   public String method5125(int var1, String var2) {
      return WorldMapType1.method309(this.field3735, var1, var2);
   }
}

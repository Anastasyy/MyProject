package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
class AerialAce extends SpecialMove{
	public AerialAce(){
		super(Type.GRASS,60,99999);
	}
	@Override
	protected java.lang.String describe(){
		return "Мочит";
	}
	@Override
    protected void applyOppDamage(Pokemon pokApplyOpp, double damagePok){ //сколько очков повреждения, настолько и ухудщается
        Status pokCond = pokApplyOpp.getCondition();
        if (pokCond.equals(Status.BURN) || pokCond.equals(Status.POISON) ||pokCond.equals(Status.PARALYZE)) { //условие то я ему увеличиваю здорове 
            pokApplyOpp.setMod(Stat.HP, (int) Math.round(damagePok) * 2); //округляем
            Effect newEff = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, 1); //через каждые три раза с верочтность 50% будет увлеичивтаться атка покмеона на одну ступень
            pokApplyOpp.addEffect(newEff); 
        }
    }
}
class CalmMind extends SpecialMove{
	public CalmMind(){
		super(Type.ICE,15,567);
	}
	@Override
	protected java.lang.String describe(){
	 	return "Мочит";
	}
}
class GigaDrain extends SpecialMove{
	public GigaDrain(){
		super(Type.DRAGON,5,1000);
	}
	@Override
	protected java.lang.String describe(){
	  return "Мочит";
	}
}
class Leer extends SpecialMove{
	public Leer(){
		super(Type.GHOST,902,10);
	}
	@Override
	protected java.lang.String describe(){
	  return "Мочит";
	}
    @Override
    protected void applyOppDamage(Pokemon pokApplyOpp, double damagePok){
        Status pokCond = pokApplyOpp.getCondition();
        if (pokCond.equals(Status.SLEEP) || pokCond.equals(Status.FREEZE) ||pokCond.equals(Status.NORMAL)) {
            pokApplyOpp.setMod(Stat.HP, (int) Math.round(damagePok) * 2);
            Effect newEff = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, 4);
            pokApplyOpp.addEffect(newEff);
        }
      }      
}
class Rest extends SpecialMove{
	public Rest(){
		super(Type.FAIRY,45,10);
	}
	@Override
	protected java.lang.String describe(){
	  return "Летает";
	}
}
class XScissor extends SpecialMove{
	public XScissor(){
		super(Type.FIRE,5,10);
	}
	@Override
	protected java.lang.String describe(){
	  return "Летает";
	}
}
class Venoshock extends SpecialMove{
	public Venoshock(){
		super(Type.ICE,53,102);
	}
	@Override
	protected java.lang.String describe(){
	  return "Летает";
	}
}
class FireBlast extends PhysicalMove{
	public FireBlast(){
		super(Type.GHOST,65,1021);
	}
	@Override
	protected java.lang.String describe(){
	  return "Пуляется";
	}
}
class Psychic extends PhysicalMove{
	public Psychic(){
		super(Type.GRASS,513,1042);
	}
	@Override
	protected java.lang.String describe(){
	  return "Пуляется";
	}
}
class MudBomb extends PhysicalMove{
	public MudBomb(){
		super(Type.BUG,33,142);
	}
	@Override
	protected java.lang.String describe(){
	  return "Взрывается";
	}
}
class Minimize extends PhysicalMove{
	public Minimize(){
		super(Type.NONE,312,1421);
	}
	@Override
	protected java.lang.String describe(){
	  return "Взрывается";
	}
	@Override
    protected void applyOppDamage(Pokemon pokApplyOpp, double damagePok){
        Status pokCond = pokApplyOpp.getCondition();
        if (pokCond.equals(Status.FREEZE) || pokCond.equals(Status.POISON) ||pokCond.equals(Status.SLEEP)) {
            pokApplyOpp.setMod(Stat.HP, (int) Math.round(damagePok) * 2);
            Effect newEff = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, -4);
            pokApplyOpp.addEffect(newEff);
        }
    }

}


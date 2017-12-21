import java.util.ArrayList;

public class Runnerz
	{

		public static void main(String[] args)
			{
			SuperHero [] hero = new SuperHero [4];
//			hero[0] = new USA();
//			hero[1] = new Worldwide();
//			hero[2] = new Terrestrial();
//			hero[3] = new ExtraTerrestrial();
			
			ArrayList <SuperHero> heroes = new ArrayList <SuperHero>();
			heroes.add(new USA());
			heroes.add(new Worldwide());
			heroes.add(new Terrestrial());
			heroes.add(new ExtraTerrestrial());
			}

	}

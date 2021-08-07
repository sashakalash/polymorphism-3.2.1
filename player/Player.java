package player;

import weapon.*;

public class Player {
		private Weapon[] weaponSlots;

		public Player() {
				weaponSlots = new Weapon[]{
								new Pistol(),
								new MashineGun(),
								new PullAndPushGun(),
								new RPG(),
								new WaterGun()
				};
		}

		public int getSlotsCount() {
				return weaponSlots.length;
		}

		public void shotWithWeapon(int slot) {
				if (slot >= getSlotsCount() || slot < 0) {
						System.out.println("Такого оружия пока нет!");
						return;
				}
				Weapon weapon = weaponSlots[slot];
				weapon.shot();
		}
}

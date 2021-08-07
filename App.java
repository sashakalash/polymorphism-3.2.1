import player.Player;

import java.util.Scanner;

public class App {
		public static void main(String[] args) throws Exception {
				Scanner scanner = new Scanner(System.in);
				Player player = new Player();
				while (true) {
						System.out.format("У игрока %d слотов с оружием,"
														+ " введите номер, чтобы выстрелить,"
														+ " -1 чтобы выйти%n",
										player.getSlotsCount()
						);

						String input = scanner.nextLine();
						int slot;

						try {
								slot = Integer.parseInt(input);
						} catch (NumberFormatException ex) {
								System.out.println("Неверные координаты!");
								continue;
						}

						if (slot == -1) {
								break;
						}

						player.shotWithWeapon(slot);
				}

				System.out.println("Game over!");
		}
}

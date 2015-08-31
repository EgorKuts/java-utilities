package org.andresoviedo.util.model;

public final class ModelUtils {

	private ModelUtils() {
	}

	public static class Spain {

		public enum Province {
			�lava("01"), Albacete("02"), Alicante("03"), Almer�a("04"), �vila("05"), Badajoz("06"), Islas_Baleares("07"), Barcelona(
					"08"), Burgos("09"), C�ceres("10"), C�diz("11"), Castell�n("12"), Ciudad_Real("13"), C�rdoba("14"), La_Coru�a(
					"15"), Cuenca("16"), Gerona("17"), Granada("18"), Guadalajara("19"), Guip�zcua("20"), Huelva("21"), Huesca(
					"22"), Ja�n("23"), Le�n("24"), L�rida("25"), La_Rioja("26"), Lugo("27"), Madrid("28"), M�laga("29"), Murcia(
					"30"), Navarra("31"), Palencia("34"), Orense("32"), Asturias("33"), Las_Palmas("35"), Pontevedra(
					"36"), Salamanca("37"), Santa_Cruz_de_Tenerife("38"), Cantabria("39"), Segovia("40"), Sevilla("41"), Soria(
					"42"), Tarragona("43"), Teruel("44"), Toledo("45"), Valencia("46"), Valladolid("47"), Vizcaya("48"), Zamora(
					"49"), Zaragoza("50"), Ceuta("51"), Melilla("52");

			private String code;

			private Province(String code) {
				this.code = code;
			}

			public static Province parse(String value) {
				switch (Integer.parseInt(value)) {
				case 1:
					return �lava;
				case 2:
					return Albacete;
				case 3:
					return Alicante;
				case 4:
					return Almer�a;
				case 5:
					return �vila;
				case 6:
					return Badajoz;
				case 7:
					return Islas_Baleares;
				case 8:
					return Barcelona;
				case 9:
					return Burgos;
				case 10:
					return C�ceres;
				case 11:
					return C�diz;
				case 12:
					return Castell�n;
				case 13:
					return Ciudad_Real;
				case 14:
					return C�rdoba;
				case 15:
					return La_Coru�a;
				case 16:
					return Cuenca;
				case 17:
					return Gerona;
				case 18:
					return Granada;
				case 19:
					return Guadalajara;
				case 20:
					return Guip�zcua;
				case 21:
					return Huelva;
				case 22:
					return Huesca;
				case 23:
					return Ja�n;
				case 24:
					return Le�n;
				case 25:
					return L�rida;
				case 26:
					return La_Rioja;
				case 27:
					return Lugo;
				case 28:
					return Madrid;
				case 29:
					return M�laga;
				case 30:
					return Murcia;
				case 31:
					return Navarra;
				case 32:
					return Orense;
				case 33:
					return Asturias;
				case 34:
					return Palencia;
				case 35:
					return Las_Palmas;
				case 36:
					return Pontevedra;
				case 37:
					return Salamanca;
				case 38:
					return Santa_Cruz_de_Tenerife;
				case 39:
					return Cantabria;
				case 40:
					return Segovia;
				case 41:
					return Sevilla;
				case 42:
					return Soria;
				case 43:
					return Tarragona;
				case 44:
					return Teruel;
				case 45:
					return Toledo;
				case 46:
					return Valencia;
				case 47:
					return Valladolid;
				case 48:
					return Vizcaya;
				case 49:
					return Zamora;
				case 50:
					return Zaragoza;
				case 51:
					return Ceuta;
				case 52:
					return Melilla;
				default:
					throw new UnsupportedOperationException("Province with code '" + value + "' is not registered");
				}
			}
		}
	}
}
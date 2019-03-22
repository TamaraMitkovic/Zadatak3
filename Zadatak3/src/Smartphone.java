
public class Smartphone extends Telefon {
	private OSistem os;
	private Stanje stanje;
	private int downloadProgres;
	public Smartphone() {
		super();
		stanje=Stanje.ISKLJUCEN;
		downloadProgres=-1;
	}
	public Smartphone(String brTel, OSistem os, Stanje stanje, int downloadProgres) {
		super(brTel);
		this.os = os;
		this.stanje = stanje;
		this.downloadProgres = downloadProgres;
	}
	public boolean turnOff() {
		if(stanje==Stanje.UKLJUCEN) {
			stanje=stanje.ISKLJUCEN;
			downloadProgres=-1;
			return true;
		}
		else return false;
	}
	public boolean turnOn() {
		if(stanje==Stanje.ISKLJUCEN) {
			stanje=stanje.UKLJUCEN;
			downloadProgres=-1;
			return true;
		}
		else return false;
	}
	public boolean sleep() {
		if(stanje==Stanje.UKLJUCEN) {
			stanje=stanje.STANDBY;
			downloadProgres=-1;
			return true;
		}
		else return false;
	}
	public boolean wakeUp() {
		if(stanje==Stanje.STANDBY) {
			stanje=stanje.UKLJUCEN;
			downloadProgres=-1;
			return true;
		}
		else return false;
	}
	public boolean finishUpdate() {
		if(stanje==Stanje.AZURIRANJE && downloadProgres==100) {
			stanje=stanje.UKLJUCEN;
			downloadProgres=-1;
			return true;
		}
		else return false;
	}
	public boolean startUpdate(int newVersionNumber) {
		if(stanje==Stanje.UKLJUCEN) {
			stanje=stanje.AZURIRANJE;
			downloadProgres=0;
			os.setVerzija(newVersionNumber);
			return true;
		}
		else return false;
	}
	public boolean downloadBatch()  {
		if(stanje==Stanje.AZURIRANJE && downloadProgres<100) {
			downloadProgres+=10;
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return "Operativni sistem je "+os.getTip()+" verzije"+os.getVerzija()+". Stanje u kom se telefon nalazi je "+stanje+"a download progress je "+downloadProgres;
	}
	
}

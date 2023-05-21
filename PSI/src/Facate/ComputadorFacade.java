package Facate;

public class ComputadorFacade {

	private Cpu cpu = null;
	private Memoria memoria = null;
	private HardDrive hardDrive = null;
	
	
	public ComputadorFacade(Cpu cpu, Memoria memoria,HardDrive hardDrive ) {
		this.cpu = cpu;
		this.hardDrive = hardDrive;
		this.memoria = memoria;
	}
	
	
	public void ligarComputador() {
		cpu.start();
		//String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
		cpu.execute();
		cpu.free();
		memoria.load(0, null);
		memoria.free(0, null);
		hardDrive.read(0, 0);hardDrive.write(0, 0);
		
		
		
	}
	
	
}

package frc.robot.bbqlibs;

public class SwerveBase extends SubsystemModule{

	//Make sure only 1 instance of swerve base is running at all times.
	private static SwerveBase instance;
	public static SwerveBase getInstance() {
		if (instance == null)
			instance = new SwerveBase();
		return instance;
	}

	@Override
	public void run() {

	}

	@Override
	public void registerCommands() {

	}

	@Override
	public void init() {

	}

	@Override
	public void destruct() {

	}
}

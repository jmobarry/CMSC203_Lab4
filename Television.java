/**
 * The purpose of this class is to model a television
 * @author jmobe 9/27/2020
 *
 */
public class Television {

private String manufacturer; //Manufacturer of the television
private int screensize; // Television screen size (measured in pixels)
private boolean powerOn = false; //State of television powered on or off
private int channel; //Television channel greater than or q
private int volume;
	
	/**
	 * This constructor creates a new telivison object
	 * @param manufacturer set to input string 
	 * @param screensize set to input screensize
	 * initializes powerOn to false
	 * initializes volume to 20
	 * initializes channel to 2
	 */
	public Television (String manufacturer, int screensize) {

		this.manufacturer = manufacturer;
		this.screensize = screensize;
		powerOn = false;
		volume = 20;
		channel = 2;;
	}
	/**
	* this method is to call the current volume
	* @return volume
	*/
	public int getVolume() {
		return volume;
	}
	/**
	 * this method is to call the current channel
	 * @return channel
	 */
	public int getChannel() {
		return channel;	
	}	
	/**
	 * this method is to call the current manufacturer
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;	
	}
	/**
	 * this method is to call the current screen size
	 * @return screen size
	 */
	public int getScreenSize() {
		return screensize;	
	}
	/**
	 * this method is to set the channel to the input channel
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * this method is to set the power to the opposite of the current setting
	 */
	public void power() {
			if (powerOn == true) {
				powerOn = !powerOn;	
			}
			else if (powerOn == false) {
				powerOn = !powerOn;
			}
			}
	/**
	 * this method increases the volume by 1
	 */
	public void increaseVolume() {
	volume += 1;
	}
	/**
	 * this method decreases the volume by 1
	 */
	public void decreaseVolume() {
	volume -= 1;	
	}



}	
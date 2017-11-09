/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificamappa;

/**
 *
 * @author marco.pistollato
 */
public class PuntoMappa {
	public int stop_id;
	public String stop_name;
	public double stop_lat;
	public double stop_lon;
	public PuntoMappa(int stop_id, String stop_name, double stop_lat, double stop_lon){
		this.stop_id=stop_id;
		this.stop_name=stop_name;
		this.stop_lat=stop_lat;
		this.stop_lon=stop_lon;
	}
}

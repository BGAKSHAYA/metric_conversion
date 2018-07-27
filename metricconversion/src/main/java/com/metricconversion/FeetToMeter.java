/**.
 * This package contains 6 classes to convert any metric among feet, meter and inch
 */
package com.metricconversion;

/**.
 * @author Akshaya_Gowri
 */
public class FeetToMeter implements TypeConversion {

	 public double changeMetric(double inputMetricFeet) {
		 return 0.3048*inputMetricFeet;
	 }
}

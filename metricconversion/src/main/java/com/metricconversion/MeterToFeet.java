/**.
 * This package contains 6 classes to convert any metric among feet, meter and inch
 */
package com.metricconversion;

/**.
 * @author Akshaya_Gowri
 */
public class MeterToFeet implements TypeConversion {

	 public double changeMetric(double inputMetricMeter) {
		 return 3.28084*inputMetricMeter;
	 }
}

/**.
 * This package contains 6 classes to convert any metric among feet, meter and inch
 */
package com.metricconversion;

/**.
 * @author Akshaya_Gowri
 */
public class InchToFeet implements TypeConversion {

	 public double changeMetric(double inputMetricInch) {
		 return (1.0/12)*inputMetricInch;
	 }
}

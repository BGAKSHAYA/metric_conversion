/**.
 * This package contains 6 classes to convert any metric among feet, meter and inch
 */
package com.metricconversion;

/**.
 * @author Akshaya_Gowri
 */
public class InchToMeter implements TypeConversion {

	 public double changeMetric(double inputMetricInch) {
		 return 0.0254*inputMetricInch;
	 }
}

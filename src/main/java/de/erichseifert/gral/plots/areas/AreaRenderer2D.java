/*
 * GRAL: Vector export for Java(R) Graphics2D
 *
 * (C) Copyright 2009-2010 Erich Seifert <info[at]erichseifert.de>, Michael Seifert <michael.seifert[at]gmx.net>
 *
 * This file is part of GRAL.
 *
 * GRAL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GRAL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GRAL.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.erichseifert.gral.plots.areas;

import de.erichseifert.gral.Drawable;
import de.erichseifert.gral.plots.DataPoint2D;
import de.erichseifert.gral.plots.axes.Axis;
import de.erichseifert.gral.plots.axes.AxisRenderer2D;
import de.erichseifert.gral.util.SettingsStorage;
import de.erichseifert.gral.util.Settings.Key;

/**
 * Interface for renderers that display areas in plots.
 */
public interface AreaRenderer2D extends SettingsStorage {
	/** Key for specifying the distance between the area and a data point. */
	static final Key GAP = new Key("area.gap.size");
	/** Key for specifying whether the gaps should have rounded corners. */
	static final Key GAP_ROUNDED = new Key("area.gap.rounded");
	/** Key for specifying the {@link java.awt.Paint} instance used to fill the area shape. */
	static final Key COLOR = new Key("area.color");

	/**
	 * Returns the graphical representation to be drawn for the specified data points.
	 * @param axis Reference axis for the specified data points.
	 * @param axisRenderer Renderer of the reference axis.
	 * @param points Points to be used for creating the area.
	 * @return Representation of the area.
	 */
	Drawable getArea(Axis axis, AxisRenderer2D axisRenderer, Iterable<DataPoint2D> points);

}
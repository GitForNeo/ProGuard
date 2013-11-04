/* $Id: ResourceJar.java,v 1.2 2003/03/03 19:11:45 eric Exp $
 *
 * ProGuard - integration into Ant.
 *
 * Copyright (c) 2003 Dirk Schnelle (dirk.schnelle@web.de)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.ant;

/**
 * Handles the resourcejar nested task for the ProGuard task.
 *
 * @author Dirk Schnelle
 *
 * @see proguard.ant.ProGuardTask
 */
public class ResourceJar extends JarContainer
{
    /**
     * Creates a new ResourceJar nested task.
     */
    public ResourceJar()
    {
        super();
    }


    /**
     * Adds the found jar file.
     * @param jar Name of the jar file to add.
     */
    protected void addJar(String jar)
    {
        proGuardTask.addResourcejar(jar);
    }
}

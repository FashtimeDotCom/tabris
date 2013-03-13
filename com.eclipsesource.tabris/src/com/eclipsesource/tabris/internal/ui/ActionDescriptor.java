/*******************************************************************************
 * Copyright (c) 2013 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/
package com.eclipsesource.tabris.internal.ui;

import org.eclipse.swt.graphics.Image;

import com.eclipsesource.tabris.ui.Action;


public class ActionDescriptor {

  private final String id;
  private final Action action;
  private final String title;
  private final Image image;
  private final boolean visible;
  private final boolean enabled;

  public ActionDescriptor( String id,
                           Action action,
                           String title,
                           Image image,
                           boolean visible,
                           boolean enabled )
  {
    this.id = id;
    this.action = action;
    this.title = title;
    this.image = image;
    this.enabled = enabled;
    this.visible = visible;
  }

  public String getId() {
    return id;
  }

  public Action getAction() {
    return action;
  }

  public String getTitle() {
    return title;
  }

  public Image getImage() {
    return image;
  }

  public boolean isVisible() {
    return visible;
  }

  public boolean isEnabled() {
    return enabled;
  }

}

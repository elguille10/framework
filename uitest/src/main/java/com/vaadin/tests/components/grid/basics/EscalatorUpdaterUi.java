package com.vaadin.tests.components.grid.basics;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.widgetset.TestingWidgetSet;
import com.vaadin.tests.widgetset.client.grid.EscalatorBasicClientFeaturesWidget;
import com.vaadin.tests.widgetset.server.TestWidgetComponent;
import com.vaadin.ui.UI;

@Widgetset(TestingWidgetSet.NAME)
@Theme("reindeer")
public class EscalatorUpdaterUi extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new TestWidgetComponent(
                EscalatorBasicClientFeaturesWidget.UpdaterLifetimeWidget.class));
    }
}

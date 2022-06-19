/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.backoffice.console.presentation;

import eapli.base.app.backoffice.console.presentation.SpecifyProduct.SpecifyProductAction;
import eapli.base.app.backoffice.console.presentation.agv.ConfigureAGVAction;
import eapli.base.app.backoffice.console.presentation.agv.ListOrderToAGVAction;
import eapli.base.app.backoffice.console.presentation.category.SpecifyCategoryAction;
import eapli.base.app.backoffice.console.presentation.customer.CheckOrderStatusAction;
import eapli.base.app.backoffice.console.presentation.customer.RegisterCustomerAction;
import eapli.base.app.backoffice.console.presentation.order.UpdateOrderAction;
import eapli.base.app.backoffice.console.presentation.order.CreateOrderBySalesClerkAction;
import eapli.base.app.backoffice.console.presentation.order.UpdateOrderToBeingDeliveredAction;
import eapli.base.app.backoffice.console.presentation.productCatalog.ListProductsAction;
import eapli.base.app.backoffice.console.presentation.surveymanagement.CreateSurveyAction;
import eapli.base.app.backoffice.console.presentation.surveymanagement.GetStatisticalReportAction;
import eapli.base.app.backoffice.console.presentation.warehouse.ImportWarehouseAction;
import eapli.base.app.backoffice.console.presentation.webdashboard.WebDashboardAction;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.authz.AddUserUI;
import eapli.base.app.backoffice.console.presentation.authz.DeactivateUserAction;
import eapli.base.app.backoffice.console.presentation.authz.ListUsersAction;
import eapli.base.app.backoffice.console.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.ShowMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

    // SETTINGS
    private static final int SET_KITCHEN_ALERT_LIMIT_OPTION = 1;

    // SALES CLERK
    private static final int CUSTOMER_OPTION = 2;
    private static final int PRODUCT_OPTION = 3;
    private static final int ORDER_OPTION = 4;

    // WAREHOUSE EMPLOYEE
    private static final int WAREHOUSE_OPTION = 2;

    // SALES MANAGER
    private static final int SURVEY_OPTION = 2;

    // CUSTOMER MENU
    private static final int REGISTER_CUSTOMER_OPTION = 1;
    private static final int CHECK_ORDER_STATUS_OPTION = 2;

    // PRODUCT MENU
    private static final int SPECIFY_PRODUCT_OPTION = 1;
    private static final int SEARCH_PRODUCTS_OPTION = 2;
    private static final int NEW_PRODUCT_ORDER_OPTION = 3;
    private static final int NEW_CATEGORY_OPTION = 4;
    private static final int UPDATE_ORDER_STATUS = 5;

    // ORDER MENU
    private static final int UPDATE_ORDER_TO_BEING_DELIVERED_OPTION = 1;

    // WAREHOUSE MENU
    private static final int CONFIG_AVG_OPTION = 1;
    private static final int OPEN_WEB_DASHBOARD = 2;
    private static final int ASSIGN_ORDER = 3;
    private static final int CHANGE_ORDER_TO_DELIVERED_OPTION = 4;
    private static final int IMPORT_WAREHOUSE_PLANT = 5;

    // SURVEY MENU
    private static final int CREATE_SURVEY_OPTION = 1;
    private static final int GET_STATISTICAL_REPORT_OPTION = 2;


    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;
    private static final int SETTINGS_OPTION = 4;
    private static final int DISH_OPTION = 5;
    private static final int TRACEABILITY_OPTION = 6;
    private static final int MEALS_OPTION = 7;
    private static final int REPORTING_DISHES_OPTION = 8;

    private static final String SEPARATOR_LABEL = "--------------";

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);
            final Menu settingsMenu = buildAdminSettingsMenu();
            mainMenu.addSubMenu(SETTINGS_OPTION, settingsMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.SALES_CLERK)) {
            final Menu customerMenu = buildCustomerMenu();
            mainMenu.addSubMenu(CUSTOMER_OPTION, customerMenu);
            final Menu productMenu = buildProductMenu();
            mainMenu.addSubMenu(PRODUCT_OPTION, productMenu);
            final Menu orderMenu = buildOrderMenu();
            mainMenu.addSubMenu(ORDER_OPTION, orderMenu);
            }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.SALES_MANAGER)) {
            final Menu surveyMenu = buildSurveyMenu();
            mainMenu.addSubMenu(SURVEY_OPTION, surveyMenu);

        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.WAREHOUSE_EMPLOYEE)) {
            final Menu warehouseMenu = buildWarehouseMenu();
            mainMenu.addSubMenu(WAREHOUSE_OPTION, warehouseMenu);
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildAdminSettingsMenu() {
        final Menu menu = new Menu("Settings >");

        menu.addItem(SET_KITCHEN_ALERT_LIMIT_OPTION, "Set kitchen alert limit",
                new ShowMessageAction("Not implemented yet"));
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildSurveyMenu() {
        final Menu menu = new Menu("Survey >");

        menu.addItem(CREATE_SURVEY_OPTION, "Create Survey", new CreateSurveyAction());
        menu.addItem(GET_STATISTICAL_REPORT_OPTION, "Get Statistical Report" , new GetStatisticalReportAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCustomerMenu() {
        final Menu menu = new Menu("Customer >");

        menu.addItem(REGISTER_CUSTOMER_OPTION, "Register Customer", new RegisterCustomerAction());
        menu.addItem(CHECK_ORDER_STATUS_OPTION, "Check Order Status " , new CheckOrderStatusAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildProductMenu() {
        final Menu menu = new Menu("Product >");

        menu.addItem(SPECIFY_PRODUCT_OPTION, "Specify New Product For Sale", new SpecifyProductAction());
        menu.addItem(SEARCH_PRODUCTS_OPTION, "View Product Catalog", new ListProductsAction());
        menu.addItem(NEW_PRODUCT_ORDER_OPTION, "New Product Order", new CreateOrderBySalesClerkAction());
        menu.addItem(NEW_CATEGORY_OPTION, "Define a new Category of Products", new SpecifyCategoryAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildOrderMenu() {
        final Menu menu = new Menu("Order >");

        menu.addItem(UPDATE_ORDER_TO_BEING_DELIVERED_OPTION, "Update a Order to As Being Delivered", new UpdateOrderToBeingDeliveredAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildWarehouseMenu() {
        final Menu menu = new Menu("Warehouse >");

        menu.addItem(CONFIG_AVG_OPTION, "Config AVG", new ConfigureAGVAction());
        menu.addItem(OPEN_WEB_DASHBOARD, "Web Warehouse Dashboard", new WebDashboardAction());
        menu.addItem(ASSIGN_ORDER, "Assign Order to AGV", new ListOrderToAGVAction());
        menu.addItem(CHANGE_ORDER_TO_DELIVERED_OPTION, "Change a Client Order Status", new UpdateOrderAction());
        menu.addItem(IMPORT_WAREHOUSE_PLANT, "Import Warehouse Plant", new ImportWarehouseAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }



}

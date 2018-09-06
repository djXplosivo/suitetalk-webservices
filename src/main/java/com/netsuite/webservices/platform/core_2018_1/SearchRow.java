
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_1.CalendarEventSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_1.PhoneCallSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_1.ProjectTaskSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_1.ResourceAllocationSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_1.TaskSearchRow;
import com.netsuite.webservices.documents.filecabinet_2018_1.FileSearchRow;
import com.netsuite.webservices.documents.filecabinet_2018_1.FolderSearchRow;
import com.netsuite.webservices.general.communication_2018_1.MessageSearchRow;
import com.netsuite.webservices.general.communication_2018_1.NoteSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.AccountSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.AccountingPeriodSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.BillingScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.BinSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.BomRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.BomSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ClassificationSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ConsolidatedExchangeRateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ContactCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ContactRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.CostCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.CurrencyRateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerMessageSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.DepartmentSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ExpenseCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.FairValuePriceSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.GiftCertificateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.GlobalAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.InventoryNumberSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ItemAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ItemRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.ItemSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.LocationSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.NexusSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.NoteTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.OtherNameCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.PartnerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.PaymentMethodSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.PriceLevelSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.PricingGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecTemplateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.SalesRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.SalesTaxItemSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.SubsidiarySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.TaxGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.TaxTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.TermSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.UnitsTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.VendorCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_1.WinLossReasonSearchRow;
import com.netsuite.webservices.lists.employees_2018_1.EmployeeSearchRow;
import com.netsuite.webservices.lists.employees_2018_1.HcmJobSearchRow;
import com.netsuite.webservices.lists.employees_2018_1.PayrollItemSearchRow;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignSearchRow;
import com.netsuite.webservices.lists.marketing_2018_1.CouponCodeSearchRow;
import com.netsuite.webservices.lists.marketing_2018_1.PromotionCodeSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.BillingAccountSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.ContactSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.EntityGroupSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.JobSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.JobStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.JobTypeSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.OriginatingLeadSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.PartnerSearchRow;
import com.netsuite.webservices.lists.relationships_2018_1.VendorSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingCostTemplateSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingOperationTaskSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingRoutingSearchRow;
import com.netsuite.webservices.lists.support_2018_1.IssueSearchRow;
import com.netsuite.webservices.lists.support_2018_1.SolutionSearchRow;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseSearchRow;
import com.netsuite.webservices.lists.support_2018_1.TopicSearchRow;
import com.netsuite.webservices.lists.website_2018_1.SiteCategorySearchRow;
import com.netsuite.webservices.setup.customization_2018_1.CustomListSearchRow;
import com.netsuite.webservices.setup.customization_2018_1.CustomRecordSearchRow;
import com.netsuite.webservices.transactions.customers_2018_1.ChargeSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemDemandPlanSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemSupplyPlanSearchRow;
import com.netsuite.webservices.transactions.employees_2018_1.PaycheckSearchRow;
import com.netsuite.webservices.transactions.employees_2018_1.TimeBillSearchRow;
import com.netsuite.webservices.transactions.employees_2018_1.TimeEntrySearchRow;
import com.netsuite.webservices.transactions.employees_2018_1.TimeSheetSearchRow;
import com.netsuite.webservices.transactions.financial_2018_1.BudgetSearchRow;
import com.netsuite.webservices.transactions.purchases_2018_1.InboundShipmentSearchRow;
import com.netsuite.webservices.transactions.sales_2018_1.AccountingTransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2018_1.OpportunitySearchRow;
import com.netsuite.webservices.transactions.sales_2018_1.TransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2018_1.UsageSearchRow;


/**
 * <p>Java class for SearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRow")
@XmlSeeAlso({
    SearchRowBasic.class,
    TaskSearchRow.class,
    PhoneCallSearchRow.class,
    ProjectTaskSearchRow.class,
    ResourceAllocationSearchRow.class,
    CalendarEventSearchRow.class,
    MessageSearchRow.class,
    NoteSearchRow.class,
    FileSearchRow.class,
    FolderSearchRow.class,
    ContactSearchRow.class,
    JobStatusSearchRow.class,
    BillingAccountSearchRow.class,
    OriginatingLeadSearchRow.class,
    CustomerSearchRow.class,
    CustomerStatusSearchRow.class,
    VendorSearchRow.class,
    PartnerSearchRow.class,
    EntityGroupSearchRow.class,
    JobSearchRow.class,
    JobTypeSearchRow.class,
    IssueSearchRow.class,
    SolutionSearchRow.class,
    TopicSearchRow.class,
    SupportCaseSearchRow.class,
    SalesTaxItemSearchRow.class,
    BomRevisionSearchRow.class,
    OtherNameCategorySearchRow.class,
    LocationSearchRow.class,
    CustomerCategorySearchRow.class,
    InventoryNumberSearchRow.class,
    NoteTypeSearchRow.class,
    TaxGroupSearchRow.class,
    ContactRoleSearchRow.class,
    BillingScheduleSearchRow.class,
    ItemAccountMappingSearchRow.class,
    NexusSearchRow.class,
    ClassificationSearchRow.class,
    SubsidiarySearchRow.class,
    RevRecScheduleSearchRow.class,
    GiftCertificateSearchRow.class,
    DepartmentSearchRow.class,
    VendorCategorySearchRow.class,
    ItemRevisionSearchRow.class,
    RevRecTemplateSearchRow.class,
    ExpenseCategorySearchRow.class,
    CurrencyRateSearchRow.class,
    ContactCategorySearchRow.class,
    BomSearchRow.class,
    AccountingPeriodSearchRow.class,
    AccountSearchRow.class,
    TermSearchRow.class,
    TaxTypeSearchRow.class,
    UnitsTypeSearchRow.class,
    PricingGroupSearchRow.class,
    FairValuePriceSearchRow.class,
    ConsolidatedExchangeRateSearchRow.class,
    BinSearchRow.class,
    CostCategorySearchRow.class,
    PriceLevelSearchRow.class,
    GlobalAccountMappingSearchRow.class,
    PartnerCategorySearchRow.class,
    PaymentMethodSearchRow.class,
    ItemSearchRow.class,
    CustomerMessageSearchRow.class,
    WinLossReasonSearchRow.class,
    SalesRoleSearchRow.class,
    UsageSearchRow.class,
    OpportunitySearchRow.class,
    AccountingTransactionSearchRow.class,
    TransactionSearchRow.class,
    InboundShipmentSearchRow.class,
    ChargeSearchRow.class,
    BudgetSearchRow.class,
    CustomRecordSearchRow.class,
    CustomListSearchRow.class,
    PayrollItemSearchRow.class,
    HcmJobSearchRow.class,
    EmployeeSearchRow.class,
    SiteCategorySearchRow.class,
    TimeSheetSearchRow.class,
    TimeEntrySearchRow.class,
    PaycheckSearchRow.class,
    TimeBillSearchRow.class,
    PromotionCodeSearchRow.class,
    CampaignSearchRow.class,
    CouponCodeSearchRow.class,
    ItemDemandPlanSearchRow.class,
    ItemSupplyPlanSearchRow.class,
    ManufacturingCostTemplateSearchRow.class,
    ManufacturingRoutingSearchRow.class,
    ManufacturingOperationTaskSearchRow.class
})
public abstract class SearchRow {


}

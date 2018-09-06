
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_1.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling_2018_1.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_1.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling_2018_1.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_1.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling_2018_1.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_1.ResourceAllocationSearch;
import com.netsuite.webservices.activities.scheduling_2018_1.ResourceAllocationSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_1.TaskSearch;
import com.netsuite.webservices.activities.scheduling_2018_1.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2018_1.FileSearch;
import com.netsuite.webservices.documents.filecabinet_2018_1.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2018_1.FolderSearch;
import com.netsuite.webservices.documents.filecabinet_2018_1.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication_2018_1.MessageSearch;
import com.netsuite.webservices.general.communication_2018_1.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication_2018_1.NoteSearch;
import com.netsuite.webservices.general.communication_2018_1.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.AccountSearch;
import com.netsuite.webservices.lists.accounting_2018_1.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting_2018_1.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.BillingScheduleSearch;
import com.netsuite.webservices.lists.accounting_2018_1.BillingScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.BinSearch;
import com.netsuite.webservices.lists.accounting_2018_1.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.BomRevisionSearch;
import com.netsuite.webservices.lists.accounting_2018_1.BomRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.BomSearch;
import com.netsuite.webservices.lists.accounting_2018_1.BomSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ClassificationSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ConsolidatedExchangeRateSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ConsolidatedExchangeRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ContactCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.ContactCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ContactRoleSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ContactRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.CostCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.CostCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.CurrencyRateSearch;
import com.netsuite.webservices.lists.accounting_2018_1.CurrencyRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerMessageSearch;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerMessageSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.DepartmentSearch;
import com.netsuite.webservices.lists.accounting_2018_1.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ExpenseCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.ExpenseCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.FairValuePriceSearch;
import com.netsuite.webservices.lists.accounting_2018_1.FairValuePriceSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting_2018_1.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.GlobalAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2018_1.GlobalAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.InventoryNumberSearch;
import com.netsuite.webservices.lists.accounting_2018_1.InventoryNumberSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ItemAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ItemAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ItemRevisionSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ItemRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.ItemSearch;
import com.netsuite.webservices.lists.accounting_2018_1.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.LocationSearch;
import com.netsuite.webservices.lists.accounting_2018_1.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.NexusSearch;
import com.netsuite.webservices.lists.accounting_2018_1.NexusSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.NoteTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_1.NoteTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.OtherNameCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.OtherNameCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.PartnerCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.PartnerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.PaymentMethodSearch;
import com.netsuite.webservices.lists.accounting_2018_1.PaymentMethodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting_2018_1.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.PricingGroupSearch;
import com.netsuite.webservices.lists.accounting_2018_1.PricingGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecScheduleSearch;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecTemplateSearch;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecTemplateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting_2018_1.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.SalesTaxItemSearch;
import com.netsuite.webservices.lists.accounting_2018_1.SalesTaxItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting_2018_1.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.TaxGroupSearch;
import com.netsuite.webservices.lists.accounting_2018_1.TaxGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.TaxTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_1.TaxTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.TermSearch;
import com.netsuite.webservices.lists.accounting_2018_1.TermSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.UnitsTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_1.UnitsTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.VendorCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_1.VendorCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_1.WinLossReasonSearch;
import com.netsuite.webservices.lists.accounting_2018_1.WinLossReasonSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_1.EmployeeSearch;
import com.netsuite.webservices.lists.employees_2018_1.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_1.HcmJobSearch;
import com.netsuite.webservices.lists.employees_2018_1.HcmJobSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_1.PayrollItemSearch;
import com.netsuite.webservices.lists.employees_2018_1.PayrollItemSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignSearch;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_1.CouponCodeSearch;
import com.netsuite.webservices.lists.marketing_2018_1.CouponCodeSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_1.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing_2018_1.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.BillingAccountSearch;
import com.netsuite.webservices.lists.relationships_2018_1.BillingAccountSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.ContactSearch;
import com.netsuite.webservices.lists.relationships_2018_1.ContactSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerStatusSearch;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.EntityGroupSearch;
import com.netsuite.webservices.lists.relationships_2018_1.EntityGroupSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.JobSearch;
import com.netsuite.webservices.lists.relationships_2018_1.JobSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.JobStatusSearch;
import com.netsuite.webservices.lists.relationships_2018_1.JobStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.JobTypeSearch;
import com.netsuite.webservices.lists.relationships_2018_1.JobTypeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.OriginatingLeadSearch;
import com.netsuite.webservices.lists.relationships_2018_1.PartnerSearch;
import com.netsuite.webservices.lists.relationships_2018_1.PartnerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_1.VendorSearch;
import com.netsuite.webservices.lists.relationships_2018_1.VendorSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingCostTemplateSearch;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingCostTemplateSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingOperationTaskSearch;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingOperationTaskSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingRoutingSearch;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingRoutingSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_1.IssueSearch;
import com.netsuite.webservices.lists.support_2018_1.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_1.SolutionSearch;
import com.netsuite.webservices.lists.support_2018_1.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseSearch;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_1.TopicSearch;
import com.netsuite.webservices.lists.support_2018_1.TopicSearchAdvanced;
import com.netsuite.webservices.lists.website_2018_1.SiteCategorySearch;
import com.netsuite.webservices.lists.website_2018_1.SiteCategorySearchAdvanced;
import com.netsuite.webservices.setup.customization_2018_1.CustomListSearch;
import com.netsuite.webservices.setup.customization_2018_1.CustomListSearchAdvanced;
import com.netsuite.webservices.setup.customization_2018_1.CustomRecordSearch;
import com.netsuite.webservices.setup.customization_2018_1.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.customers_2018_1.ChargeSearch;
import com.netsuite.webservices.transactions.customers_2018_1.ChargeSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemDemandPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemDemandPlanSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemSupplyPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemSupplyPlanSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_1.PaycheckSearch;
import com.netsuite.webservices.transactions.employees_2018_1.PaycheckSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_1.TimeBillSearch;
import com.netsuite.webservices.transactions.employees_2018_1.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_1.TimeEntrySearch;
import com.netsuite.webservices.transactions.employees_2018_1.TimeEntrySearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_1.TimeSheetSearch;
import com.netsuite.webservices.transactions.employees_2018_1.TimeSheetSearchAdvanced;
import com.netsuite.webservices.transactions.financial_2018_1.BudgetSearch;
import com.netsuite.webservices.transactions.financial_2018_1.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.purchases_2018_1.InboundShipmentSearch;
import com.netsuite.webservices.transactions.purchases_2018_1.InboundShipmentSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_1.AccountingTransactionSearch;
import com.netsuite.webservices.transactions.sales_2018_1.AccountingTransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_1.OpportunitySearch;
import com.netsuite.webservices.transactions.sales_2018_1.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_1.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2018_1.TransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_1.UsageSearch;
import com.netsuite.webservices.transactions.sales_2018_1.UsageSearchAdvanced;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord">
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
@XmlType(name = "SearchRecord")
@XmlSeeAlso({
    SearchRecordBasic.class,
    CalendarEventSearch.class,
    PhoneCallSearch.class,
    ProjectTaskSearch.class,
    TaskSearch.class,
    ResourceAllocationSearch.class,
    TaskSearchAdvanced.class,
    CalendarEventSearchAdvanced.class,
    ResourceAllocationSearchAdvanced.class,
    PhoneCallSearchAdvanced.class,
    ProjectTaskSearchAdvanced.class,
    MessageSearch.class,
    NoteSearch.class,
    MessageSearchAdvanced.class,
    NoteSearchAdvanced.class,
    FolderSearch.class,
    FileSearch.class,
    FileSearchAdvanced.class,
    FolderSearchAdvanced.class,
    JobTypeSearch.class,
    JobStatusSearch.class,
    CustomerStatusSearch.class,
    BillingAccountSearch.class,
    CustomerSearch.class,
    PartnerSearch.class,
    OriginatingLeadSearch.class,
    EntityGroupSearch.class,
    ContactSearch.class,
    VendorSearch.class,
    JobSearch.class,
    EntityGroupSearchAdvanced.class,
    CustomerSearchAdvanced.class,
    CustomerStatusSearchAdvanced.class,
    ContactSearchAdvanced.class,
    JobSearchAdvanced.class,
    JobStatusSearchAdvanced.class,
    JobTypeSearchAdvanced.class,
    BillingAccountSearchAdvanced.class,
    VendorSearchAdvanced.class,
    PartnerSearchAdvanced.class,
    IssueSearch.class,
    SupportCaseSearch.class,
    SolutionSearch.class,
    TopicSearch.class,
    TopicSearchAdvanced.class,
    SupportCaseSearchAdvanced.class,
    IssueSearchAdvanced.class,
    SolutionSearchAdvanced.class,
    RevRecScheduleSearch.class,
    PaymentMethodSearch.class,
    DepartmentSearch.class,
    PriceLevelSearch.class,
    VendorCategorySearch.class,
    BinSearch.class,
    BillingScheduleSearch.class,
    WinLossReasonSearch.class,
    ItemRevisionSearch.class,
    ConsolidatedExchangeRateSearch.class,
    TaxGroupSearch.class,
    OtherNameCategorySearch.class,
    CostCategorySearch.class,
    AccountSearch.class,
    ContactCategorySearch.class,
    AccountingPeriodSearch.class,
    ClassificationSearch.class,
    NexusSearch.class,
    TaxTypeSearch.class,
    CurrencyRateSearch.class,
    CustomerMessageSearch.class,
    ItemAccountMappingSearch.class,
    RevRecTemplateSearch.class,
    SalesTaxItemSearch.class,
    CustomerCategorySearch.class,
    SubsidiarySearch.class,
    LocationSearch.class,
    PartnerCategorySearch.class,
    ExpenseCategorySearch.class,
    BomRevisionSearch.class,
    GlobalAccountMappingSearch.class,
    ItemSearch.class,
    BomSearch.class,
    TermSearch.class,
    GiftCertificateSearch.class,
    PricingGroupSearch.class,
    FairValuePriceSearch.class,
    UnitsTypeSearch.class,
    ContactRoleSearch.class,
    NoteTypeSearch.class,
    InventoryNumberSearch.class,
    SalesRoleSearch.class,
    FairValuePriceSearchAdvanced.class,
    RevRecScheduleSearchAdvanced.class,
    BillingScheduleSearchAdvanced.class,
    ItemAccountMappingSearchAdvanced.class,
    PriceLevelSearchAdvanced.class,
    OtherNameCategorySearchAdvanced.class,
    BinSearchAdvanced.class,
    LocationSearchAdvanced.class,
    CustomerCategorySearchAdvanced.class,
    UnitsTypeSearchAdvanced.class,
    ItemSearchAdvanced.class,
    SubsidiarySearchAdvanced.class,
    TaxGroupSearchAdvanced.class,
    VendorCategorySearchAdvanced.class,
    SalesTaxItemSearchAdvanced.class,
    PricingGroupSearchAdvanced.class,
    CostCategorySearchAdvanced.class,
    WinLossReasonSearchAdvanced.class,
    ExpenseCategorySearchAdvanced.class,
    InventoryNumberSearchAdvanced.class,
    BomRevisionSearchAdvanced.class,
    SalesRoleSearchAdvanced.class,
    AccountSearchAdvanced.class,
    DepartmentSearchAdvanced.class,
    ContactCategorySearchAdvanced.class,
    PaymentMethodSearchAdvanced.class,
    ContactRoleSearchAdvanced.class,
    ItemRevisionSearchAdvanced.class,
    TaxTypeSearchAdvanced.class,
    AccountingPeriodSearchAdvanced.class,
    NoteTypeSearchAdvanced.class,
    ConsolidatedExchangeRateSearchAdvanced.class,
    TermSearchAdvanced.class,
    GlobalAccountMappingSearchAdvanced.class,
    BomSearchAdvanced.class,
    CustomerMessageSearchAdvanced.class,
    NexusSearchAdvanced.class,
    RevRecTemplateSearchAdvanced.class,
    GiftCertificateSearchAdvanced.class,
    CurrencyRateSearchAdvanced.class,
    ClassificationSearchAdvanced.class,
    PartnerCategorySearchAdvanced.class,
    OpportunitySearch.class,
    TransactionSearch.class,
    UsageSearch.class,
    AccountingTransactionSearch.class,
    TransactionSearchAdvanced.class,
    AccountingTransactionSearchAdvanced.class,
    OpportunitySearchAdvanced.class,
    UsageSearchAdvanced.class,
    InboundShipmentSearch.class,
    InboundShipmentSearchAdvanced.class,
    ChargeSearch.class,
    ChargeSearchAdvanced.class,
    BudgetSearch.class,
    BudgetSearchAdvanced.class,
    CustomListSearch.class,
    CustomRecordSearch.class,
    CustomListSearchAdvanced.class,
    CustomRecordSearchAdvanced.class,
    PayrollItemSearch.class,
    HcmJobSearch.class,
    EmployeeSearch.class,
    HcmJobSearchAdvanced.class,
    EmployeeSearchAdvanced.class,
    PayrollItemSearchAdvanced.class,
    SiteCategorySearch.class,
    SiteCategorySearchAdvanced.class,
    TimeSheetSearch.class,
    PaycheckSearch.class,
    TimeBillSearch.class,
    TimeEntrySearch.class,
    TimeEntrySearchAdvanced.class,
    TimeBillSearchAdvanced.class,
    TimeSheetSearchAdvanced.class,
    PaycheckSearchAdvanced.class,
    PromotionCodeSearch.class,
    CouponCodeSearch.class,
    CampaignSearch.class,
    PromotionCodeSearchAdvanced.class,
    CouponCodeSearchAdvanced.class,
    CampaignSearchAdvanced.class,
    ItemDemandPlanSearch.class,
    ItemSupplyPlanSearch.class,
    ItemSupplyPlanSearchAdvanced.class,
    ItemDemandPlanSearchAdvanced.class,
    ManufacturingOperationTaskSearch.class,
    ManufacturingRoutingSearch.class,
    ManufacturingCostTemplateSearch.class,
    ManufacturingRoutingSearchAdvanced.class,
    ManufacturingCostTemplateSearchAdvanced.class,
    ManufacturingOperationTaskSearchAdvanced.class
})
public abstract class SearchRecord {


}

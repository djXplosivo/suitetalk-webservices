
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_1.CalendarEvent;
import com.netsuite.webservices.activities.scheduling_2018_1.PhoneCall;
import com.netsuite.webservices.activities.scheduling_2018_1.ProjectTask;
import com.netsuite.webservices.activities.scheduling_2018_1.ResourceAllocation;
import com.netsuite.webservices.activities.scheduling_2018_1.Task;
import com.netsuite.webservices.documents.filecabinet_2018_1.File;
import com.netsuite.webservices.documents.filecabinet_2018_1.Folder;
import com.netsuite.webservices.general.communication_2018_1.Message;
import com.netsuite.webservices.general.communication_2018_1.Note;
import com.netsuite.webservices.lists.accounting_2018_1.Account;
import com.netsuite.webservices.lists.accounting_2018_1.AccountingPeriod;
import com.netsuite.webservices.lists.accounting_2018_1.AssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_1.BillingSchedule;
import com.netsuite.webservices.lists.accounting_2018_1.Bin;
import com.netsuite.webservices.lists.accounting_2018_1.Bom;
import com.netsuite.webservices.lists.accounting_2018_1.BomRevision;
import com.netsuite.webservices.lists.accounting_2018_1.BudgetCategory;
import com.netsuite.webservices.lists.accounting_2018_1.Classification;
import com.netsuite.webservices.lists.accounting_2018_1.ConsolidatedExchangeRate;
import com.netsuite.webservices.lists.accounting_2018_1.ContactCategory;
import com.netsuite.webservices.lists.accounting_2018_1.ContactRole;
import com.netsuite.webservices.lists.accounting_2018_1.CostCategory;
import com.netsuite.webservices.lists.accounting_2018_1.Currency;
import com.netsuite.webservices.lists.accounting_2018_1.CurrencyRate;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerCategory;
import com.netsuite.webservices.lists.accounting_2018_1.CustomerMessage;
import com.netsuite.webservices.lists.accounting_2018_1.Department;
import com.netsuite.webservices.lists.accounting_2018_1.DescriptionItem;
import com.netsuite.webservices.lists.accounting_2018_1.DiscountItem;
import com.netsuite.webservices.lists.accounting_2018_1.DownloadItem;
import com.netsuite.webservices.lists.accounting_2018_1.ExpenseCategory;
import com.netsuite.webservices.lists.accounting_2018_1.FairValuePrice;
import com.netsuite.webservices.lists.accounting_2018_1.GiftCertificate;
import com.netsuite.webservices.lists.accounting_2018_1.GiftCertificateItem;
import com.netsuite.webservices.lists.accounting_2018_1.GlobalAccountMapping;
import com.netsuite.webservices.lists.accounting_2018_1.InventoryItem;
import com.netsuite.webservices.lists.accounting_2018_1.InventoryNumber;
import com.netsuite.webservices.lists.accounting_2018_1.ItemAccountMapping;
import com.netsuite.webservices.lists.accounting_2018_1.ItemGroup;
import com.netsuite.webservices.lists.accounting_2018_1.ItemRevision;
import com.netsuite.webservices.lists.accounting_2018_1.KitItem;
import com.netsuite.webservices.lists.accounting_2018_1.LeadSource;
import com.netsuite.webservices.lists.accounting_2018_1.Location;
import com.netsuite.webservices.lists.accounting_2018_1.LotNumberedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_1.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting_2018_1.MarkupItem;
import com.netsuite.webservices.lists.accounting_2018_1.Nexus;
import com.netsuite.webservices.lists.accounting_2018_1.NonInventoryPurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_1.NonInventoryResaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.NonInventorySaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.NoteType;
import com.netsuite.webservices.lists.accounting_2018_1.OtherChargePurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_1.OtherChargeResaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.OtherChargeSaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.OtherNameCategory;
import com.netsuite.webservices.lists.accounting_2018_1.PartnerCategory;
import com.netsuite.webservices.lists.accounting_2018_1.PaymentItem;
import com.netsuite.webservices.lists.accounting_2018_1.PaymentMethod;
import com.netsuite.webservices.lists.accounting_2018_1.PriceLevel;
import com.netsuite.webservices.lists.accounting_2018_1.PricingGroup;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecSchedule;
import com.netsuite.webservices.lists.accounting_2018_1.RevRecTemplate;
import com.netsuite.webservices.lists.accounting_2018_1.SalesRole;
import com.netsuite.webservices.lists.accounting_2018_1.SalesTaxItem;
import com.netsuite.webservices.lists.accounting_2018_1.SerializedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_1.SerializedInventoryItem;
import com.netsuite.webservices.lists.accounting_2018_1.ServicePurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_1.ServiceResaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.ServiceSaleItem;
import com.netsuite.webservices.lists.accounting_2018_1.State;
import com.netsuite.webservices.lists.accounting_2018_1.Subsidiary;
import com.netsuite.webservices.lists.accounting_2018_1.SubtotalItem;
import com.netsuite.webservices.lists.accounting_2018_1.TaxAcct;
import com.netsuite.webservices.lists.accounting_2018_1.TaxGroup;
import com.netsuite.webservices.lists.accounting_2018_1.TaxType;
import com.netsuite.webservices.lists.accounting_2018_1.Term;
import com.netsuite.webservices.lists.accounting_2018_1.UnitsType;
import com.netsuite.webservices.lists.accounting_2018_1.VendorCategory;
import com.netsuite.webservices.lists.accounting_2018_1.WinLossReason;
import com.netsuite.webservices.lists.employees_2018_1.Employee;
import com.netsuite.webservices.lists.employees_2018_1.HcmJob;
import com.netsuite.webservices.lists.employees_2018_1.PayrollItem;
import com.netsuite.webservices.lists.marketing_2018_1.Campaign;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignAudience;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignCategory;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignChannel;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignFamily;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignOffer;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignResponse;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignSearchEngine;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignSubscription;
import com.netsuite.webservices.lists.marketing_2018_1.CampaignVertical;
import com.netsuite.webservices.lists.marketing_2018_1.CouponCode;
import com.netsuite.webservices.lists.marketing_2018_1.PromotionCode;
import com.netsuite.webservices.lists.relationships_2018_1.BillingAccount;
import com.netsuite.webservices.lists.relationships_2018_1.Contact;
import com.netsuite.webservices.lists.relationships_2018_1.Customer;
import com.netsuite.webservices.lists.relationships_2018_1.CustomerStatus;
import com.netsuite.webservices.lists.relationships_2018_1.EntityGroup;
import com.netsuite.webservices.lists.relationships_2018_1.Job;
import com.netsuite.webservices.lists.relationships_2018_1.JobStatus;
import com.netsuite.webservices.lists.relationships_2018_1.JobType;
import com.netsuite.webservices.lists.relationships_2018_1.Partner;
import com.netsuite.webservices.lists.relationships_2018_1.Vendor;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingCostTemplate;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingOperationTask;
import com.netsuite.webservices.lists.supplychain_2018_1.ManufacturingRouting;
import com.netsuite.webservices.lists.support_2018_1.Issue;
import com.netsuite.webservices.lists.support_2018_1.Solution;
import com.netsuite.webservices.lists.support_2018_1.SupportCase;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseIssue;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseOrigin;
import com.netsuite.webservices.lists.support_2018_1.SupportCasePriority;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseStatus;
import com.netsuite.webservices.lists.support_2018_1.SupportCaseType;
import com.netsuite.webservices.lists.support_2018_1.Topic;
import com.netsuite.webservices.lists.website_2018_1.SiteCategory;
import com.netsuite.webservices.platform.common_2018_1.Address;
import com.netsuite.webservices.platform.common_2018_1.InventoryDetail;
import com.netsuite.webservices.platform.common_2018_1.LandedCost;
import com.netsuite.webservices.setup.customization_2018_1.CustomFieldType;
import com.netsuite.webservices.setup.customization_2018_1.CustomList;
import com.netsuite.webservices.setup.customization_2018_1.CustomRecord;
import com.netsuite.webservices.setup.customization_2018_1.CustomRecordType;
import com.netsuite.webservices.setup.customization_2018_1.CustomTransaction;
import com.netsuite.webservices.transactions.bank_2018_1.Check;
import com.netsuite.webservices.transactions.bank_2018_1.Deposit;
import com.netsuite.webservices.transactions.customers_2018_1.CashRefund;
import com.netsuite.webservices.transactions.customers_2018_1.Charge;
import com.netsuite.webservices.transactions.customers_2018_1.CreditMemo;
import com.netsuite.webservices.transactions.customers_2018_1.CustomerDeposit;
import com.netsuite.webservices.transactions.customers_2018_1.CustomerPayment;
import com.netsuite.webservices.transactions.customers_2018_1.CustomerRefund;
import com.netsuite.webservices.transactions.customers_2018_1.DepositApplication;
import com.netsuite.webservices.transactions.customers_2018_1.ReturnAuthorization;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemDemandPlan;
import com.netsuite.webservices.transactions.demandplanning_2018_1.ItemSupplyPlan;
import com.netsuite.webservices.transactions.employees_2018_1.ExpenseReport;
import com.netsuite.webservices.transactions.employees_2018_1.Paycheck;
import com.netsuite.webservices.transactions.employees_2018_1.PaycheckJournal;
import com.netsuite.webservices.transactions.employees_2018_1.TimeBill;
import com.netsuite.webservices.transactions.employees_2018_1.TimeEntry;
import com.netsuite.webservices.transactions.employees_2018_1.TimeSheet;
import com.netsuite.webservices.transactions.financial_2018_1.Budget;
import com.netsuite.webservices.transactions.general_2018_1.AdvInterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2018_1.InterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2018_1.JournalEntry;
import com.netsuite.webservices.transactions.general_2018_1.StatisticalJournalEntry;
import com.netsuite.webservices.transactions.inventory_2018_1.AssemblyBuild;
import com.netsuite.webservices.transactions.inventory_2018_1.AssemblyUnbuild;
import com.netsuite.webservices.transactions.inventory_2018_1.BinTransfer;
import com.netsuite.webservices.transactions.inventory_2018_1.BinWorksheet;
import com.netsuite.webservices.transactions.inventory_2018_1.InterCompanyTransferOrder;
import com.netsuite.webservices.transactions.inventory_2018_1.InventoryAdjustment;
import com.netsuite.webservices.transactions.inventory_2018_1.InventoryCostRevaluation;
import com.netsuite.webservices.transactions.inventory_2018_1.InventoryTransfer;
import com.netsuite.webservices.transactions.inventory_2018_1.TransferOrder;
import com.netsuite.webservices.transactions.inventory_2018_1.WorkOrder;
import com.netsuite.webservices.transactions.inventory_2018_1.WorkOrderClose;
import com.netsuite.webservices.transactions.inventory_2018_1.WorkOrderCompletion;
import com.netsuite.webservices.transactions.inventory_2018_1.WorkOrderIssue;
import com.netsuite.webservices.transactions.purchases_2018_1.InboundShipment;
import com.netsuite.webservices.transactions.purchases_2018_1.ItemReceipt;
import com.netsuite.webservices.transactions.purchases_2018_1.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases_2018_1.PurchaseRequisition;
import com.netsuite.webservices.transactions.purchases_2018_1.VendorBill;
import com.netsuite.webservices.transactions.purchases_2018_1.VendorCredit;
import com.netsuite.webservices.transactions.purchases_2018_1.VendorPayment;
import com.netsuite.webservices.transactions.purchases_2018_1.VendorReturnAuthorization;
import com.netsuite.webservices.transactions.sales_2018_1.CashSale;
import com.netsuite.webservices.transactions.sales_2018_1.Estimate;
import com.netsuite.webservices.transactions.sales_2018_1.Invoice;
import com.netsuite.webservices.transactions.sales_2018_1.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2018_1.Opportunity;
import com.netsuite.webservices.transactions.sales_2018_1.SalesOrder;
import com.netsuite.webservices.transactions.sales_2018_1.Usage;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nullFieldList" type="{urn:core_2018_1.platform.webservices.netsuite.com}NullField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    LandedCost.class,
    InventoryDetail.class,
    Address.class,
    Task.class,
    ResourceAllocation.class,
    ProjectTask.class,
    PhoneCall.class,
    CalendarEvent.class,
    Message.class,
    Note.class,
    Folder.class,
    File.class,
    Customer.class,
    EntityGroup.class,
    Vendor.class,
    BillingAccount.class,
    Contact.class,
    JobStatus.class,
    JobType.class,
    CustomerStatus.class,
    Job.class,
    Partner.class,
    Issue.class,
    SupportCaseType.class,
    SupportCaseIssue.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCasePriority.class,
    Topic.class,
    Solution.class,
    SupportCaseOrigin.class,
    MarkupItem.class,
    Account.class,
    Bin.class,
    PricingGroup.class,
    ItemAccountMapping.class,
    InventoryNumber.class,
    Department.class,
    ServicePurchaseItem.class,
    Currency.class,
    Classification.class,
    State.class,
    FairValuePrice.class,
    ItemGroup.class,
    CustomerMessage.class,
    OtherChargePurchaseItem.class,
    CustomerCategory.class,
    AssemblyItem.class,
    WinLossReason.class,
    ContactCategory.class,
    ContactRole.class,
    OtherChargeResaleItem.class,
    PriceLevel.class,
    CostCategory.class,
    DescriptionItem.class,
    GiftCertificateItem.class,
    BillingSchedule.class,
    GiftCertificate.class,
    BudgetCategory.class,
    BomRevision.class,
    NoteType.class,
    LotNumberedInventoryItem.class,
    CurrencyRate.class,
    UnitsType.class,
    GlobalAccountMapping.class,
    OtherNameCategory.class,
    ServiceResaleItem.class,
    VendorCategory.class,
    PaymentItem.class,
    NonInventorySaleItem.class,
    Subsidiary.class,
    SubtotalItem.class,
    RevRecTemplate.class,
    AccountingPeriod.class,
    DiscountItem.class,
    Term.class,
    DownloadItem.class,
    TaxType.class,
    LeadSource.class,
    TaxGroup.class,
    LotNumberedAssemblyItem.class,
    PaymentMethod.class,
    InventoryItem.class,
    PartnerCategory.class,
    Bom.class,
    Nexus.class,
    SerializedInventoryItem.class,
    TaxAcct.class,
    NonInventoryResaleItem.class,
    ConsolidatedExchangeRate.class,
    SalesTaxItem.class,
    ServiceSaleItem.class,
    KitItem.class,
    ItemRevision.class,
    RevRecSchedule.class,
    SerializedAssemblyItem.class,
    ExpenseCategory.class,
    SalesRole.class,
    NonInventoryPurchaseItem.class,
    OtherChargeSaleItem.class,
    Location.class,
    Estimate.class,
    Invoice.class,
    CashSale.class,
    Opportunity.class,
    Usage.class,
    SalesOrder.class,
    ItemFulfillment.class,
    VendorReturnAuthorization.class,
    VendorBill.class,
    PurchaseOrder.class,
    VendorPayment.class,
    VendorCredit.class,
    ItemReceipt.class,
    PurchaseRequisition.class,
    InboundShipment.class,
    Charge.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    DepositApplication.class,
    CustomerRefund.class,
    CreditMemo.class,
    CustomerDeposit.class,
    CashRefund.class,
    Budget.class,
    Check.class,
    Deposit.class,
    WorkOrder.class,
    InventoryCostRevaluation.class,
    BinWorksheet.class,
    AssemblyUnbuild.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    TransferOrder.class,
    WorkOrderIssue.class,
    InterCompanyTransferOrder.class,
    BinTransfer.class,
    InventoryTransfer.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    StatisticalJournalEntry.class,
    InterCompanyJournalEntry.class,
    AdvInterCompanyJournalEntry.class,
    JournalEntry.class,
    CustomTransaction.class,
    CustomRecordType.class,
    CustomList.class,
    CustomRecord.class,
    CustomFieldType.class,
    Employee.class,
    HcmJob.class,
    PayrollItem.class,
    SiteCategory.class,
    TimeSheet.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    Paycheck.class,
    CampaignSearchEngine.class,
    CampaignResponse.class,
    PromotionCode.class,
    CampaignOffer.class,
    CampaignSubscription.class,
    CampaignCategory.class,
    CampaignAudience.class,
    Campaign.class,
    CampaignFamily.class,
    CampaignVertical.class,
    CouponCode.class,
    CampaignChannel.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    ManufacturingOperationTask.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}

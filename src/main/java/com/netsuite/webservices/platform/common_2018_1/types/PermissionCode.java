
package com.netsuite.webservices.platform.common_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accessPaymentAuditLog"/>
 *     &lt;enumeration value="_accessTokenManagement"/>
 *     &lt;enumeration value="_accountDetail"/>
 *     &lt;enumeration value="_accounting"/>
 *     &lt;enumeration value="_accountingBook"/>
 *     &lt;enumeration value="_accountingLists"/>
 *     &lt;enumeration value="_accounts"/>
 *     &lt;enumeration value="_accountsPayable"/>
 *     &lt;enumeration value="_accountsPayableGraphing"/>
 *     &lt;enumeration value="_accountsPayableRegister"/>
 *     &lt;enumeration value="_accountsReceivable"/>
 *     &lt;enumeration value="_accountsReceivableGraphing"/>
 *     &lt;enumeration value="_accountsReceivableRegister"/>
 *     &lt;enumeration value="_accountsReceivableUnbilled"/>
 *     &lt;enumeration value="_address"/>
 *     &lt;enumeration value="_adjustInventory"/>
 *     &lt;enumeration value="_adjustInventoryWorksheet"/>
 *     &lt;enumeration value="_admindocs"/>
 *     &lt;enumeration value="_admindocsEu"/>
 *     &lt;enumeration value="_admindocsNa"/>
 *     &lt;enumeration value="_admindocsOther"/>
 *     &lt;enumeration value="_adpImportData"/>
 *     &lt;enumeration value="_adpSetup"/>
 *     &lt;enumeration value="_advancedAnalytics"/>
 *     &lt;enumeration value="_advancedGovernmentIssuedIds"/>
 *     &lt;enumeration value="_advancedOrderManagement"/>
 *     &lt;enumeration value="_advancedPDFHTMLTemplates"/>
 *     &lt;enumeration value="_allocationSchedules"/>
 *     &lt;enumeration value="_allowJsHtmlUploads"/>
 *     &lt;enumeration value="_allowNonGLChanges"/>
 *     &lt;enumeration value="_allowPendingBookJournalEntry"/>
 *     &lt;enumeration value="_amendW4"/>
 *     &lt;enumeration value="_amortizationReports"/>
 *     &lt;enumeration value="_amortizationSchedules"/>
 *     &lt;enumeration value="_applicationPublishers"/>
 *     &lt;enumeration value="_approveDirectDeposit"/>
 *     &lt;enumeration value="_approveEFT"/>
 *     &lt;enumeration value="_approveOnlineBillPayments"/>
 *     &lt;enumeration value="_approveVendorPayments"/>
 *     &lt;enumeration value="_auditTrail"/>
 *     &lt;enumeration value="_backupYourData"/>
 *     &lt;enumeration value="_balanceLocationCostingGroupAccounts"/>
 *     &lt;enumeration value="_balanceSheet"/>
 *     &lt;enumeration value="_bankAccountRegisters"/>
 *     &lt;enumeration value="_bankConnectivityPlugInConfiguration"/>
 *     &lt;enumeration value="_basicGovernmentIssuedIds"/>
 *     &lt;enumeration value="_billInboundShipment"/>
 *     &lt;enumeration value="_billingInformation"/>
 *     &lt;enumeration value="_billingSchedules"/>
 *     &lt;enumeration value="_billOfDistribution"/>
 *     &lt;enumeration value="_billOfMaterials"/>
 *     &lt;enumeration value="_billOfMaterialsInquiry"/>
 *     &lt;enumeration value="_billPurchaseOrders"/>
 *     &lt;enumeration value="_bills"/>
 *     &lt;enumeration value="_billSalesOrders"/>
 *     &lt;enumeration value="_bins"/>
 *     &lt;enumeration value="_binTransfer"/>
 *     &lt;enumeration value="_binWorksheet"/>
 *     &lt;enumeration value="_blanketPurchaseOrder"/>
 *     &lt;enumeration value="_blanketPurchaseOrderApproval"/>
 *     &lt;enumeration value="_budget"/>
 *     &lt;enumeration value="_buildAssemblies"/>
 *     &lt;enumeration value="_buildWorkOrders"/>
 *     &lt;enumeration value="_calculateTime"/>
 *     &lt;enumeration value="_calendar"/>
 *     &lt;enumeration value="_campaignHistory"/>
 *     &lt;enumeration value="_caseAlerts"/>
 *     &lt;enumeration value="_cases"/>
 *     &lt;enumeration value="_cashFlowStatement"/>
 *     &lt;enumeration value="_cashSale"/>
 *     &lt;enumeration value="_cashSaleRefund"/>
 *     &lt;enumeration value="_changeEmailOrPassword"/>
 *     &lt;enumeration value="_changeRole"/>
 *     &lt;enumeration value="_chargeRule"/>
 *     &lt;enumeration value="_chargeRunRules"/>
 *     &lt;enumeration value="_check"/>
 *     &lt;enumeration value="_checkItemAvailability"/>
 *     &lt;enumeration value="_classes"/>
 *     &lt;enumeration value="_classSegmentMapping"/>
 *     &lt;enumeration value="_closeAccount"/>
 *     &lt;enumeration value="_closeWorkOrders"/>
 *     &lt;enumeration value="_colorThemes"/>
 *     &lt;enumeration value="_commerceCategories"/>
 *     &lt;enumeration value="_commissionFeatureSetup"/>
 *     &lt;enumeration value="_commissionReports"/>
 *     &lt;enumeration value="_commitOrders"/>
 *     &lt;enumeration value="_commitPayroll"/>
 *     &lt;enumeration value="_companies"/>
 *     &lt;enumeration value="_companyInformation"/>
 *     &lt;enumeration value="_companyPreferences"/>
 *     &lt;enumeration value="_competitors"/>
 *     &lt;enumeration value="_componentWhereUsed"/>
 *     &lt;enumeration value="_contactRoles"/>
 *     &lt;enumeration value="_contacts"/>
 *     &lt;enumeration value="_controlSuitescriptAndWorkflowTriggersInWebServicesRequest"/>
 *     &lt;enumeration value="_controlSuitescriptAndWorkflowTriggersPerCsvImport"/>
 *     &lt;enumeration value="_convertClassesToDepartments"/>
 *     &lt;enumeration value="_convertClassesToLocations"/>
 *     &lt;enumeration value="_copyBudgets"/>
 *     &lt;enumeration value="_copyChartOfAccountsToNewCompany"/>
 *     &lt;enumeration value="_copyProjectTasks"/>
 *     &lt;enumeration value="_costedBillOfMaterialsInquiry"/>
 *     &lt;enumeration value="_costOfGoodsSoldRegisters"/>
 *     &lt;enumeration value="_countInventory"/>
 *     &lt;enumeration value="_createAllocationSchedules"/>
 *     &lt;enumeration value="_createConsolidationCompany"/>
 *     &lt;enumeration value="_createFiscalCalendar"/>
 *     &lt;enumeration value="_createInventoryCounts"/>
 *     &lt;enumeration value="_creditCard"/>
 *     &lt;enumeration value="_creditCardProcessing"/>
 *     &lt;enumeration value="_creditCardRefund"/>
 *     &lt;enumeration value="_creditCardRegisters"/>
 *     &lt;enumeration value="_creditMemo"/>
 *     &lt;enumeration value="_creditReturns"/>
 *     &lt;enumeration value="_crmGroups"/>
 *     &lt;enumeration value="_crmLists"/>
 *     &lt;enumeration value="_cspSetup"/>
 *     &lt;enumeration value="_currency"/>
 *     &lt;enumeration value="_currencyAdjustmentJournal"/>
 *     &lt;enumeration value="_currencyRevaluation"/>
 *     &lt;enumeration value="_customAddressForm"/>
 *     &lt;enumeration value="_customBodyFields"/>
 *     &lt;enumeration value="_customCenterCategories"/>
 *     &lt;enumeration value="_customCenterLinks"/>
 *     &lt;enumeration value="_customCenters"/>
 *     &lt;enumeration value="_customCenterTabs"/>
 *     &lt;enumeration value="_customColumnFields"/>
 *     &lt;enumeration value="_customEntityFields"/>
 *     &lt;enumeration value="_customEntryForms"/>
 *     &lt;enumeration value="_customerCharge"/>
 *     &lt;enumeration value="_customerDeposit"/>
 *     &lt;enumeration value="_customerPayment"/>
 *     &lt;enumeration value="_customerPaymentAuthorization"/>
 *     &lt;enumeration value="_customerProfile"/>
 *     &lt;enumeration value="_customerRefund"/>
 *     &lt;enumeration value="_customers"/>
 *     &lt;enumeration value="_customerStatus"/>
 *     &lt;enumeration value="_customEventFields"/>
 *     &lt;enumeration value="_customFields"/>
 *     &lt;enumeration value="_customGlLinesPlugInAuditLog"/>
 *     &lt;enumeration value="_customGlLinesPlugInAuditLogSegments"/>
 *     &lt;enumeration value="_customHTMLLayouts"/>
 *     &lt;enumeration value="_customItemFields"/>
 *     &lt;enumeration value="_customItemNumberFields"/>
 *     &lt;enumeration value="_customizePage"/>
 *     &lt;enumeration value="_customLists"/>
 *     &lt;enumeration value="_customPDFLayouts"/>
 *     &lt;enumeration value="_customRecordEntries"/>
 *     &lt;enumeration value="_customRecordTypes"/>
 *     &lt;enumeration value="_customSegments"/>
 *     &lt;enumeration value="_customSublist"/>
 *     &lt;enumeration value="_customSublists"/>
 *     &lt;enumeration value="_customSubtabs"/>
 *     &lt;enumeration value="_customTransactionFields"/>
 *     &lt;enumeration value="_customTransactionForms"/>
 *     &lt;enumeration value="_customTransactionTypes"/>
 *     &lt;enumeration value="_deferredExpenseRegisters"/>
 *     &lt;enumeration value="_deferredExpenseReports"/>
 *     &lt;enumeration value="_deferredRevenueRegisters"/>
 *     &lt;enumeration value="_deleteAllData"/>
 *     &lt;enumeration value="_deletedRecords"/>
 *     &lt;enumeration value="_deleteEvent"/>
 *     &lt;enumeration value="_departments"/>
 *     &lt;enumeration value="_departmentSegmentMapping"/>
 *     &lt;enumeration value="_deposit"/>
 *     &lt;enumeration value="_depositApplication"/>
 *     &lt;enumeration value="_deviceIdManagement"/>
 *     &lt;enumeration value="_directDepositStatus"/>
 *     &lt;enumeration value="_distributeInventory"/>
 *     &lt;enumeration value="_distributionNetwork"/>
 *     &lt;enumeration value="_documentsAndFiles"/>
 *     &lt;enumeration value="_duplicateCaseManagement"/>
 *     &lt;enumeration value="_duplicateDetectionSetup"/>
 *     &lt;enumeration value="_duplicateRecordManagement"/>
 *     &lt;enumeration value="_editBankingInformation"/>
 *     &lt;enumeration value="_editForecast"/>
 *     &lt;enumeration value="_editManagerForecast"/>
 *     &lt;enumeration value="_editProfile"/>
 *     &lt;enumeration value="_eftStatus"/>
 *     &lt;enumeration value="_emailReports"/>
 *     &lt;enumeration value="_emailTemplate"/>
 *     &lt;enumeration value="_employeeAdministration"/>
 *     &lt;enumeration value="_employeeCenterPublishing"/>
 *     &lt;enumeration value="_employeeChangeReason"/>
 *     &lt;enumeration value="_employeeCommissionSchedulesPlans"/>
 *     &lt;enumeration value="_employeeCommissionTransaction"/>
 *     &lt;enumeration value="_employeeCommissionTransactionApproval"/>
 *     &lt;enumeration value="_employeeConfidential"/>
 *     &lt;enumeration value="_employeeEffectiveDating"/>
 *     &lt;enumeration value="_employeePublic"/>
 *     &lt;enumeration value="_employeeRecord"/>
 *     &lt;enumeration value="_employeeReminders"/>
 *     &lt;enumeration value="_employees"/>
 *     &lt;enumeration value="_employeeSelf"/>
 *     &lt;enumeration value="_employeeSocialSecurityNumbers"/>
 *     &lt;enumeration value="_enableFeatures"/>
 *     &lt;enumeration value="_enterCompletions"/>
 *     &lt;enumeration value="_enterOpeningBalances"/>
 *     &lt;enumeration value="_enterVendorCredits"/>
 *     &lt;enumeration value="_enterYearToDatePayrollAdjustments"/>
 *     &lt;enumeration value="_entityAccountMapping"/>
 *     &lt;enumeration value="_equityRegisters"/>
 *     &lt;enumeration value="_escalationAssignment"/>
 *     &lt;enumeration value="_escalationAssignmentRule"/>
 *     &lt;enumeration value="_establishQuotas"/>
 *     &lt;enumeration value="_estimate"/>
 *     &lt;enumeration value="_events"/>
 *     &lt;enumeration value="_expenseAmortizationPlan"/>
 *     &lt;enumeration value="_expenseAmortizationRule"/>
 *     &lt;enumeration value="_expenseCategories"/>
 *     &lt;enumeration value="_expenseRegisters"/>
 *     &lt;enumeration value="_expenseReport"/>
 *     &lt;enumeration value="_expenses"/>
 *     &lt;enumeration value="_exportAsIIF"/>
 *     &lt;enumeration value="_exportLists"/>
 *     &lt;enumeration value="_fairValueDimension"/>
 *     &lt;enumeration value="_fairValueFormula"/>
 *     &lt;enumeration value="_fairValuePrice"/>
 *     &lt;enumeration value="_faxMessages"/>
 *     &lt;enumeration value="_faxTemplate"/>
 *     &lt;enumeration value="_features"/>
 *     &lt;enumeration value="_financeCharge"/>
 *     &lt;enumeration value="_financeChargePreferences"/>
 *     &lt;enumeration value="_financialHistory"/>
 *     &lt;enumeration value="_financialStatementLayouts"/>
 *     &lt;enumeration value="_financialStatements"/>
 *     &lt;enumeration value="_financialStatementSections"/>
 *     &lt;enumeration value="_findTransaction"/>
 *     &lt;enumeration value="_fiscalCalendars"/>
 *     &lt;enumeration value="_fixedAssetRegisters"/>
 *     &lt;enumeration value="_foreignCurrencyVarianceMapping"/>
 *     &lt;enumeration value="_form1099FederalMiscellaneousIncome"/>
 *     &lt;enumeration value="_form940EmployersAnnualFederalUnemploymentTaxReturn"/>
 *     &lt;enumeration value="_form941EmployersQuarterlyFederalTaxReturn"/>
 *     &lt;enumeration value="_formW2WageAndTaxStatement"/>
 *     &lt;enumeration value="_formW4EmployeesWithholdingAllowanceCertificate"/>
 *     &lt;enumeration value="_fulfillmentExceptionReason"/>
 *     &lt;enumeration value="_fulfillmentRequest"/>
 *     &lt;enumeration value="_fulfillOrders"/>
 *     &lt;enumeration value="_generalLedger"/>
 *     &lt;enumeration value="_generatePriceLists"/>
 *     &lt;enumeration value="_generateRevenueCommitment"/>
 *     &lt;enumeration value="_generateRevenueCommitmentReversals"/>
 *     &lt;enumeration value="_generateSingleOrderRevenueContracts"/>
 *     &lt;enumeration value="_generateStatements"/>
 *     &lt;enumeration value="_genericAdminPermission"/>
 *     &lt;enumeration value="_genericResources"/>
 *     &lt;enumeration value="_globalAccountMapping"/>
 *     &lt;enumeration value="_globalInventoryRelationship"/>
 *     &lt;enumeration value="_governmentIssuedIdTypes"/>
 *     &lt;enumeration value="_grantingAccessToReports"/>
 *     &lt;enumeration value="_gstSummaryReport"/>
 *     &lt;enumeration value="_hideEmployeeInformationOnFinancialReports"/>
 *     &lt;enumeration value="_importCSVFile"/>
 *     &lt;enumeration value="_importOnlineBankingQIFFile"/>
 *     &lt;enumeration value="_importStateSalesTax"/>
 *     &lt;enumeration value="_inboundShipment"/>
 *     &lt;enumeration value="_income"/>
 *     &lt;enumeration value="_incomeRegisters"/>
 *     &lt;enumeration value="_incomeStatement"/>
 *     &lt;enumeration value="_individualPaycheck"/>
 *     &lt;enumeration value="_integration"/>
 *     &lt;enumeration value="_integrationApplication"/>
 *     &lt;enumeration value="_integrationApplications"/>
 *     &lt;enumeration value="_intercompanyAdjustments"/>
 *     &lt;enumeration value="_internalPublisher"/>
 *     &lt;enumeration value="_inventory"/>
 *     &lt;enumeration value="_inventoryCostTemplate"/>
 *     &lt;enumeration value="_inventoryStatus"/>
 *     &lt;enumeration value="_inventoryStatusChange"/>
 *     &lt;enumeration value="_invoice"/>
 *     &lt;enumeration value="_invoiceApproval"/>
 *     &lt;enumeration value="_issueComponents"/>
 *     &lt;enumeration value="_issueReports"/>
 *     &lt;enumeration value="_issues"/>
 *     &lt;enumeration value="_issueSetup"/>
 *     &lt;enumeration value="_itemAccountMapping"/>
 *     &lt;enumeration value="_itemCategoryLayouts"/>
 *     &lt;enumeration value="_itemDemandPlan"/>
 *     &lt;enumeration value="_itemFulfillment"/>
 *     &lt;enumeration value="_itemReceipt"/>
 *     &lt;enumeration value="_itemRevenueCategory"/>
 *     &lt;enumeration value="_itemRevisions"/>
 *     &lt;enumeration value="_items"/>
 *     &lt;enumeration value="_itemSupplyPlan"/>
 *     &lt;enumeration value="_itemTemplates"/>
 *     &lt;enumeration value="_jobManagement"/>
 *     &lt;enumeration value="_jobRequisitions"/>
 *     &lt;enumeration value="_jobs"/>
 *     &lt;enumeration value="_journalApproval"/>
 *     &lt;enumeration value="_knowledgeBase"/>
 *     &lt;enumeration value="_kpiScorecards"/>
 *     &lt;enumeration value="_kudos"/>
 *     &lt;enumeration value="_leadConversion"/>
 *     &lt;enumeration value="_leadConversionMapping"/>
 *     &lt;enumeration value="_leadSnapshotReminders"/>
 *     &lt;enumeration value="_letterMessages"/>
 *     &lt;enumeration value="_letterTemplate"/>
 *     &lt;enumeration value="_loadSampleData"/>
 *     &lt;enumeration value="_locationCostingGroup"/>
 *     &lt;enumeration value="_locations"/>
 *     &lt;enumeration value="_locationSegmentMapping"/>
 *     &lt;enumeration value="_lockTransactions"/>
 *     &lt;enumeration value="_logInUsingAccessTokens"/>
 *     &lt;enumeration value="_longTermLiabilityRegisters"/>
 *     &lt;enumeration value="_mailMerge"/>
 *     &lt;enumeration value="_makeJournalEntry"/>
 *     &lt;enumeration value="_manageAccountingPeriods"/>
 *     &lt;enumeration value="_manageCustomPermissions"/>
 *     &lt;enumeration value="_managePayroll"/>
 *     &lt;enumeration value="_manageRoles"/>
 *     &lt;enumeration value="_manageTaxReportingPeriods"/>
 *     &lt;enumeration value="_manageUsers"/>
 *     &lt;enumeration value="_manufacturingCostTemplate"/>
 *     &lt;enumeration value="_manufacturingRouting"/>
 *     &lt;enumeration value="_marketingCampaignReports"/>
 *     &lt;enumeration value="_marketingCampaigns"/>
 *     &lt;enumeration value="_marketingTemplate"/>
 *     &lt;enumeration value="_markIssueAsShowStopper"/>
 *     &lt;enumeration value="_markWorkOrdersBuilt"/>
 *     &lt;enumeration value="_markWorkOrdersFirmed"/>
 *     &lt;enumeration value="_markWorkOrdersReleased"/>
 *     &lt;enumeration value="_massUpdates"/>
 *     &lt;enumeration value="_matchingRulesForOnlineBanking"/>
 *     &lt;enumeration value="_mediaFolders"/>
 *     &lt;enumeration value="_memorizedTransactions"/>
 *     &lt;enumeration value="_merchandiseHierarchyLevel"/>
 *     &lt;enumeration value="_merchandiseHierarchyNode"/>
 *     &lt;enumeration value="_merchandiseHierarchyVersion"/>
 *     &lt;enumeration value="_migrateRevenueArrangementsAndPlans"/>
 *     &lt;enumeration value="_mobileDeviceAccess"/>
 *     &lt;enumeration value="_netWorth"/>
 *     &lt;enumeration value="_newsItems"/>
 *     &lt;enumeration value="_nextGenAnalytics"/>
 *     &lt;enumeration value="_nonPostingRegisters"/>
 *     &lt;enumeration value="_noPermissionNecessary"/>
 *     &lt;enumeration value="_notesTab"/>
 *     &lt;enumeration value="_notifications"/>
 *     &lt;enumeration value="_offlineClient"/>
 *     &lt;enumeration value="_onlineCaseForm"/>
 *     &lt;enumeration value="_onlineCustomerForm"/>
 *     &lt;enumeration value="_onlineCustomRecordForm"/>
 *     &lt;enumeration value="_openidSingleSignOn"/>
 *     &lt;enumeration value="_opportunity"/>
 *     &lt;enumeration value="_organizationValue"/>
 *     &lt;enumeration value="_otherAssetRegisters"/>
 *     &lt;enumeration value="_otherCurrentAssetRegisters"/>
 *     &lt;enumeration value="_otherCurrentLiabilityRegisters"/>
 *     &lt;enumeration value="_otherCustomFields"/>
 *     &lt;enumeration value="_otherExpenseRegisters"/>
 *     &lt;enumeration value="_otherIncomeRegisters"/>
 *     &lt;enumeration value="_otherLists"/>
 *     &lt;enumeration value="_otherNames"/>
 *     &lt;enumeration value="_outlookIntegration"/>
 *     &lt;enumeration value="_outlookIntegration3"/>
 *     &lt;enumeration value="_overrideEstimatedCostOnTransactions"/>
 *     &lt;enumeration value="_overridePaymentHold"/>
 *     &lt;enumeration value="_overridePeriodRestrictions"/>
 *     &lt;enumeration value="_ownershipTransfer"/>
 *     &lt;enumeration value="_partnerAuthorizedCommissionReports"/>
 *     &lt;enumeration value="_partnerCommissionReports"/>
 *     &lt;enumeration value="_partnerCommissionSchedulesPlans"/>
 *     &lt;enumeration value="_partnerCommissionTransaction"/>
 *     &lt;enumeration value="_partnerCommissionTransactionApproval"/>
 *     &lt;enumeration value="_partnerContribution"/>
 *     &lt;enumeration value="_partners"/>
 *     &lt;enumeration value="_payBills"/>
 *     &lt;enumeration value="_paycheckJournal"/>
 *     &lt;enumeration value="_paychecks"/>
 *     &lt;enumeration value="_paymentMethods"/>
 *     &lt;enumeration value="_payrollCheckRegister"/>
 *     &lt;enumeration value="_payrollHoursAndEarnings"/>
 *     &lt;enumeration value="_payrollItems"/>
 *     &lt;enumeration value="_payrollJournalReport"/>
 *     &lt;enumeration value="_payrollLiabilityPayments"/>
 *     &lt;enumeration value="_payrollLiabilityReport"/>
 *     &lt;enumeration value="_payrollStateWithholding"/>
 *     &lt;enumeration value="_payrollSummaryAndDetailReports"/>
 *     &lt;enumeration value="_paySalesTax"/>
 *     &lt;enumeration value="_payTaxLiability"/>
 *     &lt;enumeration value="_pdfMessages"/>
 *     &lt;enumeration value="_pdfTemplate"/>
 *     &lt;enumeration value="_performSearch"/>
 *     &lt;enumeration value="_periodClosingManagement"/>
 *     &lt;enumeration value="_periodEndFinancialStatements"/>
 *     &lt;enumeration value="_periodEndJournals"/>
 *     &lt;enumeration value="_persistSearch"/>
 *     &lt;enumeration value="_phasedProcesses"/>
 *     &lt;enumeration value="_phoneCalls"/>
 *     &lt;enumeration value="_plannedRevenue"/>
 *     &lt;enumeration value="_plannedStandardCost"/>
 *     &lt;enumeration value="_positions"/>
 *     &lt;enumeration value="_postingPeriodOnTransactions"/>
 *     &lt;enumeration value="_postTime"/>
 *     &lt;enumeration value="_postVendorBillVariances"/>
 *     &lt;enumeration value="_presentationCategories"/>
 *     &lt;enumeration value="_printChecksAndForms"/>
 *     &lt;enumeration value="_printEmailFax"/>
 *     &lt;enumeration value="_printShipmentDocuments"/>
 *     &lt;enumeration value="_processGSTRefund"/>
 *     &lt;enumeration value="_processPayroll"/>
 *     &lt;enumeration value="_projectProfitability"/>
 *     &lt;enumeration value="_projectProfitabilitySetup"/>
 *     &lt;enumeration value="_projectProjectTemplateConversion"/>
 *     &lt;enumeration value="_projectRevenueRules"/>
 *     &lt;enumeration value="_projectTasks"/>
 *     &lt;enumeration value="_projectTemplates"/>
 *     &lt;enumeration value="_promotionCode"/>
 *     &lt;enumeration value="_provisioning"/>
 *     &lt;enumeration value="_provisioningForQa"/>
 *     &lt;enumeration value="_provisionNewAccountOnTestdrive"/>
 *     &lt;enumeration value="_provisionTestDrive"/>
 *     &lt;enumeration value="_pstSummaryReport"/>
 *     &lt;enumeration value="_publicTemplateCategories"/>
 *     &lt;enumeration value="_publishDashboards"/>
 *     &lt;enumeration value="_publishEmployeeList"/>
 *     &lt;enumeration value="_publishForms"/>
 *     &lt;enumeration value="_publishKnowledgeBase"/>
 *     &lt;enumeration value="_publishRSSFeeds"/>
 *     &lt;enumeration value="_publishSearch"/>
 *     &lt;enumeration value="_purchaseContract"/>
 *     &lt;enumeration value="_purchaseContractApproval"/>
 *     &lt;enumeration value="_purchaseOrder"/>
 *     &lt;enumeration value="_purchaseOrderReports"/>
 *     &lt;enumeration value="_purchases"/>
 *     &lt;enumeration value="_quantityPricingSchedules"/>
 *     &lt;enumeration value="_quotaReports"/>
 *     &lt;enumeration value="_receiveOrder"/>
 *     &lt;enumeration value="_receiveReturns"/>
 *     &lt;enumeration value="_recognizeGiftCertificateIncome"/>
 *     &lt;enumeration value="_reconcile"/>
 *     &lt;enumeration value="_reconcileReporting"/>
 *     &lt;enumeration value="_recordCustomField"/>
 *     &lt;enumeration value="_refundReturns"/>
 *     &lt;enumeration value="_relatedItems"/>
 *     &lt;enumeration value="_reportCustomization"/>
 *     &lt;enumeration value="_reportScheduling"/>
 *     &lt;enumeration value="_requestForQuote"/>
 *     &lt;enumeration value="_requisition"/>
 *     &lt;enumeration value="_requisitionApproval"/>
 *     &lt;enumeration value="_resource"/>
 *     &lt;enumeration value="_resourceAllocationApproval"/>
 *     &lt;enumeration value="_resourceAllocationReports"/>
 *     &lt;enumeration value="_resourceAllocations"/>
 *     &lt;enumeration value="_returnAuthApproval"/>
 *     &lt;enumeration value="_returnAuthorization"/>
 *     &lt;enumeration value="_returnAuthorizationReports"/>
 *     &lt;enumeration value="_revalueInventoryCost"/>
 *     &lt;enumeration value="_revenueArrangement"/>
 *     &lt;enumeration value="_revenueArrangementApproval"/>
 *     &lt;enumeration value="_revenueCommitment"/>
 *     &lt;enumeration value="_revenueCommitmentReversal"/>
 *     &lt;enumeration value="_revenueContracts"/>
 *     &lt;enumeration value="_revenueElement"/>
 *     &lt;enumeration value="_revenueManagementVSOE"/>
 *     &lt;enumeration value="_revenueRecognitionFieldMapping"/>
 *     &lt;enumeration value="_revenueRecognitionPlan"/>
 *     &lt;enumeration value="_revenueRecognitionReports"/>
 *     &lt;enumeration value="_revenueRecognitionRule"/>
 *     &lt;enumeration value="_revenueRecognitionSchedules"/>
 *     &lt;enumeration value="_reviewCustomGlPlugInExecutions"/>
 *     &lt;enumeration value="_roles"/>
 *     &lt;enumeration value="_runPayroll"/>
 *     &lt;enumeration value="_sales"/>
 *     &lt;enumeration value="_salesByPartner"/>
 *     &lt;enumeration value="_salesByPromotionCode"/>
 *     &lt;enumeration value="_salesCampaigns"/>
 *     &lt;enumeration value="_salesForceAutomation"/>
 *     &lt;enumeration value="_salesForceAutomationSetup"/>
 *     &lt;enumeration value="_salesOrder"/>
 *     &lt;enumeration value="_salesOrderApproval"/>
 *     &lt;enumeration value="_salesOrderFulfillmentReports"/>
 *     &lt;enumeration value="_salesOrderReports"/>
 *     &lt;enumeration value="_salesOrderTransactionReport"/>
 *     &lt;enumeration value="_salesRoles"/>
 *     &lt;enumeration value="_salesTerritory"/>
 *     &lt;enumeration value="_salesTerritoryRule"/>
 *     &lt;enumeration value="_samlSingleSignOn"/>
 *     &lt;enumeration value="_scheduleMassUpdates"/>
 *     &lt;enumeration value="_setUpAccounting"/>
 *     &lt;enumeration value="_setUpAchProcessing"/>
 *     &lt;enumeration value="_setUpAdpPayroll"/>
 *     &lt;enumeration value="_setUpBillPay"/>
 *     &lt;enumeration value="_setUpBudgets"/>
 *     &lt;enumeration value="_setUpCampaignEmailAddresses"/>
 *     &lt;enumeration value="_setupCampaigns"/>
 *     &lt;enumeration value="_setUpCompany"/>
 *     &lt;enumeration value="_setUpCsvPreferences"/>
 *     &lt;enumeration value="_setUpDomains"/>
 *     &lt;enumeration value="_setUpImageResizing"/>
 *     &lt;enumeration value="_setUpOpenidSingleSignOn"/>
 *     &lt;enumeration value="_setUpPayroll"/>
 *     &lt;enumeration value="_setUpReminders"/>
 *     &lt;enumeration value="_setUpSamlSingleSignOn"/>
 *     &lt;enumeration value="_setUpSnapshots"/>
 *     &lt;enumeration value="_setUpWebServices"/>
 *     &lt;enumeration value="_setUpWebSite"/>
 *     &lt;enumeration value="_setUpYearStatus"/>
 *     &lt;enumeration value="_shippingItems"/>
 *     &lt;enumeration value="_shippingPartnerPackage"/>
 *     &lt;enumeration value="_shippingPartnerRegistration"/>
 *     &lt;enumeration value="_shippingPartnerShipment"/>
 *     &lt;enumeration value="_shortcuts"/>
 *     &lt;enumeration value="_standardCostVersion"/>
 *     &lt;enumeration value="_statementCharge"/>
 *     &lt;enumeration value="_statisticalAccountRegisters"/>
 *     &lt;enumeration value="_storeCategories"/>
 *     &lt;enumeration value="_storeContentCategories"/>
 *     &lt;enumeration value="_storeContentItems"/>
 *     &lt;enumeration value="_storeLogoUpload"/>
 *     &lt;enumeration value="_storePickupFulfillment"/>
 *     &lt;enumeration value="_storeTabs"/>
 *     &lt;enumeration value="_subscriptionPlan"/>
 *     &lt;enumeration value="_subscriptions"/>
 *     &lt;enumeration value="_subsidiaries"/>
 *     &lt;enumeration value="_subsidiaryTaxEngineSelection"/>
 *     &lt;enumeration value="_suiteAppDeployment"/>
 *     &lt;enumeration value="_suiteBundler"/>
 *     &lt;enumeration value="_suiteBundlerAuditTrail"/>
 *     &lt;enumeration value="_suiteBundlerUpgrades"/>
 *     &lt;enumeration value="_suiteScript"/>
 *     &lt;enumeration value="_suiteScriptNlCorpManagement"/>
 *     &lt;enumeration value="_suiteScriptScheduling"/>
 *     &lt;enumeration value="_suiteSignon"/>
 *     &lt;enumeration value="_suitetaxMigration"/>
 *     &lt;enumeration value="_supplyChainSnapshotList"/>
 *     &lt;enumeration value="_support"/>
 *     &lt;enumeration value="_supportCaseIssue"/>
 *     &lt;enumeration value="_supportCaseOrigin"/>
 *     &lt;enumeration value="_supportCasePriority"/>
 *     &lt;enumeration value="_supportCaseSnapshotReminders"/>
 *     &lt;enumeration value="_supportCaseStatus"/>
 *     &lt;enumeration value="_supportCaseTerritory"/>
 *     &lt;enumeration value="_supportCaseTerritoryRule"/>
 *     &lt;enumeration value="_supportCaseType"/>
 *     &lt;enumeration value="_supportSetup"/>
 *     &lt;enumeration value="_swapPricesBetweenPriceLevels"/>
 *     &lt;enumeration value="_systemEmailTemplate"/>
 *     &lt;enumeration value="_systemStatus"/>
 *     &lt;enumeration value="_tableauWorkbookExport"/>
 *     &lt;enumeration value="_tasks"/>
 *     &lt;enumeration value="_tax"/>
 *     &lt;enumeration value="_taxDetailsTab"/>
 *     &lt;enumeration value="_taxItems"/>
 *     &lt;enumeration value="_taxReports"/>
 *     &lt;enumeration value="_taxSchedules"/>
 *     &lt;enumeration value="_teamSellingContribution"/>
 *     &lt;enumeration value="_tegataAccounts"/>
 *     &lt;enumeration value="_tegataPayable"/>
 *     &lt;enumeration value="_tegataReceivable"/>
 *     &lt;enumeration value="_telephonyIntegration"/>
 *     &lt;enumeration value="_templateCategories"/>
 *     &lt;enumeration value="_terminationReasons"/>
 *     &lt;enumeration value="_testdriveMasters"/>
 *     &lt;enumeration value="_timeOffAdministration"/>
 *     &lt;enumeration value="_timer"/>
 *     &lt;enumeration value="_timeTracking"/>
 *     &lt;enumeration value="_trackMessages"/>
 *     &lt;enumeration value="_trackTime"/>
 *     &lt;enumeration value="_transactionDetail"/>
 *     &lt;enumeration value="_transactionNumberingAuditLog"/>
 *     &lt;enumeration value="_transactionReceiveInboundShipment"/>
 *     &lt;enumeration value="_transferFunds"/>
 *     &lt;enumeration value="_transferInventory"/>
 *     &lt;enumeration value="_transferOrder"/>
 *     &lt;enumeration value="_transferOrderApproval"/>
 *     &lt;enumeration value="_translation"/>
 *     &lt;enumeration value="_trialBalance"/>
 *     &lt;enumeration value="_twoFactorAuthentication"/>
 *     &lt;enumeration value="_twoFactorAuthenticationBase"/>
 *     &lt;enumeration value="_unbilledReceivableRegisters"/>
 *     &lt;enumeration value="_unbuildAssemblies"/>
 *     &lt;enumeration value="_uncategorizedPresentationItems"/>
 *     &lt;enumeration value="_undeliveredEmails"/>
 *     &lt;enumeration value="_units"/>
 *     &lt;enumeration value="_updatePrices"/>
 *     &lt;enumeration value="_upsellAssistant"/>
 *     &lt;enumeration value="_upsellSetup"/>
 *     &lt;enumeration value="_upsellWizard"/>
 *     &lt;enumeration value="_usage"/>
 *     &lt;enumeration value="_userAccessTokens"/>
 *     &lt;enumeration value="_userPreferences"/>
 *     &lt;enumeration value="_usersAndPasswords"/>
 *     &lt;enumeration value="_vendorBillApproval"/>
 *     &lt;enumeration value="_vendorPaymentStatus"/>
 *     &lt;enumeration value="_vendorRequestForQuote"/>
 *     &lt;enumeration value="_vendorReturnAuthApproval"/>
 *     &lt;enumeration value="_vendorReturnAuthorization"/>
 *     &lt;enumeration value="_vendorReturns"/>
 *     &lt;enumeration value="_vendors"/>
 *     &lt;enumeration value="_viewGatewayAsynchronousNotifications"/>
 *     &lt;enumeration value="_viewLoginAuditTrail"/>
 *     &lt;enumeration value="_viewOnlineBillPayStatus"/>
 *     &lt;enumeration value="_viewPaymentEvents"/>
 *     &lt;enumeration value="_viewUnencryptedCreditCards"/>
 *     &lt;enumeration value="_viewWebServicesLogs"/>
 *     &lt;enumeration value="_webServices"/>
 *     &lt;enumeration value="_webSiteExternalPublisher"/>
 *     &lt;enumeration value="_webSiteManagement"/>
 *     &lt;enumeration value="_webSiteReport"/>
 *     &lt;enumeration value="_webStoreEmailTemplate"/>
 *     &lt;enumeration value="_webStoreReport"/>
 *     &lt;enumeration value="_workCalendar"/>
 *     &lt;enumeration value="_workflow"/>
 *     &lt;enumeration value="_workforceAnalytics"/>
 *     &lt;enumeration value="_workOrder"/>
 *     &lt;enumeration value="_workOrderClose"/>
 *     &lt;enumeration value="_workOrderCompletion"/>
 *     &lt;enumeration value="_workOrderIssue"/>
 *     &lt;enumeration value="_workplaces"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissionCode", namespace = "urn:types.common_2018_1.platform.webservices.netsuite.com")
@XmlEnum
public enum PermissionCode {

    @XmlEnumValue("_accessPaymentAuditLog")
    ACCESS_PAYMENT_AUDIT_LOG("_accessPaymentAuditLog"),
    @XmlEnumValue("_accessTokenManagement")
    ACCESS_TOKEN_MANAGEMENT("_accessTokenManagement"),
    @XmlEnumValue("_accountDetail")
    ACCOUNT_DETAIL("_accountDetail"),
    @XmlEnumValue("_accounting")
    ACCOUNTING("_accounting"),
    @XmlEnumValue("_accountingBook")
    ACCOUNTING_BOOK("_accountingBook"),
    @XmlEnumValue("_accountingLists")
    ACCOUNTING_LISTS("_accountingLists"),
    @XmlEnumValue("_accounts")
    ACCOUNTS("_accounts"),
    @XmlEnumValue("_accountsPayable")
    ACCOUNTS_PAYABLE("_accountsPayable"),
    @XmlEnumValue("_accountsPayableGraphing")
    ACCOUNTS_PAYABLE_GRAPHING("_accountsPayableGraphing"),
    @XmlEnumValue("_accountsPayableRegister")
    ACCOUNTS_PAYABLE_REGISTER("_accountsPayableRegister"),
    @XmlEnumValue("_accountsReceivable")
    ACCOUNTS_RECEIVABLE("_accountsReceivable"),
    @XmlEnumValue("_accountsReceivableGraphing")
    ACCOUNTS_RECEIVABLE_GRAPHING("_accountsReceivableGraphing"),
    @XmlEnumValue("_accountsReceivableRegister")
    ACCOUNTS_RECEIVABLE_REGISTER("_accountsReceivableRegister"),
    @XmlEnumValue("_accountsReceivableUnbilled")
    ACCOUNTS_RECEIVABLE_UNBILLED("_accountsReceivableUnbilled"),
    @XmlEnumValue("_address")
    ADDRESS("_address"),
    @XmlEnumValue("_adjustInventory")
    ADJUST_INVENTORY("_adjustInventory"),
    @XmlEnumValue("_adjustInventoryWorksheet")
    ADJUST_INVENTORY_WORKSHEET("_adjustInventoryWorksheet"),
    @XmlEnumValue("_admindocs")
    ADMINDOCS("_admindocs"),
    @XmlEnumValue("_admindocsEu")
    ADMINDOCS_EU("_admindocsEu"),
    @XmlEnumValue("_admindocsNa")
    ADMINDOCS_NA("_admindocsNa"),
    @XmlEnumValue("_admindocsOther")
    ADMINDOCS_OTHER("_admindocsOther"),
    @XmlEnumValue("_adpImportData")
    ADP_IMPORT_DATA("_adpImportData"),
    @XmlEnumValue("_adpSetup")
    ADP_SETUP("_adpSetup"),
    @XmlEnumValue("_advancedAnalytics")
    ADVANCED_ANALYTICS("_advancedAnalytics"),
    @XmlEnumValue("_advancedGovernmentIssuedIds")
    ADVANCED_GOVERNMENT_ISSUED_IDS("_advancedGovernmentIssuedIds"),
    @XmlEnumValue("_advancedOrderManagement")
    ADVANCED_ORDER_MANAGEMENT("_advancedOrderManagement"),
    @XmlEnumValue("_advancedPDFHTMLTemplates")
    ADVANCED_PDFHTML_TEMPLATES("_advancedPDFHTMLTemplates"),
    @XmlEnumValue("_allocationSchedules")
    ALLOCATION_SCHEDULES("_allocationSchedules"),
    @XmlEnumValue("_allowJsHtmlUploads")
    ALLOW_JS_HTML_UPLOADS("_allowJsHtmlUploads"),
    @XmlEnumValue("_allowNonGLChanges")
    ALLOW_NON_GL_CHANGES("_allowNonGLChanges"),
    @XmlEnumValue("_allowPendingBookJournalEntry")
    ALLOW_PENDING_BOOK_JOURNAL_ENTRY("_allowPendingBookJournalEntry"),
    @XmlEnumValue("_amendW4")
    AMEND_W_4("_amendW4"),
    @XmlEnumValue("_amortizationReports")
    AMORTIZATION_REPORTS("_amortizationReports"),
    @XmlEnumValue("_amortizationSchedules")
    AMORTIZATION_SCHEDULES("_amortizationSchedules"),
    @XmlEnumValue("_applicationPublishers")
    APPLICATION_PUBLISHERS("_applicationPublishers"),
    @XmlEnumValue("_approveDirectDeposit")
    APPROVE_DIRECT_DEPOSIT("_approveDirectDeposit"),
    @XmlEnumValue("_approveEFT")
    APPROVE_EFT("_approveEFT"),
    @XmlEnumValue("_approveOnlineBillPayments")
    APPROVE_ONLINE_BILL_PAYMENTS("_approveOnlineBillPayments"),
    @XmlEnumValue("_approveVendorPayments")
    APPROVE_VENDOR_PAYMENTS("_approveVendorPayments"),
    @XmlEnumValue("_auditTrail")
    AUDIT_TRAIL("_auditTrail"),
    @XmlEnumValue("_backupYourData")
    BACKUP_YOUR_DATA("_backupYourData"),
    @XmlEnumValue("_balanceLocationCostingGroupAccounts")
    BALANCE_LOCATION_COSTING_GROUP_ACCOUNTS("_balanceLocationCostingGroupAccounts"),
    @XmlEnumValue("_balanceSheet")
    BALANCE_SHEET("_balanceSheet"),
    @XmlEnumValue("_bankAccountRegisters")
    BANK_ACCOUNT_REGISTERS("_bankAccountRegisters"),
    @XmlEnumValue("_bankConnectivityPlugInConfiguration")
    BANK_CONNECTIVITY_PLUG_IN_CONFIGURATION("_bankConnectivityPlugInConfiguration"),
    @XmlEnumValue("_basicGovernmentIssuedIds")
    BASIC_GOVERNMENT_ISSUED_IDS("_basicGovernmentIssuedIds"),
    @XmlEnumValue("_billInboundShipment")
    BILL_INBOUND_SHIPMENT("_billInboundShipment"),
    @XmlEnumValue("_billingInformation")
    BILLING_INFORMATION("_billingInformation"),
    @XmlEnumValue("_billingSchedules")
    BILLING_SCHEDULES("_billingSchedules"),
    @XmlEnumValue("_billOfDistribution")
    BILL_OF_DISTRIBUTION("_billOfDistribution"),
    @XmlEnumValue("_billOfMaterials")
    BILL_OF_MATERIALS("_billOfMaterials"),
    @XmlEnumValue("_billOfMaterialsInquiry")
    BILL_OF_MATERIALS_INQUIRY("_billOfMaterialsInquiry"),
    @XmlEnumValue("_billPurchaseOrders")
    BILL_PURCHASE_ORDERS("_billPurchaseOrders"),
    @XmlEnumValue("_bills")
    BILLS("_bills"),
    @XmlEnumValue("_billSalesOrders")
    BILL_SALES_ORDERS("_billSalesOrders"),
    @XmlEnumValue("_bins")
    BINS("_bins"),
    @XmlEnumValue("_binTransfer")
    BIN_TRANSFER("_binTransfer"),
    @XmlEnumValue("_binWorksheet")
    BIN_WORKSHEET("_binWorksheet"),
    @XmlEnumValue("_blanketPurchaseOrder")
    BLANKET_PURCHASE_ORDER("_blanketPurchaseOrder"),
    @XmlEnumValue("_blanketPurchaseOrderApproval")
    BLANKET_PURCHASE_ORDER_APPROVAL("_blanketPurchaseOrderApproval"),
    @XmlEnumValue("_budget")
    BUDGET("_budget"),
    @XmlEnumValue("_buildAssemblies")
    BUILD_ASSEMBLIES("_buildAssemblies"),
    @XmlEnumValue("_buildWorkOrders")
    BUILD_WORK_ORDERS("_buildWorkOrders"),
    @XmlEnumValue("_calculateTime")
    CALCULATE_TIME("_calculateTime"),
    @XmlEnumValue("_calendar")
    CALENDAR("_calendar"),
    @XmlEnumValue("_campaignHistory")
    CAMPAIGN_HISTORY("_campaignHistory"),
    @XmlEnumValue("_caseAlerts")
    CASE_ALERTS("_caseAlerts"),
    @XmlEnumValue("_cases")
    CASES("_cases"),
    @XmlEnumValue("_cashFlowStatement")
    CASH_FLOW_STATEMENT("_cashFlowStatement"),
    @XmlEnumValue("_cashSale")
    CASH_SALE("_cashSale"),
    @XmlEnumValue("_cashSaleRefund")
    CASH_SALE_REFUND("_cashSaleRefund"),
    @XmlEnumValue("_changeEmailOrPassword")
    CHANGE_EMAIL_OR_PASSWORD("_changeEmailOrPassword"),
    @XmlEnumValue("_changeRole")
    CHANGE_ROLE("_changeRole"),
    @XmlEnumValue("_chargeRule")
    CHARGE_RULE("_chargeRule"),
    @XmlEnumValue("_chargeRunRules")
    CHARGE_RUN_RULES("_chargeRunRules"),
    @XmlEnumValue("_check")
    CHECK("_check"),
    @XmlEnumValue("_checkItemAvailability")
    CHECK_ITEM_AVAILABILITY("_checkItemAvailability"),
    @XmlEnumValue("_classes")
    CLASSES("_classes"),
    @XmlEnumValue("_classSegmentMapping")
    CLASS_SEGMENT_MAPPING("_classSegmentMapping"),
    @XmlEnumValue("_closeAccount")
    CLOSE_ACCOUNT("_closeAccount"),
    @XmlEnumValue("_closeWorkOrders")
    CLOSE_WORK_ORDERS("_closeWorkOrders"),
    @XmlEnumValue("_colorThemes")
    COLOR_THEMES("_colorThemes"),
    @XmlEnumValue("_commerceCategories")
    COMMERCE_CATEGORIES("_commerceCategories"),
    @XmlEnumValue("_commissionFeatureSetup")
    COMMISSION_FEATURE_SETUP("_commissionFeatureSetup"),
    @XmlEnumValue("_commissionReports")
    COMMISSION_REPORTS("_commissionReports"),
    @XmlEnumValue("_commitOrders")
    COMMIT_ORDERS("_commitOrders"),
    @XmlEnumValue("_commitPayroll")
    COMMIT_PAYROLL("_commitPayroll"),
    @XmlEnumValue("_companies")
    COMPANIES("_companies"),
    @XmlEnumValue("_companyInformation")
    COMPANY_INFORMATION("_companyInformation"),
    @XmlEnumValue("_companyPreferences")
    COMPANY_PREFERENCES("_companyPreferences"),
    @XmlEnumValue("_competitors")
    COMPETITORS("_competitors"),
    @XmlEnumValue("_componentWhereUsed")
    COMPONENT_WHERE_USED("_componentWhereUsed"),
    @XmlEnumValue("_contactRoles")
    CONTACT_ROLES("_contactRoles"),
    @XmlEnumValue("_contacts")
    CONTACTS("_contacts"),
    @XmlEnumValue("_controlSuitescriptAndWorkflowTriggersInWebServicesRequest")
    CONTROL_SUITESCRIPT_AND_WORKFLOW_TRIGGERS_IN_WEB_SERVICES_REQUEST("_controlSuitescriptAndWorkflowTriggersInWebServicesRequest"),
    @XmlEnumValue("_controlSuitescriptAndWorkflowTriggersPerCsvImport")
    CONTROL_SUITESCRIPT_AND_WORKFLOW_TRIGGERS_PER_CSV_IMPORT("_controlSuitescriptAndWorkflowTriggersPerCsvImport"),
    @XmlEnumValue("_convertClassesToDepartments")
    CONVERT_CLASSES_TO_DEPARTMENTS("_convertClassesToDepartments"),
    @XmlEnumValue("_convertClassesToLocations")
    CONVERT_CLASSES_TO_LOCATIONS("_convertClassesToLocations"),
    @XmlEnumValue("_copyBudgets")
    COPY_BUDGETS("_copyBudgets"),
    @XmlEnumValue("_copyChartOfAccountsToNewCompany")
    COPY_CHART_OF_ACCOUNTS_TO_NEW_COMPANY("_copyChartOfAccountsToNewCompany"),
    @XmlEnumValue("_copyProjectTasks")
    COPY_PROJECT_TASKS("_copyProjectTasks"),
    @XmlEnumValue("_costedBillOfMaterialsInquiry")
    COSTED_BILL_OF_MATERIALS_INQUIRY("_costedBillOfMaterialsInquiry"),
    @XmlEnumValue("_costOfGoodsSoldRegisters")
    COST_OF_GOODS_SOLD_REGISTERS("_costOfGoodsSoldRegisters"),
    @XmlEnumValue("_countInventory")
    COUNT_INVENTORY("_countInventory"),
    @XmlEnumValue("_createAllocationSchedules")
    CREATE_ALLOCATION_SCHEDULES("_createAllocationSchedules"),
    @XmlEnumValue("_createConsolidationCompany")
    CREATE_CONSOLIDATION_COMPANY("_createConsolidationCompany"),
    @XmlEnumValue("_createFiscalCalendar")
    CREATE_FISCAL_CALENDAR("_createFiscalCalendar"),
    @XmlEnumValue("_createInventoryCounts")
    CREATE_INVENTORY_COUNTS("_createInventoryCounts"),
    @XmlEnumValue("_creditCard")
    CREDIT_CARD("_creditCard"),
    @XmlEnumValue("_creditCardProcessing")
    CREDIT_CARD_PROCESSING("_creditCardProcessing"),
    @XmlEnumValue("_creditCardRefund")
    CREDIT_CARD_REFUND("_creditCardRefund"),
    @XmlEnumValue("_creditCardRegisters")
    CREDIT_CARD_REGISTERS("_creditCardRegisters"),
    @XmlEnumValue("_creditMemo")
    CREDIT_MEMO("_creditMemo"),
    @XmlEnumValue("_creditReturns")
    CREDIT_RETURNS("_creditReturns"),
    @XmlEnumValue("_crmGroups")
    CRM_GROUPS("_crmGroups"),
    @XmlEnumValue("_crmLists")
    CRM_LISTS("_crmLists"),
    @XmlEnumValue("_cspSetup")
    CSP_SETUP("_cspSetup"),
    @XmlEnumValue("_currency")
    CURRENCY("_currency"),
    @XmlEnumValue("_currencyAdjustmentJournal")
    CURRENCY_ADJUSTMENT_JOURNAL("_currencyAdjustmentJournal"),
    @XmlEnumValue("_currencyRevaluation")
    CURRENCY_REVALUATION("_currencyRevaluation"),
    @XmlEnumValue("_customAddressForm")
    CUSTOM_ADDRESS_FORM("_customAddressForm"),
    @XmlEnumValue("_customBodyFields")
    CUSTOM_BODY_FIELDS("_customBodyFields"),
    @XmlEnumValue("_customCenterCategories")
    CUSTOM_CENTER_CATEGORIES("_customCenterCategories"),
    @XmlEnumValue("_customCenterLinks")
    CUSTOM_CENTER_LINKS("_customCenterLinks"),
    @XmlEnumValue("_customCenters")
    CUSTOM_CENTERS("_customCenters"),
    @XmlEnumValue("_customCenterTabs")
    CUSTOM_CENTER_TABS("_customCenterTabs"),
    @XmlEnumValue("_customColumnFields")
    CUSTOM_COLUMN_FIELDS("_customColumnFields"),
    @XmlEnumValue("_customEntityFields")
    CUSTOM_ENTITY_FIELDS("_customEntityFields"),
    @XmlEnumValue("_customEntryForms")
    CUSTOM_ENTRY_FORMS("_customEntryForms"),
    @XmlEnumValue("_customerCharge")
    CUSTOMER_CHARGE("_customerCharge"),
    @XmlEnumValue("_customerDeposit")
    CUSTOMER_DEPOSIT("_customerDeposit"),
    @XmlEnumValue("_customerPayment")
    CUSTOMER_PAYMENT("_customerPayment"),
    @XmlEnumValue("_customerPaymentAuthorization")
    CUSTOMER_PAYMENT_AUTHORIZATION("_customerPaymentAuthorization"),
    @XmlEnumValue("_customerProfile")
    CUSTOMER_PROFILE("_customerProfile"),
    @XmlEnumValue("_customerRefund")
    CUSTOMER_REFUND("_customerRefund"),
    @XmlEnumValue("_customers")
    CUSTOMERS("_customers"),
    @XmlEnumValue("_customerStatus")
    CUSTOMER_STATUS("_customerStatus"),
    @XmlEnumValue("_customEventFields")
    CUSTOM_EVENT_FIELDS("_customEventFields"),
    @XmlEnumValue("_customFields")
    CUSTOM_FIELDS("_customFields"),
    @XmlEnumValue("_customGlLinesPlugInAuditLog")
    CUSTOM_GL_LINES_PLUG_IN_AUDIT_LOG("_customGlLinesPlugInAuditLog"),
    @XmlEnumValue("_customGlLinesPlugInAuditLogSegments")
    CUSTOM_GL_LINES_PLUG_IN_AUDIT_LOG_SEGMENTS("_customGlLinesPlugInAuditLogSegments"),
    @XmlEnumValue("_customHTMLLayouts")
    CUSTOM_HTML_LAYOUTS("_customHTMLLayouts"),
    @XmlEnumValue("_customItemFields")
    CUSTOM_ITEM_FIELDS("_customItemFields"),
    @XmlEnumValue("_customItemNumberFields")
    CUSTOM_ITEM_NUMBER_FIELDS("_customItemNumberFields"),
    @XmlEnumValue("_customizePage")
    CUSTOMIZE_PAGE("_customizePage"),
    @XmlEnumValue("_customLists")
    CUSTOM_LISTS("_customLists"),
    @XmlEnumValue("_customPDFLayouts")
    CUSTOM_PDF_LAYOUTS("_customPDFLayouts"),
    @XmlEnumValue("_customRecordEntries")
    CUSTOM_RECORD_ENTRIES("_customRecordEntries"),
    @XmlEnumValue("_customRecordTypes")
    CUSTOM_RECORD_TYPES("_customRecordTypes"),
    @XmlEnumValue("_customSegments")
    CUSTOM_SEGMENTS("_customSegments"),
    @XmlEnumValue("_customSublist")
    CUSTOM_SUBLIST("_customSublist"),
    @XmlEnumValue("_customSublists")
    CUSTOM_SUBLISTS("_customSublists"),
    @XmlEnumValue("_customSubtabs")
    CUSTOM_SUBTABS("_customSubtabs"),
    @XmlEnumValue("_customTransactionFields")
    CUSTOM_TRANSACTION_FIELDS("_customTransactionFields"),
    @XmlEnumValue("_customTransactionForms")
    CUSTOM_TRANSACTION_FORMS("_customTransactionForms"),
    @XmlEnumValue("_customTransactionTypes")
    CUSTOM_TRANSACTION_TYPES("_customTransactionTypes"),
    @XmlEnumValue("_deferredExpenseRegisters")
    DEFERRED_EXPENSE_REGISTERS("_deferredExpenseRegisters"),
    @XmlEnumValue("_deferredExpenseReports")
    DEFERRED_EXPENSE_REPORTS("_deferredExpenseReports"),
    @XmlEnumValue("_deferredRevenueRegisters")
    DEFERRED_REVENUE_REGISTERS("_deferredRevenueRegisters"),
    @XmlEnumValue("_deleteAllData")
    DELETE_ALL_DATA("_deleteAllData"),
    @XmlEnumValue("_deletedRecords")
    DELETED_RECORDS("_deletedRecords"),
    @XmlEnumValue("_deleteEvent")
    DELETE_EVENT("_deleteEvent"),
    @XmlEnumValue("_departments")
    DEPARTMENTS("_departments"),
    @XmlEnumValue("_departmentSegmentMapping")
    DEPARTMENT_SEGMENT_MAPPING("_departmentSegmentMapping"),
    @XmlEnumValue("_deposit")
    DEPOSIT("_deposit"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_deviceIdManagement")
    DEVICE_ID_MANAGEMENT("_deviceIdManagement"),
    @XmlEnumValue("_directDepositStatus")
    DIRECT_DEPOSIT_STATUS("_directDepositStatus"),
    @XmlEnumValue("_distributeInventory")
    DISTRIBUTE_INVENTORY("_distributeInventory"),
    @XmlEnumValue("_distributionNetwork")
    DISTRIBUTION_NETWORK("_distributionNetwork"),
    @XmlEnumValue("_documentsAndFiles")
    DOCUMENTS_AND_FILES("_documentsAndFiles"),
    @XmlEnumValue("_duplicateCaseManagement")
    DUPLICATE_CASE_MANAGEMENT("_duplicateCaseManagement"),
    @XmlEnumValue("_duplicateDetectionSetup")
    DUPLICATE_DETECTION_SETUP("_duplicateDetectionSetup"),
    @XmlEnumValue("_duplicateRecordManagement")
    DUPLICATE_RECORD_MANAGEMENT("_duplicateRecordManagement"),
    @XmlEnumValue("_editBankingInformation")
    EDIT_BANKING_INFORMATION("_editBankingInformation"),
    @XmlEnumValue("_editForecast")
    EDIT_FORECAST("_editForecast"),
    @XmlEnumValue("_editManagerForecast")
    EDIT_MANAGER_FORECAST("_editManagerForecast"),
    @XmlEnumValue("_editProfile")
    EDIT_PROFILE("_editProfile"),
    @XmlEnumValue("_eftStatus")
    EFT_STATUS("_eftStatus"),
    @XmlEnumValue("_emailReports")
    EMAIL_REPORTS("_emailReports"),
    @XmlEnumValue("_emailTemplate")
    EMAIL_TEMPLATE("_emailTemplate"),
    @XmlEnumValue("_employeeAdministration")
    EMPLOYEE_ADMINISTRATION("_employeeAdministration"),
    @XmlEnumValue("_employeeCenterPublishing")
    EMPLOYEE_CENTER_PUBLISHING("_employeeCenterPublishing"),
    @XmlEnumValue("_employeeChangeReason")
    EMPLOYEE_CHANGE_REASON("_employeeChangeReason"),
    @XmlEnumValue("_employeeCommissionSchedulesPlans")
    EMPLOYEE_COMMISSION_SCHEDULES_PLANS("_employeeCommissionSchedulesPlans"),
    @XmlEnumValue("_employeeCommissionTransaction")
    EMPLOYEE_COMMISSION_TRANSACTION("_employeeCommissionTransaction"),
    @XmlEnumValue("_employeeCommissionTransactionApproval")
    EMPLOYEE_COMMISSION_TRANSACTION_APPROVAL("_employeeCommissionTransactionApproval"),
    @XmlEnumValue("_employeeConfidential")
    EMPLOYEE_CONFIDENTIAL("_employeeConfidential"),
    @XmlEnumValue("_employeeEffectiveDating")
    EMPLOYEE_EFFECTIVE_DATING("_employeeEffectiveDating"),
    @XmlEnumValue("_employeePublic")
    EMPLOYEE_PUBLIC("_employeePublic"),
    @XmlEnumValue("_employeeRecord")
    EMPLOYEE_RECORD("_employeeRecord"),
    @XmlEnumValue("_employeeReminders")
    EMPLOYEE_REMINDERS("_employeeReminders"),
    @XmlEnumValue("_employees")
    EMPLOYEES("_employees"),
    @XmlEnumValue("_employeeSelf")
    EMPLOYEE_SELF("_employeeSelf"),
    @XmlEnumValue("_employeeSocialSecurityNumbers")
    EMPLOYEE_SOCIAL_SECURITY_NUMBERS("_employeeSocialSecurityNumbers"),
    @XmlEnumValue("_enableFeatures")
    ENABLE_FEATURES("_enableFeatures"),
    @XmlEnumValue("_enterCompletions")
    ENTER_COMPLETIONS("_enterCompletions"),
    @XmlEnumValue("_enterOpeningBalances")
    ENTER_OPENING_BALANCES("_enterOpeningBalances"),
    @XmlEnumValue("_enterVendorCredits")
    ENTER_VENDOR_CREDITS("_enterVendorCredits"),
    @XmlEnumValue("_enterYearToDatePayrollAdjustments")
    ENTER_YEAR_TO_DATE_PAYROLL_ADJUSTMENTS("_enterYearToDatePayrollAdjustments"),
    @XmlEnumValue("_entityAccountMapping")
    ENTITY_ACCOUNT_MAPPING("_entityAccountMapping"),
    @XmlEnumValue("_equityRegisters")
    EQUITY_REGISTERS("_equityRegisters"),
    @XmlEnumValue("_escalationAssignment")
    ESCALATION_ASSIGNMENT("_escalationAssignment"),
    @XmlEnumValue("_escalationAssignmentRule")
    ESCALATION_ASSIGNMENT_RULE("_escalationAssignmentRule"),
    @XmlEnumValue("_establishQuotas")
    ESTABLISH_QUOTAS("_establishQuotas"),
    @XmlEnumValue("_estimate")
    ESTIMATE("_estimate"),
    @XmlEnumValue("_events")
    EVENTS("_events"),
    @XmlEnumValue("_expenseAmortizationPlan")
    EXPENSE_AMORTIZATION_PLAN("_expenseAmortizationPlan"),
    @XmlEnumValue("_expenseAmortizationRule")
    EXPENSE_AMORTIZATION_RULE("_expenseAmortizationRule"),
    @XmlEnumValue("_expenseCategories")
    EXPENSE_CATEGORIES("_expenseCategories"),
    @XmlEnumValue("_expenseRegisters")
    EXPENSE_REGISTERS("_expenseRegisters"),
    @XmlEnumValue("_expenseReport")
    EXPENSE_REPORT("_expenseReport"),
    @XmlEnumValue("_expenses")
    EXPENSES("_expenses"),
    @XmlEnumValue("_exportAsIIF")
    EXPORT_AS_IIF("_exportAsIIF"),
    @XmlEnumValue("_exportLists")
    EXPORT_LISTS("_exportLists"),
    @XmlEnumValue("_fairValueDimension")
    FAIR_VALUE_DIMENSION("_fairValueDimension"),
    @XmlEnumValue("_fairValueFormula")
    FAIR_VALUE_FORMULA("_fairValueFormula"),
    @XmlEnumValue("_fairValuePrice")
    FAIR_VALUE_PRICE("_fairValuePrice"),
    @XmlEnumValue("_faxMessages")
    FAX_MESSAGES("_faxMessages"),
    @XmlEnumValue("_faxTemplate")
    FAX_TEMPLATE("_faxTemplate"),
    @XmlEnumValue("_features")
    FEATURES("_features"),
    @XmlEnumValue("_financeCharge")
    FINANCE_CHARGE("_financeCharge"),
    @XmlEnumValue("_financeChargePreferences")
    FINANCE_CHARGE_PREFERENCES("_financeChargePreferences"),
    @XmlEnumValue("_financialHistory")
    FINANCIAL_HISTORY("_financialHistory"),
    @XmlEnumValue("_financialStatementLayouts")
    FINANCIAL_STATEMENT_LAYOUTS("_financialStatementLayouts"),
    @XmlEnumValue("_financialStatements")
    FINANCIAL_STATEMENTS("_financialStatements"),
    @XmlEnumValue("_financialStatementSections")
    FINANCIAL_STATEMENT_SECTIONS("_financialStatementSections"),
    @XmlEnumValue("_findTransaction")
    FIND_TRANSACTION("_findTransaction"),
    @XmlEnumValue("_fiscalCalendars")
    FISCAL_CALENDARS("_fiscalCalendars"),
    @XmlEnumValue("_fixedAssetRegisters")
    FIXED_ASSET_REGISTERS("_fixedAssetRegisters"),
    @XmlEnumValue("_foreignCurrencyVarianceMapping")
    FOREIGN_CURRENCY_VARIANCE_MAPPING("_foreignCurrencyVarianceMapping"),
    @XmlEnumValue("_form1099FederalMiscellaneousIncome")
    FORM_1099_FEDERAL_MISCELLANEOUS_INCOME("_form1099FederalMiscellaneousIncome"),
    @XmlEnumValue("_form940EmployersAnnualFederalUnemploymentTaxReturn")
    FORM_940_EMPLOYERS_ANNUAL_FEDERAL_UNEMPLOYMENT_TAX_RETURN("_form940EmployersAnnualFederalUnemploymentTaxReturn"),
    @XmlEnumValue("_form941EmployersQuarterlyFederalTaxReturn")
    FORM_941_EMPLOYERS_QUARTERLY_FEDERAL_TAX_RETURN("_form941EmployersQuarterlyFederalTaxReturn"),
    @XmlEnumValue("_formW2WageAndTaxStatement")
    FORM_W_2_WAGE_AND_TAX_STATEMENT("_formW2WageAndTaxStatement"),
    @XmlEnumValue("_formW4EmployeesWithholdingAllowanceCertificate")
    FORM_W_4_EMPLOYEES_WITHHOLDING_ALLOWANCE_CERTIFICATE("_formW4EmployeesWithholdingAllowanceCertificate"),
    @XmlEnumValue("_fulfillmentExceptionReason")
    FULFILLMENT_EXCEPTION_REASON("_fulfillmentExceptionReason"),
    @XmlEnumValue("_fulfillmentRequest")
    FULFILLMENT_REQUEST("_fulfillmentRequest"),
    @XmlEnumValue("_fulfillOrders")
    FULFILL_ORDERS("_fulfillOrders"),
    @XmlEnumValue("_generalLedger")
    GENERAL_LEDGER("_generalLedger"),
    @XmlEnumValue("_generatePriceLists")
    GENERATE_PRICE_LISTS("_generatePriceLists"),
    @XmlEnumValue("_generateRevenueCommitment")
    GENERATE_REVENUE_COMMITMENT("_generateRevenueCommitment"),
    @XmlEnumValue("_generateRevenueCommitmentReversals")
    GENERATE_REVENUE_COMMITMENT_REVERSALS("_generateRevenueCommitmentReversals"),
    @XmlEnumValue("_generateSingleOrderRevenueContracts")
    GENERATE_SINGLE_ORDER_REVENUE_CONTRACTS("_generateSingleOrderRevenueContracts"),
    @XmlEnumValue("_generateStatements")
    GENERATE_STATEMENTS("_generateStatements"),
    @XmlEnumValue("_genericAdminPermission")
    GENERIC_ADMIN_PERMISSION("_genericAdminPermission"),
    @XmlEnumValue("_genericResources")
    GENERIC_RESOURCES("_genericResources"),
    @XmlEnumValue("_globalAccountMapping")
    GLOBAL_ACCOUNT_MAPPING("_globalAccountMapping"),
    @XmlEnumValue("_globalInventoryRelationship")
    GLOBAL_INVENTORY_RELATIONSHIP("_globalInventoryRelationship"),
    @XmlEnumValue("_governmentIssuedIdTypes")
    GOVERNMENT_ISSUED_ID_TYPES("_governmentIssuedIdTypes"),
    @XmlEnumValue("_grantingAccessToReports")
    GRANTING_ACCESS_TO_REPORTS("_grantingAccessToReports"),
    @XmlEnumValue("_gstSummaryReport")
    GST_SUMMARY_REPORT("_gstSummaryReport"),
    @XmlEnumValue("_hideEmployeeInformationOnFinancialReports")
    HIDE_EMPLOYEE_INFORMATION_ON_FINANCIAL_REPORTS("_hideEmployeeInformationOnFinancialReports"),
    @XmlEnumValue("_importCSVFile")
    IMPORT_CSV_FILE("_importCSVFile"),
    @XmlEnumValue("_importOnlineBankingQIFFile")
    IMPORT_ONLINE_BANKING_QIF_FILE("_importOnlineBankingQIFFile"),
    @XmlEnumValue("_importStateSalesTax")
    IMPORT_STATE_SALES_TAX("_importStateSalesTax"),
    @XmlEnumValue("_inboundShipment")
    INBOUND_SHIPMENT("_inboundShipment"),
    @XmlEnumValue("_income")
    INCOME("_income"),
    @XmlEnumValue("_incomeRegisters")
    INCOME_REGISTERS("_incomeRegisters"),
    @XmlEnumValue("_incomeStatement")
    INCOME_STATEMENT("_incomeStatement"),
    @XmlEnumValue("_individualPaycheck")
    INDIVIDUAL_PAYCHECK("_individualPaycheck"),
    @XmlEnumValue("_integration")
    INTEGRATION("_integration"),
    @XmlEnumValue("_integrationApplication")
    INTEGRATION_APPLICATION("_integrationApplication"),
    @XmlEnumValue("_integrationApplications")
    INTEGRATION_APPLICATIONS("_integrationApplications"),
    @XmlEnumValue("_intercompanyAdjustments")
    INTERCOMPANY_ADJUSTMENTS("_intercompanyAdjustments"),
    @XmlEnumValue("_internalPublisher")
    INTERNAL_PUBLISHER("_internalPublisher"),
    @XmlEnumValue("_inventory")
    INVENTORY("_inventory"),
    @XmlEnumValue("_inventoryCostTemplate")
    INVENTORY_COST_TEMPLATE("_inventoryCostTemplate"),
    @XmlEnumValue("_inventoryStatus")
    INVENTORY_STATUS("_inventoryStatus"),
    @XmlEnumValue("_inventoryStatusChange")
    INVENTORY_STATUS_CHANGE("_inventoryStatusChange"),
    @XmlEnumValue("_invoice")
    INVOICE("_invoice"),
    @XmlEnumValue("_invoiceApproval")
    INVOICE_APPROVAL("_invoiceApproval"),
    @XmlEnumValue("_issueComponents")
    ISSUE_COMPONENTS("_issueComponents"),
    @XmlEnumValue("_issueReports")
    ISSUE_REPORTS("_issueReports"),
    @XmlEnumValue("_issues")
    ISSUES("_issues"),
    @XmlEnumValue("_issueSetup")
    ISSUE_SETUP("_issueSetup"),
    @XmlEnumValue("_itemAccountMapping")
    ITEM_ACCOUNT_MAPPING("_itemAccountMapping"),
    @XmlEnumValue("_itemCategoryLayouts")
    ITEM_CATEGORY_LAYOUTS("_itemCategoryLayouts"),
    @XmlEnumValue("_itemDemandPlan")
    ITEM_DEMAND_PLAN("_itemDemandPlan"),
    @XmlEnumValue("_itemFulfillment")
    ITEM_FULFILLMENT("_itemFulfillment"),
    @XmlEnumValue("_itemReceipt")
    ITEM_RECEIPT("_itemReceipt"),
    @XmlEnumValue("_itemRevenueCategory")
    ITEM_REVENUE_CATEGORY("_itemRevenueCategory"),
    @XmlEnumValue("_itemRevisions")
    ITEM_REVISIONS("_itemRevisions"),
    @XmlEnumValue("_items")
    ITEMS("_items"),
    @XmlEnumValue("_itemSupplyPlan")
    ITEM_SUPPLY_PLAN("_itemSupplyPlan"),
    @XmlEnumValue("_itemTemplates")
    ITEM_TEMPLATES("_itemTemplates"),
    @XmlEnumValue("_jobManagement")
    JOB_MANAGEMENT("_jobManagement"),
    @XmlEnumValue("_jobRequisitions")
    JOB_REQUISITIONS("_jobRequisitions"),
    @XmlEnumValue("_jobs")
    JOBS("_jobs"),
    @XmlEnumValue("_journalApproval")
    JOURNAL_APPROVAL("_journalApproval"),
    @XmlEnumValue("_knowledgeBase")
    KNOWLEDGE_BASE("_knowledgeBase"),
    @XmlEnumValue("_kpiScorecards")
    KPI_SCORECARDS("_kpiScorecards"),
    @XmlEnumValue("_kudos")
    KUDOS("_kudos"),
    @XmlEnumValue("_leadConversion")
    LEAD_CONVERSION("_leadConversion"),
    @XmlEnumValue("_leadConversionMapping")
    LEAD_CONVERSION_MAPPING("_leadConversionMapping"),
    @XmlEnumValue("_leadSnapshotReminders")
    LEAD_SNAPSHOT_REMINDERS("_leadSnapshotReminders"),
    @XmlEnumValue("_letterMessages")
    LETTER_MESSAGES("_letterMessages"),
    @XmlEnumValue("_letterTemplate")
    LETTER_TEMPLATE("_letterTemplate"),
    @XmlEnumValue("_loadSampleData")
    LOAD_SAMPLE_DATA("_loadSampleData"),
    @XmlEnumValue("_locationCostingGroup")
    LOCATION_COSTING_GROUP("_locationCostingGroup"),
    @XmlEnumValue("_locations")
    LOCATIONS("_locations"),
    @XmlEnumValue("_locationSegmentMapping")
    LOCATION_SEGMENT_MAPPING("_locationSegmentMapping"),
    @XmlEnumValue("_lockTransactions")
    LOCK_TRANSACTIONS("_lockTransactions"),
    @XmlEnumValue("_logInUsingAccessTokens")
    LOG_IN_USING_ACCESS_TOKENS("_logInUsingAccessTokens"),
    @XmlEnumValue("_longTermLiabilityRegisters")
    LONG_TERM_LIABILITY_REGISTERS("_longTermLiabilityRegisters"),
    @XmlEnumValue("_mailMerge")
    MAIL_MERGE("_mailMerge"),
    @XmlEnumValue("_makeJournalEntry")
    MAKE_JOURNAL_ENTRY("_makeJournalEntry"),
    @XmlEnumValue("_manageAccountingPeriods")
    MANAGE_ACCOUNTING_PERIODS("_manageAccountingPeriods"),
    @XmlEnumValue("_manageCustomPermissions")
    MANAGE_CUSTOM_PERMISSIONS("_manageCustomPermissions"),
    @XmlEnumValue("_managePayroll")
    MANAGE_PAYROLL("_managePayroll"),
    @XmlEnumValue("_manageRoles")
    MANAGE_ROLES("_manageRoles"),
    @XmlEnumValue("_manageTaxReportingPeriods")
    MANAGE_TAX_REPORTING_PERIODS("_manageTaxReportingPeriods"),
    @XmlEnumValue("_manageUsers")
    MANAGE_USERS("_manageUsers"),
    @XmlEnumValue("_manufacturingCostTemplate")
    MANUFACTURING_COST_TEMPLATE("_manufacturingCostTemplate"),
    @XmlEnumValue("_manufacturingRouting")
    MANUFACTURING_ROUTING("_manufacturingRouting"),
    @XmlEnumValue("_marketingCampaignReports")
    MARKETING_CAMPAIGN_REPORTS("_marketingCampaignReports"),
    @XmlEnumValue("_marketingCampaigns")
    MARKETING_CAMPAIGNS("_marketingCampaigns"),
    @XmlEnumValue("_marketingTemplate")
    MARKETING_TEMPLATE("_marketingTemplate"),
    @XmlEnumValue("_markIssueAsShowStopper")
    MARK_ISSUE_AS_SHOW_STOPPER("_markIssueAsShowStopper"),
    @XmlEnumValue("_markWorkOrdersBuilt")
    MARK_WORK_ORDERS_BUILT("_markWorkOrdersBuilt"),
    @XmlEnumValue("_markWorkOrdersFirmed")
    MARK_WORK_ORDERS_FIRMED("_markWorkOrdersFirmed"),
    @XmlEnumValue("_markWorkOrdersReleased")
    MARK_WORK_ORDERS_RELEASED("_markWorkOrdersReleased"),
    @XmlEnumValue("_massUpdates")
    MASS_UPDATES("_massUpdates"),
    @XmlEnumValue("_matchingRulesForOnlineBanking")
    MATCHING_RULES_FOR_ONLINE_BANKING("_matchingRulesForOnlineBanking"),
    @XmlEnumValue("_mediaFolders")
    MEDIA_FOLDERS("_mediaFolders"),
    @XmlEnumValue("_memorizedTransactions")
    MEMORIZED_TRANSACTIONS("_memorizedTransactions"),
    @XmlEnumValue("_merchandiseHierarchyLevel")
    MERCHANDISE_HIERARCHY_LEVEL("_merchandiseHierarchyLevel"),
    @XmlEnumValue("_merchandiseHierarchyNode")
    MERCHANDISE_HIERARCHY_NODE("_merchandiseHierarchyNode"),
    @XmlEnumValue("_merchandiseHierarchyVersion")
    MERCHANDISE_HIERARCHY_VERSION("_merchandiseHierarchyVersion"),
    @XmlEnumValue("_migrateRevenueArrangementsAndPlans")
    MIGRATE_REVENUE_ARRANGEMENTS_AND_PLANS("_migrateRevenueArrangementsAndPlans"),
    @XmlEnumValue("_mobileDeviceAccess")
    MOBILE_DEVICE_ACCESS("_mobileDeviceAccess"),
    @XmlEnumValue("_netWorth")
    NET_WORTH("_netWorth"),
    @XmlEnumValue("_newsItems")
    NEWS_ITEMS("_newsItems"),
    @XmlEnumValue("_nextGenAnalytics")
    NEXT_GEN_ANALYTICS("_nextGenAnalytics"),
    @XmlEnumValue("_nonPostingRegisters")
    NON_POSTING_REGISTERS("_nonPostingRegisters"),
    @XmlEnumValue("_noPermissionNecessary")
    NO_PERMISSION_NECESSARY("_noPermissionNecessary"),
    @XmlEnumValue("_notesTab")
    NOTES_TAB("_notesTab"),
    @XmlEnumValue("_notifications")
    NOTIFICATIONS("_notifications"),
    @XmlEnumValue("_offlineClient")
    OFFLINE_CLIENT("_offlineClient"),
    @XmlEnumValue("_onlineCaseForm")
    ONLINE_CASE_FORM("_onlineCaseForm"),
    @XmlEnumValue("_onlineCustomerForm")
    ONLINE_CUSTOMER_FORM("_onlineCustomerForm"),
    @XmlEnumValue("_onlineCustomRecordForm")
    ONLINE_CUSTOM_RECORD_FORM("_onlineCustomRecordForm"),
    @XmlEnumValue("_openidSingleSignOn")
    OPENID_SINGLE_SIGN_ON("_openidSingleSignOn"),
    @XmlEnumValue("_opportunity")
    OPPORTUNITY("_opportunity"),
    @XmlEnumValue("_organizationValue")
    ORGANIZATION_VALUE("_organizationValue"),
    @XmlEnumValue("_otherAssetRegisters")
    OTHER_ASSET_REGISTERS("_otherAssetRegisters"),
    @XmlEnumValue("_otherCurrentAssetRegisters")
    OTHER_CURRENT_ASSET_REGISTERS("_otherCurrentAssetRegisters"),
    @XmlEnumValue("_otherCurrentLiabilityRegisters")
    OTHER_CURRENT_LIABILITY_REGISTERS("_otherCurrentLiabilityRegisters"),
    @XmlEnumValue("_otherCustomFields")
    OTHER_CUSTOM_FIELDS("_otherCustomFields"),
    @XmlEnumValue("_otherExpenseRegisters")
    OTHER_EXPENSE_REGISTERS("_otherExpenseRegisters"),
    @XmlEnumValue("_otherIncomeRegisters")
    OTHER_INCOME_REGISTERS("_otherIncomeRegisters"),
    @XmlEnumValue("_otherLists")
    OTHER_LISTS("_otherLists"),
    @XmlEnumValue("_otherNames")
    OTHER_NAMES("_otherNames"),
    @XmlEnumValue("_outlookIntegration")
    OUTLOOK_INTEGRATION("_outlookIntegration"),
    @XmlEnumValue("_outlookIntegration3")
    OUTLOOK_INTEGRATION_3("_outlookIntegration3"),
    @XmlEnumValue("_overrideEstimatedCostOnTransactions")
    OVERRIDE_ESTIMATED_COST_ON_TRANSACTIONS("_overrideEstimatedCostOnTransactions"),
    @XmlEnumValue("_overridePaymentHold")
    OVERRIDE_PAYMENT_HOLD("_overridePaymentHold"),
    @XmlEnumValue("_overridePeriodRestrictions")
    OVERRIDE_PERIOD_RESTRICTIONS("_overridePeriodRestrictions"),
    @XmlEnumValue("_ownershipTransfer")
    OWNERSHIP_TRANSFER("_ownershipTransfer"),
    @XmlEnumValue("_partnerAuthorizedCommissionReports")
    PARTNER_AUTHORIZED_COMMISSION_REPORTS("_partnerAuthorizedCommissionReports"),
    @XmlEnumValue("_partnerCommissionReports")
    PARTNER_COMMISSION_REPORTS("_partnerCommissionReports"),
    @XmlEnumValue("_partnerCommissionSchedulesPlans")
    PARTNER_COMMISSION_SCHEDULES_PLANS("_partnerCommissionSchedulesPlans"),
    @XmlEnumValue("_partnerCommissionTransaction")
    PARTNER_COMMISSION_TRANSACTION("_partnerCommissionTransaction"),
    @XmlEnumValue("_partnerCommissionTransactionApproval")
    PARTNER_COMMISSION_TRANSACTION_APPROVAL("_partnerCommissionTransactionApproval"),
    @XmlEnumValue("_partnerContribution")
    PARTNER_CONTRIBUTION("_partnerContribution"),
    @XmlEnumValue("_partners")
    PARTNERS("_partners"),
    @XmlEnumValue("_payBills")
    PAY_BILLS("_payBills"),
    @XmlEnumValue("_paycheckJournal")
    PAYCHECK_JOURNAL("_paycheckJournal"),
    @XmlEnumValue("_paychecks")
    PAYCHECKS("_paychecks"),
    @XmlEnumValue("_paymentMethods")
    PAYMENT_METHODS("_paymentMethods"),
    @XmlEnumValue("_payrollCheckRegister")
    PAYROLL_CHECK_REGISTER("_payrollCheckRegister"),
    @XmlEnumValue("_payrollHoursAndEarnings")
    PAYROLL_HOURS_AND_EARNINGS("_payrollHoursAndEarnings"),
    @XmlEnumValue("_payrollItems")
    PAYROLL_ITEMS("_payrollItems"),
    @XmlEnumValue("_payrollJournalReport")
    PAYROLL_JOURNAL_REPORT("_payrollJournalReport"),
    @XmlEnumValue("_payrollLiabilityPayments")
    PAYROLL_LIABILITY_PAYMENTS("_payrollLiabilityPayments"),
    @XmlEnumValue("_payrollLiabilityReport")
    PAYROLL_LIABILITY_REPORT("_payrollLiabilityReport"),
    @XmlEnumValue("_payrollStateWithholding")
    PAYROLL_STATE_WITHHOLDING("_payrollStateWithholding"),
    @XmlEnumValue("_payrollSummaryAndDetailReports")
    PAYROLL_SUMMARY_AND_DETAIL_REPORTS("_payrollSummaryAndDetailReports"),
    @XmlEnumValue("_paySalesTax")
    PAY_SALES_TAX("_paySalesTax"),
    @XmlEnumValue("_payTaxLiability")
    PAY_TAX_LIABILITY("_payTaxLiability"),
    @XmlEnumValue("_pdfMessages")
    PDF_MESSAGES("_pdfMessages"),
    @XmlEnumValue("_pdfTemplate")
    PDF_TEMPLATE("_pdfTemplate"),
    @XmlEnumValue("_performSearch")
    PERFORM_SEARCH("_performSearch"),
    @XmlEnumValue("_periodClosingManagement")
    PERIOD_CLOSING_MANAGEMENT("_periodClosingManagement"),
    @XmlEnumValue("_periodEndFinancialStatements")
    PERIOD_END_FINANCIAL_STATEMENTS("_periodEndFinancialStatements"),
    @XmlEnumValue("_periodEndJournals")
    PERIOD_END_JOURNALS("_periodEndJournals"),
    @XmlEnumValue("_persistSearch")
    PERSIST_SEARCH("_persistSearch"),
    @XmlEnumValue("_phasedProcesses")
    PHASED_PROCESSES("_phasedProcesses"),
    @XmlEnumValue("_phoneCalls")
    PHONE_CALLS("_phoneCalls"),
    @XmlEnumValue("_plannedRevenue")
    PLANNED_REVENUE("_plannedRevenue"),
    @XmlEnumValue("_plannedStandardCost")
    PLANNED_STANDARD_COST("_plannedStandardCost"),
    @XmlEnumValue("_positions")
    POSITIONS("_positions"),
    @XmlEnumValue("_postingPeriodOnTransactions")
    POSTING_PERIOD_ON_TRANSACTIONS("_postingPeriodOnTransactions"),
    @XmlEnumValue("_postTime")
    POST_TIME("_postTime"),
    @XmlEnumValue("_postVendorBillVariances")
    POST_VENDOR_BILL_VARIANCES("_postVendorBillVariances"),
    @XmlEnumValue("_presentationCategories")
    PRESENTATION_CATEGORIES("_presentationCategories"),
    @XmlEnumValue("_printChecksAndForms")
    PRINT_CHECKS_AND_FORMS("_printChecksAndForms"),
    @XmlEnumValue("_printEmailFax")
    PRINT_EMAIL_FAX("_printEmailFax"),
    @XmlEnumValue("_printShipmentDocuments")
    PRINT_SHIPMENT_DOCUMENTS("_printShipmentDocuments"),
    @XmlEnumValue("_processGSTRefund")
    PROCESS_GST_REFUND("_processGSTRefund"),
    @XmlEnumValue("_processPayroll")
    PROCESS_PAYROLL("_processPayroll"),
    @XmlEnumValue("_projectProfitability")
    PROJECT_PROFITABILITY("_projectProfitability"),
    @XmlEnumValue("_projectProfitabilitySetup")
    PROJECT_PROFITABILITY_SETUP("_projectProfitabilitySetup"),
    @XmlEnumValue("_projectProjectTemplateConversion")
    PROJECT_PROJECT_TEMPLATE_CONVERSION("_projectProjectTemplateConversion"),
    @XmlEnumValue("_projectRevenueRules")
    PROJECT_REVENUE_RULES("_projectRevenueRules"),
    @XmlEnumValue("_projectTasks")
    PROJECT_TASKS("_projectTasks"),
    @XmlEnumValue("_projectTemplates")
    PROJECT_TEMPLATES("_projectTemplates"),
    @XmlEnumValue("_promotionCode")
    PROMOTION_CODE("_promotionCode"),
    @XmlEnumValue("_provisioning")
    PROVISIONING("_provisioning"),
    @XmlEnumValue("_provisioningForQa")
    PROVISIONING_FOR_QA("_provisioningForQa"),
    @XmlEnumValue("_provisionNewAccountOnTestdrive")
    PROVISION_NEW_ACCOUNT_ON_TESTDRIVE("_provisionNewAccountOnTestdrive"),
    @XmlEnumValue("_provisionTestDrive")
    PROVISION_TEST_DRIVE("_provisionTestDrive"),
    @XmlEnumValue("_pstSummaryReport")
    PST_SUMMARY_REPORT("_pstSummaryReport"),
    @XmlEnumValue("_publicTemplateCategories")
    PUBLIC_TEMPLATE_CATEGORIES("_publicTemplateCategories"),
    @XmlEnumValue("_publishDashboards")
    PUBLISH_DASHBOARDS("_publishDashboards"),
    @XmlEnumValue("_publishEmployeeList")
    PUBLISH_EMPLOYEE_LIST("_publishEmployeeList"),
    @XmlEnumValue("_publishForms")
    PUBLISH_FORMS("_publishForms"),
    @XmlEnumValue("_publishKnowledgeBase")
    PUBLISH_KNOWLEDGE_BASE("_publishKnowledgeBase"),
    @XmlEnumValue("_publishRSSFeeds")
    PUBLISH_RSS_FEEDS("_publishRSSFeeds"),
    @XmlEnumValue("_publishSearch")
    PUBLISH_SEARCH("_publishSearch"),
    @XmlEnumValue("_purchaseContract")
    PURCHASE_CONTRACT("_purchaseContract"),
    @XmlEnumValue("_purchaseContractApproval")
    PURCHASE_CONTRACT_APPROVAL("_purchaseContractApproval"),
    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder"),
    @XmlEnumValue("_purchaseOrderReports")
    PURCHASE_ORDER_REPORTS("_purchaseOrderReports"),
    @XmlEnumValue("_purchases")
    PURCHASES("_purchases"),
    @XmlEnumValue("_quantityPricingSchedules")
    QUANTITY_PRICING_SCHEDULES("_quantityPricingSchedules"),
    @XmlEnumValue("_quotaReports")
    QUOTA_REPORTS("_quotaReports"),
    @XmlEnumValue("_receiveOrder")
    RECEIVE_ORDER("_receiveOrder"),
    @XmlEnumValue("_receiveReturns")
    RECEIVE_RETURNS("_receiveReturns"),
    @XmlEnumValue("_recognizeGiftCertificateIncome")
    RECOGNIZE_GIFT_CERTIFICATE_INCOME("_recognizeGiftCertificateIncome"),
    @XmlEnumValue("_reconcile")
    RECONCILE("_reconcile"),
    @XmlEnumValue("_reconcileReporting")
    RECONCILE_REPORTING("_reconcileReporting"),
    @XmlEnumValue("_recordCustomField")
    RECORD_CUSTOM_FIELD("_recordCustomField"),
    @XmlEnumValue("_refundReturns")
    REFUND_RETURNS("_refundReturns"),
    @XmlEnumValue("_relatedItems")
    RELATED_ITEMS("_relatedItems"),
    @XmlEnumValue("_reportCustomization")
    REPORT_CUSTOMIZATION("_reportCustomization"),
    @XmlEnumValue("_reportScheduling")
    REPORT_SCHEDULING("_reportScheduling"),
    @XmlEnumValue("_requestForQuote")
    REQUEST_FOR_QUOTE("_requestForQuote"),
    @XmlEnumValue("_requisition")
    REQUISITION("_requisition"),
    @XmlEnumValue("_requisitionApproval")
    REQUISITION_APPROVAL("_requisitionApproval"),
    @XmlEnumValue("_resource")
    RESOURCE("_resource"),
    @XmlEnumValue("_resourceAllocationApproval")
    RESOURCE_ALLOCATION_APPROVAL("_resourceAllocationApproval"),
    @XmlEnumValue("_resourceAllocationReports")
    RESOURCE_ALLOCATION_REPORTS("_resourceAllocationReports"),
    @XmlEnumValue("_resourceAllocations")
    RESOURCE_ALLOCATIONS("_resourceAllocations"),
    @XmlEnumValue("_returnAuthApproval")
    RETURN_AUTH_APPROVAL("_returnAuthApproval"),
    @XmlEnumValue("_returnAuthorization")
    RETURN_AUTHORIZATION("_returnAuthorization"),
    @XmlEnumValue("_returnAuthorizationReports")
    RETURN_AUTHORIZATION_REPORTS("_returnAuthorizationReports"),
    @XmlEnumValue("_revalueInventoryCost")
    REVALUE_INVENTORY_COST("_revalueInventoryCost"),
    @XmlEnumValue("_revenueArrangement")
    REVENUE_ARRANGEMENT("_revenueArrangement"),
    @XmlEnumValue("_revenueArrangementApproval")
    REVENUE_ARRANGEMENT_APPROVAL("_revenueArrangementApproval"),
    @XmlEnumValue("_revenueCommitment")
    REVENUE_COMMITMENT("_revenueCommitment"),
    @XmlEnumValue("_revenueCommitmentReversal")
    REVENUE_COMMITMENT_REVERSAL("_revenueCommitmentReversal"),
    @XmlEnumValue("_revenueContracts")
    REVENUE_CONTRACTS("_revenueContracts"),
    @XmlEnumValue("_revenueElement")
    REVENUE_ELEMENT("_revenueElement"),
    @XmlEnumValue("_revenueManagementVSOE")
    REVENUE_MANAGEMENT_VSOE("_revenueManagementVSOE"),
    @XmlEnumValue("_revenueRecognitionFieldMapping")
    REVENUE_RECOGNITION_FIELD_MAPPING("_revenueRecognitionFieldMapping"),
    @XmlEnumValue("_revenueRecognitionPlan")
    REVENUE_RECOGNITION_PLAN("_revenueRecognitionPlan"),
    @XmlEnumValue("_revenueRecognitionReports")
    REVENUE_RECOGNITION_REPORTS("_revenueRecognitionReports"),
    @XmlEnumValue("_revenueRecognitionRule")
    REVENUE_RECOGNITION_RULE("_revenueRecognitionRule"),
    @XmlEnumValue("_revenueRecognitionSchedules")
    REVENUE_RECOGNITION_SCHEDULES("_revenueRecognitionSchedules"),
    @XmlEnumValue("_reviewCustomGlPlugInExecutions")
    REVIEW_CUSTOM_GL_PLUG_IN_EXECUTIONS("_reviewCustomGlPlugInExecutions"),
    @XmlEnumValue("_roles")
    ROLES("_roles"),
    @XmlEnumValue("_runPayroll")
    RUN_PAYROLL("_runPayroll"),
    @XmlEnumValue("_sales")
    SALES("_sales"),
    @XmlEnumValue("_salesByPartner")
    SALES_BY_PARTNER("_salesByPartner"),
    @XmlEnumValue("_salesByPromotionCode")
    SALES_BY_PROMOTION_CODE("_salesByPromotionCode"),
    @XmlEnumValue("_salesCampaigns")
    SALES_CAMPAIGNS("_salesCampaigns"),
    @XmlEnumValue("_salesForceAutomation")
    SALES_FORCE_AUTOMATION("_salesForceAutomation"),
    @XmlEnumValue("_salesForceAutomationSetup")
    SALES_FORCE_AUTOMATION_SETUP("_salesForceAutomationSetup"),
    @XmlEnumValue("_salesOrder")
    SALES_ORDER("_salesOrder"),
    @XmlEnumValue("_salesOrderApproval")
    SALES_ORDER_APPROVAL("_salesOrderApproval"),
    @XmlEnumValue("_salesOrderFulfillmentReports")
    SALES_ORDER_FULFILLMENT_REPORTS("_salesOrderFulfillmentReports"),
    @XmlEnumValue("_salesOrderReports")
    SALES_ORDER_REPORTS("_salesOrderReports"),
    @XmlEnumValue("_salesOrderTransactionReport")
    SALES_ORDER_TRANSACTION_REPORT("_salesOrderTransactionReport"),
    @XmlEnumValue("_salesRoles")
    SALES_ROLES("_salesRoles"),
    @XmlEnumValue("_salesTerritory")
    SALES_TERRITORY("_salesTerritory"),
    @XmlEnumValue("_salesTerritoryRule")
    SALES_TERRITORY_RULE("_salesTerritoryRule"),
    @XmlEnumValue("_samlSingleSignOn")
    SAML_SINGLE_SIGN_ON("_samlSingleSignOn"),
    @XmlEnumValue("_scheduleMassUpdates")
    SCHEDULE_MASS_UPDATES("_scheduleMassUpdates"),
    @XmlEnumValue("_setUpAccounting")
    SET_UP_ACCOUNTING("_setUpAccounting"),
    @XmlEnumValue("_setUpAchProcessing")
    SET_UP_ACH_PROCESSING("_setUpAchProcessing"),
    @XmlEnumValue("_setUpAdpPayroll")
    SET_UP_ADP_PAYROLL("_setUpAdpPayroll"),
    @XmlEnumValue("_setUpBillPay")
    SET_UP_BILL_PAY("_setUpBillPay"),
    @XmlEnumValue("_setUpBudgets")
    SET_UP_BUDGETS("_setUpBudgets"),
    @XmlEnumValue("_setUpCampaignEmailAddresses")
    SET_UP_CAMPAIGN_EMAIL_ADDRESSES("_setUpCampaignEmailAddresses"),
    @XmlEnumValue("_setupCampaigns")
    SETUP_CAMPAIGNS("_setupCampaigns"),
    @XmlEnumValue("_setUpCompany")
    SET_UP_COMPANY("_setUpCompany"),
    @XmlEnumValue("_setUpCsvPreferences")
    SET_UP_CSV_PREFERENCES("_setUpCsvPreferences"),
    @XmlEnumValue("_setUpDomains")
    SET_UP_DOMAINS("_setUpDomains"),
    @XmlEnumValue("_setUpImageResizing")
    SET_UP_IMAGE_RESIZING("_setUpImageResizing"),
    @XmlEnumValue("_setUpOpenidSingleSignOn")
    SET_UP_OPENID_SINGLE_SIGN_ON("_setUpOpenidSingleSignOn"),
    @XmlEnumValue("_setUpPayroll")
    SET_UP_PAYROLL("_setUpPayroll"),
    @XmlEnumValue("_setUpReminders")
    SET_UP_REMINDERS("_setUpReminders"),
    @XmlEnumValue("_setUpSamlSingleSignOn")
    SET_UP_SAML_SINGLE_SIGN_ON("_setUpSamlSingleSignOn"),
    @XmlEnumValue("_setUpSnapshots")
    SET_UP_SNAPSHOTS("_setUpSnapshots"),
    @XmlEnumValue("_setUpWebServices")
    SET_UP_WEB_SERVICES("_setUpWebServices"),
    @XmlEnumValue("_setUpWebSite")
    SET_UP_WEB_SITE("_setUpWebSite"),
    @XmlEnumValue("_setUpYearStatus")
    SET_UP_YEAR_STATUS("_setUpYearStatus"),
    @XmlEnumValue("_shippingItems")
    SHIPPING_ITEMS("_shippingItems"),
    @XmlEnumValue("_shippingPartnerPackage")
    SHIPPING_PARTNER_PACKAGE("_shippingPartnerPackage"),
    @XmlEnumValue("_shippingPartnerRegistration")
    SHIPPING_PARTNER_REGISTRATION("_shippingPartnerRegistration"),
    @XmlEnumValue("_shippingPartnerShipment")
    SHIPPING_PARTNER_SHIPMENT("_shippingPartnerShipment"),
    @XmlEnumValue("_shortcuts")
    SHORTCUTS("_shortcuts"),
    @XmlEnumValue("_standardCostVersion")
    STANDARD_COST_VERSION("_standardCostVersion"),
    @XmlEnumValue("_statementCharge")
    STATEMENT_CHARGE("_statementCharge"),
    @XmlEnumValue("_statisticalAccountRegisters")
    STATISTICAL_ACCOUNT_REGISTERS("_statisticalAccountRegisters"),
    @XmlEnumValue("_storeCategories")
    STORE_CATEGORIES("_storeCategories"),
    @XmlEnumValue("_storeContentCategories")
    STORE_CONTENT_CATEGORIES("_storeContentCategories"),
    @XmlEnumValue("_storeContentItems")
    STORE_CONTENT_ITEMS("_storeContentItems"),
    @XmlEnumValue("_storeLogoUpload")
    STORE_LOGO_UPLOAD("_storeLogoUpload"),
    @XmlEnumValue("_storePickupFulfillment")
    STORE_PICKUP_FULFILLMENT("_storePickupFulfillment"),
    @XmlEnumValue("_storeTabs")
    STORE_TABS("_storeTabs"),
    @XmlEnumValue("_subscriptionPlan")
    SUBSCRIPTION_PLAN("_subscriptionPlan"),
    @XmlEnumValue("_subscriptions")
    SUBSCRIPTIONS("_subscriptions"),
    @XmlEnumValue("_subsidiaries")
    SUBSIDIARIES("_subsidiaries"),
    @XmlEnumValue("_subsidiaryTaxEngineSelection")
    SUBSIDIARY_TAX_ENGINE_SELECTION("_subsidiaryTaxEngineSelection"),
    @XmlEnumValue("_suiteAppDeployment")
    SUITE_APP_DEPLOYMENT("_suiteAppDeployment"),
    @XmlEnumValue("_suiteBundler")
    SUITE_BUNDLER("_suiteBundler"),
    @XmlEnumValue("_suiteBundlerAuditTrail")
    SUITE_BUNDLER_AUDIT_TRAIL("_suiteBundlerAuditTrail"),
    @XmlEnumValue("_suiteBundlerUpgrades")
    SUITE_BUNDLER_UPGRADES("_suiteBundlerUpgrades"),
    @XmlEnumValue("_suiteScript")
    SUITE_SCRIPT("_suiteScript"),
    @XmlEnumValue("_suiteScriptNlCorpManagement")
    SUITE_SCRIPT_NL_CORP_MANAGEMENT("_suiteScriptNlCorpManagement"),
    @XmlEnumValue("_suiteScriptScheduling")
    SUITE_SCRIPT_SCHEDULING("_suiteScriptScheduling"),
    @XmlEnumValue("_suiteSignon")
    SUITE_SIGNON("_suiteSignon"),
    @XmlEnumValue("_suitetaxMigration")
    SUITETAX_MIGRATION("_suitetaxMigration"),
    @XmlEnumValue("_supplyChainSnapshotList")
    SUPPLY_CHAIN_SNAPSHOT_LIST("_supplyChainSnapshotList"),
    @XmlEnumValue("_support")
    SUPPORT("_support"),
    @XmlEnumValue("_supportCaseIssue")
    SUPPORT_CASE_ISSUE("_supportCaseIssue"),
    @XmlEnumValue("_supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("_supportCaseOrigin"),
    @XmlEnumValue("_supportCasePriority")
    SUPPORT_CASE_PRIORITY("_supportCasePriority"),
    @XmlEnumValue("_supportCaseSnapshotReminders")
    SUPPORT_CASE_SNAPSHOT_REMINDERS("_supportCaseSnapshotReminders"),
    @XmlEnumValue("_supportCaseStatus")
    SUPPORT_CASE_STATUS("_supportCaseStatus"),
    @XmlEnumValue("_supportCaseTerritory")
    SUPPORT_CASE_TERRITORY("_supportCaseTerritory"),
    @XmlEnumValue("_supportCaseTerritoryRule")
    SUPPORT_CASE_TERRITORY_RULE("_supportCaseTerritoryRule"),
    @XmlEnumValue("_supportCaseType")
    SUPPORT_CASE_TYPE("_supportCaseType"),
    @XmlEnumValue("_supportSetup")
    SUPPORT_SETUP("_supportSetup"),
    @XmlEnumValue("_swapPricesBetweenPriceLevels")
    SWAP_PRICES_BETWEEN_PRICE_LEVELS("_swapPricesBetweenPriceLevels"),
    @XmlEnumValue("_systemEmailTemplate")
    SYSTEM_EMAIL_TEMPLATE("_systemEmailTemplate"),
    @XmlEnumValue("_systemStatus")
    SYSTEM_STATUS("_systemStatus"),
    @XmlEnumValue("_tableauWorkbookExport")
    TABLEAU_WORKBOOK_EXPORT("_tableauWorkbookExport"),
    @XmlEnumValue("_tasks")
    TASKS("_tasks"),
    @XmlEnumValue("_tax")
    TAX("_tax"),
    @XmlEnumValue("_taxDetailsTab")
    TAX_DETAILS_TAB("_taxDetailsTab"),
    @XmlEnumValue("_taxItems")
    TAX_ITEMS("_taxItems"),
    @XmlEnumValue("_taxReports")
    TAX_REPORTS("_taxReports"),
    @XmlEnumValue("_taxSchedules")
    TAX_SCHEDULES("_taxSchedules"),
    @XmlEnumValue("_teamSellingContribution")
    TEAM_SELLING_CONTRIBUTION("_teamSellingContribution"),
    @XmlEnumValue("_tegataAccounts")
    TEGATA_ACCOUNTS("_tegataAccounts"),
    @XmlEnumValue("_tegataPayable")
    TEGATA_PAYABLE("_tegataPayable"),
    @XmlEnumValue("_tegataReceivable")
    TEGATA_RECEIVABLE("_tegataReceivable"),
    @XmlEnumValue("_telephonyIntegration")
    TELEPHONY_INTEGRATION("_telephonyIntegration"),
    @XmlEnumValue("_templateCategories")
    TEMPLATE_CATEGORIES("_templateCategories"),
    @XmlEnumValue("_terminationReasons")
    TERMINATION_REASONS("_terminationReasons"),
    @XmlEnumValue("_testdriveMasters")
    TESTDRIVE_MASTERS("_testdriveMasters"),
    @XmlEnumValue("_timeOffAdministration")
    TIME_OFF_ADMINISTRATION("_timeOffAdministration"),
    @XmlEnumValue("_timer")
    TIMER("_timer"),
    @XmlEnumValue("_timeTracking")
    TIME_TRACKING("_timeTracking"),
    @XmlEnumValue("_trackMessages")
    TRACK_MESSAGES("_trackMessages"),
    @XmlEnumValue("_trackTime")
    TRACK_TIME("_trackTime"),
    @XmlEnumValue("_transactionDetail")
    TRANSACTION_DETAIL("_transactionDetail"),
    @XmlEnumValue("_transactionNumberingAuditLog")
    TRANSACTION_NUMBERING_AUDIT_LOG("_transactionNumberingAuditLog"),
    @XmlEnumValue("_transactionReceiveInboundShipment")
    TRANSACTION_RECEIVE_INBOUND_SHIPMENT("_transactionReceiveInboundShipment"),
    @XmlEnumValue("_transferFunds")
    TRANSFER_FUNDS("_transferFunds"),
    @XmlEnumValue("_transferInventory")
    TRANSFER_INVENTORY("_transferInventory"),
    @XmlEnumValue("_transferOrder")
    TRANSFER_ORDER("_transferOrder"),
    @XmlEnumValue("_transferOrderApproval")
    TRANSFER_ORDER_APPROVAL("_transferOrderApproval"),
    @XmlEnumValue("_translation")
    TRANSLATION("_translation"),
    @XmlEnumValue("_trialBalance")
    TRIAL_BALANCE("_trialBalance"),
    @XmlEnumValue("_twoFactorAuthentication")
    TWO_FACTOR_AUTHENTICATION("_twoFactorAuthentication"),
    @XmlEnumValue("_twoFactorAuthenticationBase")
    TWO_FACTOR_AUTHENTICATION_BASE("_twoFactorAuthenticationBase"),
    @XmlEnumValue("_unbilledReceivableRegisters")
    UNBILLED_RECEIVABLE_REGISTERS("_unbilledReceivableRegisters"),
    @XmlEnumValue("_unbuildAssemblies")
    UNBUILD_ASSEMBLIES("_unbuildAssemblies"),
    @XmlEnumValue("_uncategorizedPresentationItems")
    UNCATEGORIZED_PRESENTATION_ITEMS("_uncategorizedPresentationItems"),
    @XmlEnumValue("_undeliveredEmails")
    UNDELIVERED_EMAILS("_undeliveredEmails"),
    @XmlEnumValue("_units")
    UNITS("_units"),
    @XmlEnumValue("_updatePrices")
    UPDATE_PRICES("_updatePrices"),
    @XmlEnumValue("_upsellAssistant")
    UPSELL_ASSISTANT("_upsellAssistant"),
    @XmlEnumValue("_upsellSetup")
    UPSELL_SETUP("_upsellSetup"),
    @XmlEnumValue("_upsellWizard")
    UPSELL_WIZARD("_upsellWizard"),
    @XmlEnumValue("_usage")
    USAGE("_usage"),
    @XmlEnumValue("_userAccessTokens")
    USER_ACCESS_TOKENS("_userAccessTokens"),
    @XmlEnumValue("_userPreferences")
    USER_PREFERENCES("_userPreferences"),
    @XmlEnumValue("_usersAndPasswords")
    USERS_AND_PASSWORDS("_usersAndPasswords"),
    @XmlEnumValue("_vendorBillApproval")
    VENDOR_BILL_APPROVAL("_vendorBillApproval"),
    @XmlEnumValue("_vendorPaymentStatus")
    VENDOR_PAYMENT_STATUS("_vendorPaymentStatus"),
    @XmlEnumValue("_vendorRequestForQuote")
    VENDOR_REQUEST_FOR_QUOTE("_vendorRequestForQuote"),
    @XmlEnumValue("_vendorReturnAuthApproval")
    VENDOR_RETURN_AUTH_APPROVAL("_vendorReturnAuthApproval"),
    @XmlEnumValue("_vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("_vendorReturnAuthorization"),
    @XmlEnumValue("_vendorReturns")
    VENDOR_RETURNS("_vendorReturns"),
    @XmlEnumValue("_vendors")
    VENDORS("_vendors"),
    @XmlEnumValue("_viewGatewayAsynchronousNotifications")
    VIEW_GATEWAY_ASYNCHRONOUS_NOTIFICATIONS("_viewGatewayAsynchronousNotifications"),
    @XmlEnumValue("_viewLoginAuditTrail")
    VIEW_LOGIN_AUDIT_TRAIL("_viewLoginAuditTrail"),
    @XmlEnumValue("_viewOnlineBillPayStatus")
    VIEW_ONLINE_BILL_PAY_STATUS("_viewOnlineBillPayStatus"),
    @XmlEnumValue("_viewPaymentEvents")
    VIEW_PAYMENT_EVENTS("_viewPaymentEvents"),
    @XmlEnumValue("_viewUnencryptedCreditCards")
    VIEW_UNENCRYPTED_CREDIT_CARDS("_viewUnencryptedCreditCards"),
    @XmlEnumValue("_viewWebServicesLogs")
    VIEW_WEB_SERVICES_LOGS("_viewWebServicesLogs"),
    @XmlEnumValue("_webServices")
    WEB_SERVICES("_webServices"),
    @XmlEnumValue("_webSiteExternalPublisher")
    WEB_SITE_EXTERNAL_PUBLISHER("_webSiteExternalPublisher"),
    @XmlEnumValue("_webSiteManagement")
    WEB_SITE_MANAGEMENT("_webSiteManagement"),
    @XmlEnumValue("_webSiteReport")
    WEB_SITE_REPORT("_webSiteReport"),
    @XmlEnumValue("_webStoreEmailTemplate")
    WEB_STORE_EMAIL_TEMPLATE("_webStoreEmailTemplate"),
    @XmlEnumValue("_webStoreReport")
    WEB_STORE_REPORT("_webStoreReport"),
    @XmlEnumValue("_workCalendar")
    WORK_CALENDAR("_workCalendar"),
    @XmlEnumValue("_workflow")
    WORKFLOW("_workflow"),
    @XmlEnumValue("_workforceAnalytics")
    WORKFORCE_ANALYTICS("_workforceAnalytics"),
    @XmlEnumValue("_workOrder")
    WORK_ORDER("_workOrder"),
    @XmlEnumValue("_workOrderClose")
    WORK_ORDER_CLOSE("_workOrderClose"),
    @XmlEnumValue("_workOrderCompletion")
    WORK_ORDER_COMPLETION("_workOrderCompletion"),
    @XmlEnumValue("_workOrderIssue")
    WORK_ORDER_ISSUE("_workOrderIssue"),
    @XmlEnumValue("_workplaces")
    WORKPLACES("_workplaces");
    private final String value;

    PermissionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionCode fromValue(String v) {
        for (PermissionCode c: PermissionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

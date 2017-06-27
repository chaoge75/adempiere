/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for PP_Product_Planning
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_PP_Product_Planning 
{

    /** TableName=PP_Product_Planning */
    public static final String Table_Name = "PP_Product_Planning";

    /** AD_Table_ID=53020 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_Workflow_ID */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";

	/** Set Workflow.
	  * Workflow or combination of tasks
	  */
	public void setAD_Workflow_ID (int AD_Workflow_ID);

	/** Get Workflow.
	  * Workflow or combination of tasks
	  */
	public int getAD_Workflow_ID();

	public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DD_NetworkDistribution_ID */
    public static final String COLUMNNAME_DD_NetworkDistribution_ID = "DD_NetworkDistribution_ID";

	/** Set Network Distribution.
	  * Identifies a distribution network, distribution networks are used to establish the source and target of the materials in the supply chain
	  */
	public void setDD_NetworkDistribution_ID (int DD_NetworkDistribution_ID);

	/** Get Network Distribution.
	  * Identifies a distribution network, distribution networks are used to establish the source and target of the materials in the supply chain
	  */
	public int getDD_NetworkDistribution_ID();

	public org.eevolution.model.I_DD_NetworkDistribution getDD_NetworkDistribution() throws RuntimeException;

    /** Column name DeliveryTime_Promised */
    public static final String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";

	/** Set Promised Delivery Time.
	  * Promised days between order and delivery
	  */
	public void setDeliveryTime_Promised (BigDecimal DeliveryTime_Promised);

	/** Get Promised Delivery Time.
	  * Promised days between order and delivery
	  */
	public BigDecimal getDeliveryTime_Promised();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsCreatePlan */
    public static final String COLUMNNAME_IsCreatePlan = "IsCreatePlan";

	/** Set Create Plan.
	  * Indicates whether planned orders will be generated by MRP
	  */
	public void setIsCreatePlan (boolean IsCreatePlan);

	/** Get Create Plan.
	  * Indicates whether planned orders will be generated by MRP
	  */
	public boolean isCreatePlan();

    /** Column name IsIssue */
    public static final String COLUMNNAME_IsIssue = "IsIssue";

	/** Set Is Issue	  */
	public void setIsIssue (boolean IsIssue);

	/** Get Is Issue	  */
	public boolean isIssue();

    /** Column name IsMPS */
    public static final String COLUMNNAME_IsMPS = "IsMPS";

	/** Set Is MPS.
	  * Indicates if this product is part of the master production schedule
	  */
	public void setIsMPS (boolean IsMPS);

	/** Get Is MPS.
	  * Indicates if this product is part of the master production schedule
	  */
	public boolean isMPS();

    /** Column name IsPhantom */
    public static final String COLUMNNAME_IsPhantom = "IsPhantom";

	/** Set Phantom.
	  * Phantom Component
	  */
	public void setIsPhantom (boolean IsPhantom);

	/** Get Phantom.
	  * Phantom Component
	  */
	public boolean isPhantom();

    /** Column name IsRequiredDRP */
    public static final String COLUMNNAME_IsRequiredDRP = "IsRequiredDRP";

	/** Set Is DRP Required.
	  * Is DRP Required
	  */
	public void setIsRequiredDRP (boolean IsRequiredDRP);

	/** Get Is DRP Required.
	  * Is DRP Required
	  */
	public boolean isRequiredDRP();

    /** Column name IsRequiredMRP */
    public static final String COLUMNNAME_IsRequiredMRP = "IsRequiredMRP";

	/** Set Is MRP Required.
	  * Is MRP Required
	  */
	public void setIsRequiredMRP (boolean IsRequiredMRP);

	/** Get Is MRP Required.
	  * Is MRP Required
	  */
	public boolean isRequiredMRP();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name M_Warehouse_ID */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/** Set Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID);

	/** Get Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID();

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /** Column name Order_Max */
    public static final String COLUMNNAME_Order_Max = "Order_Max";

	/** Set Maximum Order Qty.
	  * Maximum order quantity in UOM
	  */
	public void setOrder_Max (BigDecimal Order_Max);

	/** Get Maximum Order Qty.
	  * Maximum order quantity in UOM
	  */
	public BigDecimal getOrder_Max();

    /** Column name Order_Min */
    public static final String COLUMNNAME_Order_Min = "Order_Min";

	/** Set Minimum Order Qty.
	  * Minimum order quantity in UOM
	  */
	public void setOrder_Min (BigDecimal Order_Min);

	/** Get Minimum Order Qty.
	  * Minimum order quantity in UOM
	  */
	public BigDecimal getOrder_Min();

    /** Column name Order_Pack */
    public static final String COLUMNNAME_Order_Pack = "Order_Pack";

	/** Set Order Pack Qty.
	  * Package order size in UOM (e.g. order set of 5 units)
	  */
	public void setOrder_Pack (BigDecimal Order_Pack);

	/** Get Order Pack Qty.
	  * Package order size in UOM (e.g. order set of 5 units)
	  */
	public BigDecimal getOrder_Pack();

    /** Column name Order_Period */
    public static final String COLUMNNAME_Order_Period = "Order_Period";

	/** Set Order Period.
	  * Order Period
	  */
	public void setOrder_Period (BigDecimal Order_Period);

	/** Get Order Period.
	  * Order Period
	  */
	public BigDecimal getOrder_Period();

    /** Column name Order_Policy */
    public static final String COLUMNNAME_Order_Policy = "Order_Policy";

	/** Set Order Policy.
	  * Order Policy
	  */
	public void setOrder_Policy (String Order_Policy);

	/** Get Order Policy.
	  * Order Policy
	  */
	public String getOrder_Policy();

    /** Column name Order_Qty */
    public static final String COLUMNNAME_Order_Qty = "Order_Qty";

	/** Set Order Qty.
	  * Order Qty
	  */
	public void setOrder_Qty (BigDecimal Order_Qty);

	/** Get Order Qty.
	  * Order Qty
	  */
	public BigDecimal getOrder_Qty();

    /** Column name Planner_ID */
    public static final String COLUMNNAME_Planner_ID = "Planner_ID";

	/** Set Planner.
	  * Company Agent for Planning
	  */
	public void setPlanner_ID (int Planner_ID);

	/** Get Planner.
	  * Company Agent for Planning
	  */
	public int getPlanner_ID();

	public org.compiere.model.I_AD_User getPlanner() throws RuntimeException;

    /** Column name PP_Product_BOM_ID */
    public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";

	/** Set BOM & Formula.
	  * BOM & Formula
	  */
	public void setPP_Product_BOM_ID (int PP_Product_BOM_ID);

	/** Get BOM & Formula.
	  * BOM & Formula
	  */
	public int getPP_Product_BOM_ID();

	public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /** Column name PP_Product_Planning_ID */
    public static final String COLUMNNAME_PP_Product_Planning_ID = "PP_Product_Planning_ID";

	/** Set Product Planning.
	  * Product Planning
	  */
	public void setPP_Product_Planning_ID (int PP_Product_Planning_ID);

	/** Get Product Planning.
	  * Product Planning
	  */
	public int getPP_Product_Planning_ID();

    /** Column name SafetyStock */
    public static final String COLUMNNAME_SafetyStock = "SafetyStock";

	/** Set Safety Stock Qty.
	  * Safety stock is a term used to describe a level of stock that is maintained below the cycle stock to buffer against stock-outs
	  */
	public void setSafetyStock (BigDecimal SafetyStock);

	/** Get Safety Stock Qty.
	  * Safety stock is a term used to describe a level of stock that is maintained below the cycle stock to buffer against stock-outs
	  */
	public BigDecimal getSafetyStock();

    /** Column name S_Resource_ID */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

	/** Set Resource.
	  * Resource
	  */
	public void setS_Resource_ID (int S_Resource_ID);

	/** Get Resource.
	  * Resource
	  */
	public int getS_Resource_ID();

	public org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

    /** Column name TimeFence */
    public static final String COLUMNNAME_TimeFence = "TimeFence";

	/** Set Time Fence.
	  * The Time Fence is the number of days since you execute the MRP process inside of which  the system must not change the planned orders. 
	  */
	public void setTimeFence (BigDecimal TimeFence);

	/** Get Time Fence.
	  * The Time Fence is the number of days since you execute the MRP process inside of which  the system must not change the planned orders. 
	  */
	public BigDecimal getTimeFence();

    /** Column name TransferTime */
    public static final String COLUMNNAME_TransferTime = "TransferTime";

	/** Set Transfer Time.
	  * Transfer Time
	  */
	public void setTransferTime (BigDecimal TransferTime);

	/** Get Transfer Time.
	  * Transfer Time
	  */
	public BigDecimal getTransferTime();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name WorkingTime */
    public static final String COLUMNNAME_WorkingTime = "WorkingTime";

	/** Set Working Time.
	  * Workflow Simulation Execution Time
	  */
	public void setWorkingTime (BigDecimal WorkingTime);

	/** Get Working Time.
	  * Workflow Simulation Execution Time
	  */
	public BigDecimal getWorkingTime();

    /** Column name Yield */
    public static final String COLUMNNAME_Yield = "Yield";

	/** Set Yield %.
	  * The Yield is the percentage of a lot that is expected to be of acceptable wuality may fall below 100 percent
	  */
	public void setYield (int Yield);

	/** Get Yield %.
	  * The Yield is the percentage of a lot that is expected to be of acceptable wuality may fall below 100 percent
	  */
	public int getYield();
}

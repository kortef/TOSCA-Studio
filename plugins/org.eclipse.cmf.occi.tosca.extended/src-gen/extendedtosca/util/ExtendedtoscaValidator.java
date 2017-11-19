/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package extendedtosca.util;

import extendedtosca.*;

import java.util.Map;

import org.eclipse.cmf.occi.sla.util.SlaValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see extendedtosca.ExtendedtoscaPackage
 * @generated
 */
public class ExtendedtoscaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExtendedtoscaValidator INSTANCE = new ExtendedtoscaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "extendedtosca";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_ROOT__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes webapplication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_WEBAPPLICATION__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes softwarecomponent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_SOFTWARECOMPONENT__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Database' of 'Tosca nodes dbms'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_DBMS__SOURCE_MUST_BE_DATABASE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes objectstorage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_OBJECTSTORAGE__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Software Component' of 'Tosca nodes compute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_COMPUTE__SOURCE_MUST_BE_SOFTWARE_COMPONENT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes compute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_COMPUTE__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Web Application' of 'Tosca nodes webserver'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_WEBSERVER__SOURCE_MUST_BE_WEB_APPLICATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes database'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_DATABASE__APPLIES_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes container application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_CONTAINER_APPLICATION__APPLIES_CONSTRAINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca nodes blockstorage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_NODES_BLOCKSTORAGE__APPLIES_CONSTRAINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca relationships root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_ROOT__APPLIES_CONSTRAINT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Load Balancer' of 'Tosca relationships routesto'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_ROUTESTO__SOURCE_MUST_BE_LOAD_BALANCER = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Tosca relationships attachesto'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_ATTACHESTO__APPLIES_CONSTRAINT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Compute And Target Must Be Block Storage' of 'Tosca relationships attachesto'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_ATTACHESTO__SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Web Server And Target Must Be Web Application' of 'Tosca relationships hostedon'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_HOSTEDON__SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Container Application And Target Must Be Container Runtime' of 'Tosca relationships hostedon'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_HOSTEDON__SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Software Component And Target Must Be Compute' of 'Tosca relationships hostedon'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_HOSTEDON__SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Database And Target Must Be DBMS' of 'Tosca relationships hostedon'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_HOSTEDON__SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Must Be Node And Target Must Be Node' of 'Tosca relationships dependson'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOSCA_RELATIONSHIPS_DEPENDSON__SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE = 20;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 20;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlaValidator slaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedtoscaValidator() {
		super();
		slaValidator = SlaValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExtendedtoscaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExtendedtoscaPackage.ARRAYSTRING:
				return validatearraystring((arraystring)value, diagnostics, context);
			case ExtendedtoscaPackage.NETWORK_INFO:
				return validateNetworkInfo((NetworkInfo)value, diagnostics, context);
			case ExtendedtoscaPackage.PORT_INFO:
				return validatePortInfo((PortInfo)value, diagnostics, context);
			case ExtendedtoscaPackage.CREDENTIAL:
				return validateCredential((Credential)value, diagnostics, context);
			case ExtendedtoscaPackage.PORT_SPEC:
				return validatePortSpec((PortSpec)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAY_CREDENTIAL:
				return validatearrayCredential((arrayCredential)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAYINTEGER:
				return validatearrayinteger((arrayinteger)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAY_PORT_SPEC:
				return validatearrayPortSpec((arrayPortSpec)value, diagnostics, context);
			case ExtendedtoscaPackage.ARRAYVERSION:
				return validatearrayversion((arrayversion)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ROOT:
				return validateTosca_capabilities_root((Tosca_capabilities_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_NODE:
				return validateTosca_capabilities_node((Tosca_capabilities_node)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT:
				return validateTosca_capabilities_endpoint((Tosca_capabilities_endpoint)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SCALABLE:
				return validateTosca_capabilities_scalable((Tosca_capabilities_scalable)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_NETWORK_BINDABLE:
				return validateTosca_capabilities_network_bindable((Tosca_capabilities_network_bindable)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER:
				return validateTosca_capabilities_container((Tosca_capabilities_container)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_DATABASE:
				return validateTosca_capabilities_endpoint_database((Tosca_capabilities_endpoint_database)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC:
				return validateTosca_capabilities_endpoint_public((Tosca_capabilities_endpoint_public)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ENDPOINT_ADMIN:
				return validateTosca_capabilities_endpoint_admin((Tosca_capabilities_endpoint_admin)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_OPERATINGSYSTEM:
				return validateTosca_capabilities_operatingsystem((Tosca_capabilities_operatingsystem)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_ATTACHMENT:
				return validateTosca_capabilities_attachment((Tosca_capabilities_attachment)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT:
				return validateTosca_nodes_root((Tosca_nodes_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION:
				return validateTosca_nodes_webapplication((Tosca_nodes_webapplication)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT:
				return validateTosca_nodes_softwarecomponent((Tosca_nodes_softwarecomponent)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS:
				return validateTosca_nodes_dbms((Tosca_nodes_dbms)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_OBJECTSTORAGE:
				return validateTosca_nodes_objectstorage((Tosca_nodes_objectstorage)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTE:
				return validateTosca_nodes_compute((Tosca_nodes_compute)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_LOADBALANCER:
				return validateTosca_nodes_loadbalancer((Tosca_nodes_loadbalancer)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER:
				return validateTosca_nodes_webserver((Tosca_nodes_webserver)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE:
				return validateTosca_nodes_database((Tosca_nodes_database)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION:
				return validateTosca_nodes_container_application((Tosca_nodes_container_application)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_RUNTIME:
				return validateTosca_nodes_container_runtime((Tosca_nodes_container_runtime)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_BLOCKSTORAGE:
				return validateTosca_nodes_blockstorage((Tosca_nodes_blockstorage)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_POLICIES_ROOT:
				return validateTosca_policies_root((Tosca_policies_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_POLICIES_UPDATE:
				return validateTosca_policies_update((Tosca_policies_update)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_POLICIES_PLACEMENT:
				return validateTosca_policies_placement((Tosca_policies_placement)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_POLICIES_SCALING:
				return validateTosca_policies_scaling((Tosca_policies_scaling)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_POLICIES_PERFORMANCE:
				return validateTosca_policies_performance((Tosca_policies_performance)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_GROUPS_ROOT:
				return validateTosca_groups_root((Tosca_groups_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_INTERFACES_ROOT:
				return validateTosca_interfaces_root((Tosca_interfaces_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE:
				return validateTosca_interfaces_relationship_configure((Tosca_interfaces_relationship_configure)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD:
				return validateTosca_interfaces_node_lifecycle_standard((Tosca_interfaces_node_lifecycle_standard)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROOT:
				return validateTosca_relationships_root((Tosca_relationships_root)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_CONNECTSTO:
				return validateTosca_relationships_connectsto((Tosca_relationships_connectsto)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ROUTESTO:
				return validateTosca_relationships_routesto((Tosca_relationships_routesto)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_ATTACHESTO:
				return validateTosca_relationships_attachesto((Tosca_relationships_attachesto)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HOSTEDON:
				return validateTosca_relationships_hostedon((Tosca_relationships_hostedon)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_DEPENDSON:
				return validateTosca_relationships_dependson((Tosca_relationships_dependson)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_INDIGO_ENDPOINT:
				return validateTosca_capabilities_indigo_endpoint((Tosca_capabilities_indigo_endpoint)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECAP:
				return validateTosca_capabilities_somecap((Tosca_capabilities_somecap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_HA:
				return validateTosca_capabilities_ha((Tosca_capabilities_ha)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINERCHILD:
				return validateTosca_capabilities_containerchild((Tosca_capabilities_containerchild)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_SOMECHILDCAP:
				return validateTosca_capabilities_somechildcap((Tosca_capabilities_somechildcap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASE_MYSQL:
				return validateTosca_nodes_database_mysql((Tosca_nodes_database_mysql)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHPROP:
				return validateTosca_nodes_computewithprop((Tosca_nodes_computewithprop)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_ELASTICSEARCH:
				return validateTosca_nodes_softwarecomponent_elasticsearch((Tosca_nodes_softwarecomponent_elasticsearch)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DATABASEWITHLISTPARAM:
				return validateTosca_nodes_databasewithlistparam((Tosca_nodes_databasewithlistparam)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_PAYPALPIZZASTORE:
				return validateTosca_nodes_webapplication_paypalpizzastore((Tosca_nodes_webapplication_paypalpizzastore)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBAPPLICATION_WORDPRESS:
				return validateTosca_nodes_webapplication_wordpress((Tosca_nodes_webapplication_wordpress)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHCAP:
				return validateTosca_nodes_nodewithcap((Tosca_nodes_nodewithcap)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_CONTAINER_APPLICATION_DOCKER:
				return validateTosca_nodes_container_application_docker((Tosca_nodes_container_application_docker)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_KIBANA:
				return validateTosca_nodes_softwarecomponent_kibana((Tosca_nodes_softwarecomponent_kibana)value, diagnostics, context);
			case ExtendedtoscaPackage.RSYSLOG:
				return validateRsyslog((Rsyslog)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHATTRLIST:
				return validateTosca_nodes_computewithattrlist((Tosca_nodes_computewithattrlist)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_LOGSTASH:
				return validateTosca_nodes_softwarecomponent_logstash((Tosca_nodes_softwarecomponent_logstash)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_COLLECTD:
				return validateTosca_nodes_softwarecomponent_collectd((Tosca_nodes_softwarecomponent_collectd)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_COMPUTEWITHCAPWITHATTR:
				return validateTosca_nodes_computewithcapwithattr((Tosca_nodes_computewithcapwithattr)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_NODEWITHREQ:
				return validateTosca_nodes_nodewithreq((Tosca_nodes_nodewithreq)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOFTWARECOMPONENT_RSYSLOG:
				return validateTosca_nodes_softwarecomponent_rsyslog((Tosca_nodes_softwarecomponent_rsyslog)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_HACOMPUTE:
				return validateTosca_nodes_hacompute((Tosca_nodes_hacompute)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE:
				return validateTosca_nodes_somenode((Tosca_nodes_somenode)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_CAPABILITIES_CONTAINER_DOCKER:
				return validateTosca_capabilities_container_docker((Tosca_capabilities_container_docker)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_WEBSERVER_NODEJS:
				return validateTosca_nodes_webserver_nodejs((Tosca_nodes_webserver_nodejs)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_SOMENODE2:
				return validateTosca_nodes_somenode2((Tosca_nodes_somenode2)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_NODES_DBMS_MYSQL:
				return validateTosca_nodes_dbms_mysql((Tosca_nodes_dbms_mysql)value, diagnostics, context);
			case ExtendedtoscaPackage.MYCOMPANY_MYTYPES_MYSCALINGPOLICY:
				return validateMycompany_mytypes_myscalingpolicy((Mycompany_mytypes_myscalingpolicy)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCA_RELATIONSHIPS_HA:
				return validateTosca_relationships_ha((Tosca_relationships_ha)value, diagnostics, context);
			case ExtendedtoscaPackage.TEST_RELATION_CONNECTS:
				return validateTest_relation_connects((Test_relation_connects)value, diagnostics, context);
			case ExtendedtoscaPackage.PROTOCOL_ENUM:
				return validateprotocolEnum((protocolEnum)value, diagnostics, context);
			case ExtendedtoscaPackage.INITIATOR_ENUM:
				return validateinitiatorEnum((initiatorEnum)value, diagnostics, context);
			case ExtendedtoscaPackage.STRING:
				return validatestring((String)value, diagnostics, context);
			case ExtendedtoscaPackage.STRING_MIN_ONE:
				return validatestringMinOne((String)value, diagnostics, context);
			case ExtendedtoscaPackage.BOOLEAN:
				return validateboolean((Boolean)value, diagnostics, context);
			case ExtendedtoscaPackage.BYTE:
				return validatebyte((Byte)value, diagnostics, context);
			case ExtendedtoscaPackage.DOUBLE:
				return validatedouble((Double)value, diagnostics, context);
			case ExtendedtoscaPackage.FLOAT:
				return validatefloat((Float)value, diagnostics, context);
			case ExtendedtoscaPackage.INTEGER:
				return validateinteger((Integer)value, diagnostics, context);
			case ExtendedtoscaPackage.INTEGER_MIN_ONE:
				return validateintegerMinOne((Integer)value, diagnostics, context);
			case ExtendedtoscaPackage.LONG:
				return validatelong((Long)value, diagnostics, context);
			case ExtendedtoscaPackage.SHORT:
				return validateshort((Short)value, diagnostics, context);
			case ExtendedtoscaPackage.MAP:
				return validatemap((Map)value, diagnostics, context);
			case ExtendedtoscaPackage.VERSION:
				return validateversion((String)value, diagnostics, context);
			case ExtendedtoscaPackage.RANGE:
				return validaterange((Short)value, diagnostics, context);
			case ExtendedtoscaPackage.TOSCADATATYPESNETWORK_PORT_DEF:
				return validatetoscadatatypesnetworkPortDef((Short)value, diagnostics, context);
			case ExtendedtoscaPackage.SCALAR_FREQUENCY:
				return validatescalarFrequency((Double)value, diagnostics, context);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ONE_MB:
				return validatescalarSizeMinOneMB((Integer)value, diagnostics, context);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_GB:
				return validatescalarSizeMinZeroGB((Integer)value, diagnostics, context);
			case ExtendedtoscaPackage.SCALAR_SIZE_MIN_ZERO_MB:
				return validatescalarSizeMinZeroMB((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearraystring(arraystring arraystring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arraystring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInfo(NetworkInfo networkInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInfo(PortInfo portInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredential(Credential credential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(credential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortSpec(PortSpec portSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayCredential(arrayCredential arrayCredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayCredential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayinteger(arrayinteger arrayinteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayinteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayPortSpec(arrayPortSpec arrayPortSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayPortSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearrayversion(arrayversion arrayversion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayversion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_root(Tosca_capabilities_root tosca_capabilities_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_node(Tosca_capabilities_node tosca_capabilities_node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_endpoint(Tosca_capabilities_endpoint tosca_capabilities_endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_scalable(Tosca_capabilities_scalable tosca_capabilities_scalable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_scalable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_network_bindable(Tosca_capabilities_network_bindable tosca_capabilities_network_bindable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_network_bindable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_container(Tosca_capabilities_container tosca_capabilities_container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_endpoint_database(Tosca_capabilities_endpoint_database tosca_capabilities_endpoint_database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_endpoint_database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_endpoint_public(Tosca_capabilities_endpoint_public tosca_capabilities_endpoint_public, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_endpoint_public, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_endpoint_admin(Tosca_capabilities_endpoint_admin tosca_capabilities_endpoint_admin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_endpoint_admin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_operatingsystem(Tosca_capabilities_operatingsystem tosca_capabilities_operatingsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_operatingsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_attachment(Tosca_capabilities_attachment tosca_capabilities_attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_root(Tosca_nodes_root tosca_nodes_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_root, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_root, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_root_appliesConstraint(tosca_nodes_root, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_root_appliesConstraint(Tosca_nodes_root tosca_nodes_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_root.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webapplication(Tosca_nodes_webapplication tosca_nodes_webapplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webapplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webapplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_webapplication_appliesConstraint(tosca_nodes_webapplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes webapplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webapplication_appliesConstraint(Tosca_nodes_webapplication tosca_nodes_webapplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_webapplication.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent(Tosca_nodes_softwarecomponent tosca_nodes_softwarecomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes softwarecomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_appliesConstraint(Tosca_nodes_softwarecomponent tosca_nodes_softwarecomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_softwarecomponent.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_dbms(Tosca_nodes_dbms tosca_nodes_dbms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_dbms, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_dbms, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_dbms_SourceMustBeDatabase(tosca_nodes_dbms, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeDatabase constraint of '<em>Tosca nodes dbms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_dbms_SourceMustBeDatabase(Tosca_nodes_dbms tosca_nodes_dbms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_dbms.SourceMustBeDatabase(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_objectstorage(Tosca_nodes_objectstorage tosca_nodes_objectstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_objectstorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_objectstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_objectstorage_appliesConstraint(tosca_nodes_objectstorage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes objectstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_objectstorage_appliesConstraint(Tosca_nodes_objectstorage tosca_nodes_objectstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_objectstorage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_compute(Tosca_nodes_compute tosca_nodes_compute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_compute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_appliesConstraint(tosca_nodes_compute, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_compute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_compute_appliesConstraint(Tosca_nodes_compute tosca_nodes_compute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_compute.appliesConstraint(diagnostics, context);
	}

	/**
	 * Validates the SourceMustBeSoftwareComponent constraint of '<em>Tosca nodes compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_compute_SourceMustBeSoftwareComponent(Tosca_nodes_compute tosca_nodes_compute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_compute.SourceMustBeSoftwareComponent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_loadbalancer(Tosca_nodes_loadbalancer tosca_nodes_loadbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_loadbalancer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_root_appliesConstraint(tosca_nodes_loadbalancer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webserver(Tosca_nodes_webserver tosca_nodes_webserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webserver, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_webserver, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_webserver_SourceMustBeWebApplication(tosca_nodes_webserver, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeWebApplication constraint of '<em>Tosca nodes webserver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webserver_SourceMustBeWebApplication(Tosca_nodes_webserver tosca_nodes_webserver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_webserver.SourceMustBeWebApplication(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_database(Tosca_nodes_database tosca_nodes_database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_database, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_database, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_database_appliesConstraint(tosca_nodes_database, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_database_appliesConstraint(Tosca_nodes_database tosca_nodes_database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_database.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_container_application(Tosca_nodes_container_application tosca_nodes_container_application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_container_application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_container_application, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_container_application_appliesConstraint(tosca_nodes_container_application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes container application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_container_application_appliesConstraint(Tosca_nodes_container_application tosca_nodes_container_application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_container_application.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_container_runtime(Tosca_nodes_container_runtime tosca_nodes_container_runtime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_container_runtime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_container_runtime, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_container_runtime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_blockstorage(Tosca_nodes_blockstorage tosca_nodes_blockstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_blockstorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_blockstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_blockstorage_appliesConstraint(tosca_nodes_blockstorage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca nodes blockstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_blockstorage_appliesConstraint(Tosca_nodes_blockstorage tosca_nodes_blockstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_nodes_blockstorage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_policies_root(Tosca_policies_root tosca_policies_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_policies_root, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_policies_root, diagnostics, context);
		if (result || diagnostics != null) result &= slaValidator.validateAgreement_term_appliesConstraint(tosca_policies_root, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_policies_update(Tosca_policies_update tosca_policies_update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_policies_update, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_policies_update, diagnostics, context);
		if (result || diagnostics != null) result &= slaValidator.validateAgreement_term_appliesConstraint(tosca_policies_update, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_policies_placement(Tosca_policies_placement tosca_policies_placement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_policies_placement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_policies_placement, diagnostics, context);
		if (result || diagnostics != null) result &= slaValidator.validateAgreement_term_appliesConstraint(tosca_policies_placement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_policies_scaling(Tosca_policies_scaling tosca_policies_scaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_policies_scaling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_policies_scaling, diagnostics, context);
		if (result || diagnostics != null) result &= slaValidator.validateAgreement_term_appliesConstraint(tosca_policies_scaling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_policies_performance(Tosca_policies_performance tosca_policies_performance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_policies_performance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_policies_performance, diagnostics, context);
		if (result || diagnostics != null) result &= slaValidator.validateAgreement_term_appliesConstraint(tosca_policies_performance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_groups_root(Tosca_groups_root tosca_groups_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_groups_root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_interfaces_root(Tosca_interfaces_root tosca_interfaces_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_interfaces_root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_interfaces_relationship_configure(Tosca_interfaces_relationship_configure tosca_interfaces_relationship_configure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_interfaces_relationship_configure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_interfaces_node_lifecycle_standard(Tosca_interfaces_node_lifecycle_standard tosca_interfaces_node_lifecycle_standard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_interfaces_node_lifecycle_standard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_root(Tosca_relationships_root tosca_relationships_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_root, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_root, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_root, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca relationships root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_root_appliesConstraint(Tosca_relationships_root tosca_relationships_root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_root.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_connectsto(Tosca_relationships_connectsto tosca_relationships_connectsto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_connectsto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_connectsto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_connectsto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_routesto(Tosca_relationships_routesto tosca_relationships_routesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_routesto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_routesto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_routesto_SourceMustBeLoadBalancer(tosca_relationships_routesto, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeLoadBalancer constraint of '<em>Tosca relationships routesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_routesto_SourceMustBeLoadBalancer(Tosca_relationships_routesto tosca_relationships_routesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_routesto.SourceMustBeLoadBalancer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_attachesto(Tosca_relationships_attachesto tosca_relationships_attachesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_attachesto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_attachesto_appliesConstraint(tosca_relationships_attachesto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_attachesto_SourceMustBeComputeAndTargetMustBeBlockStorage(tosca_relationships_attachesto, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeComputeAndTargetMustBeBlockStorage constraint of '<em>Tosca relationships attachesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_attachesto_SourceMustBeComputeAndTargetMustBeBlockStorage(Tosca_relationships_attachesto tosca_relationships_attachesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_attachesto.SourceMustBeComputeAndTargetMustBeBlockStorage(diagnostics, context);
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Tosca relationships attachesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_attachesto_appliesConstraint(Tosca_relationships_attachesto tosca_relationships_attachesto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_attachesto.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_hostedon(Tosca_relationships_hostedon tosca_relationships_hostedon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_hostedon, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_hostedon_SourceMustBeDatabaseAndTargetMustBeDBMS(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_hostedon_SourceMustBeWebServerAndTargetMustBeWebApplication(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_hostedon_SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(tosca_relationships_hostedon, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_hostedon_SourceMustBeSoftwareComponentAndTargetMustBeCompute(tosca_relationships_hostedon, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeDatabaseAndTargetMustBeDBMS constraint of '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_hostedon_SourceMustBeDatabaseAndTargetMustBeDBMS(Tosca_relationships_hostedon tosca_relationships_hostedon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_hostedon.SourceMustBeDatabaseAndTargetMustBeDBMS(diagnostics, context);
	}

	/**
	 * Validates the SourceMustBeWebServerAndTargetMustBeWebApplication constraint of '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_hostedon_SourceMustBeWebServerAndTargetMustBeWebApplication(Tosca_relationships_hostedon tosca_relationships_hostedon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_hostedon.SourceMustBeWebServerAndTargetMustBeWebApplication(diagnostics, context);
	}

	/**
	 * Validates the SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime constraint of '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_hostedon_SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(Tosca_relationships_hostedon tosca_relationships_hostedon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_hostedon.SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(diagnostics, context);
	}

	/**
	 * Validates the SourceMustBeSoftwareComponentAndTargetMustBeCompute constraint of '<em>Tosca relationships hostedon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_hostedon_SourceMustBeSoftwareComponentAndTargetMustBeCompute(Tosca_relationships_hostedon tosca_relationships_hostedon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_hostedon.SourceMustBeSoftwareComponentAndTargetMustBeCompute(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_dependson(Tosca_relationships_dependson tosca_relationships_dependson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_dependson, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_dependson, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_dependson_SourceMustBeNodeAndTargetMustBeNode(tosca_relationships_dependson, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SourceMustBeNodeAndTargetMustBeNode constraint of '<em>Tosca relationships dependson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_dependson_SourceMustBeNodeAndTargetMustBeNode(Tosca_relationships_dependson tosca_relationships_dependson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tosca_relationships_dependson.SourceMustBeNodeAndTargetMustBeNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_indigo_endpoint(Tosca_capabilities_indigo_endpoint tosca_capabilities_indigo_endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_indigo_endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_somecap(Tosca_capabilities_somecap tosca_capabilities_somecap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_somecap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_ha(Tosca_capabilities_ha tosca_capabilities_ha, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_ha, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_containerchild(Tosca_capabilities_containerchild tosca_capabilities_containerchild, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_containerchild, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_somechildcap(Tosca_capabilities_somechildcap tosca_capabilities_somechildcap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_somechildcap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_database_mysql(Tosca_nodes_database_mysql tosca_nodes_database_mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_database_mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_database_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_database_appliesConstraint(tosca_nodes_database_mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithprop(Tosca_nodes_computewithprop tosca_nodes_computewithprop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithprop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithprop, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithprop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_elasticsearch(Tosca_nodes_softwarecomponent_elasticsearch tosca_nodes_softwarecomponent_elasticsearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_elasticsearch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_databasewithlistparam(Tosca_nodes_databasewithlistparam tosca_nodes_databasewithlistparam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_databasewithlistparam, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_databasewithlistparam, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_database_appliesConstraint(tosca_nodes_databasewithlistparam, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webapplication_paypalpizzastore(Tosca_nodes_webapplication_paypalpizzastore tosca_nodes_webapplication_paypalpizzastore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_webapplication_appliesConstraint(tosca_nodes_webapplication_paypalpizzastore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webapplication_wordpress(Tosca_nodes_webapplication_wordpress tosca_nodes_webapplication_wordpress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webapplication_wordpress, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webapplication_wordpress, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_webapplication_appliesConstraint(tosca_nodes_webapplication_wordpress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_nodewithcap(Tosca_nodes_nodewithcap tosca_nodes_nodewithcap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_nodewithcap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_nodewithcap, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_root_appliesConstraint(tosca_nodes_nodewithcap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_container_application_docker(Tosca_nodes_container_application_docker tosca_nodes_container_application_docker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_container_application_docker, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_container_application_docker, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_container_application_appliesConstraint(tosca_nodes_container_application_docker, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_kibana(Tosca_nodes_softwarecomponent_kibana tosca_nodes_softwarecomponent_kibana, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_kibana, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_kibana, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRsyslog(Rsyslog rsyslog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rsyslog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(rsyslog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithattrlist(Tosca_nodes_computewithattrlist tosca_nodes_computewithattrlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithattrlist, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithattrlist, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithattrlist, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_logstash(Tosca_nodes_softwarecomponent_logstash tosca_nodes_softwarecomponent_logstash, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_logstash, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_logstash, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_collectd(Tosca_nodes_softwarecomponent_collectd tosca_nodes_softwarecomponent_collectd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_collectd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_collectd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_computewithcapwithattr(Tosca_nodes_computewithcapwithattr tosca_nodes_computewithcapwithattr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_computewithcapwithattr, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_appliesConstraint(tosca_nodes_computewithcapwithattr, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_computewithcapwithattr, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_nodewithreq(Tosca_nodes_nodewithreq tosca_nodes_nodewithreq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_nodewithreq, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_nodewithreq, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_nodewithreq, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_softwarecomponent_rsyslog(Tosca_nodes_softwarecomponent_rsyslog tosca_nodes_softwarecomponent_rsyslog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_softwarecomponent_rsyslog, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_hacompute(Tosca_nodes_hacompute tosca_nodes_hacompute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_hacompute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_appliesConstraint(tosca_nodes_hacompute, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_compute_SourceMustBeSoftwareComponent(tosca_nodes_hacompute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_somenode(Tosca_nodes_somenode tosca_nodes_somenode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_somenode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_somenode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_root_appliesConstraint(tosca_nodes_somenode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_capabilities_container_docker(Tosca_capabilities_container_docker tosca_capabilities_container_docker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tosca_capabilities_container_docker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_webserver_nodejs(Tosca_nodes_webserver_nodejs tosca_nodes_webserver_nodejs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_webserver_nodejs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_webserver_nodejs, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_webserver_SourceMustBeWebApplication(tosca_nodes_webserver_nodejs, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_somenode2(Tosca_nodes_somenode2 tosca_nodes_somenode2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_somenode2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_somenode2, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_root_appliesConstraint(tosca_nodes_somenode2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_nodes_dbms_mysql(Tosca_nodes_dbms_mysql tosca_nodes_dbms_mysql, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_nodes_dbms_mysql, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_softwarecomponent_appliesConstraint(tosca_nodes_dbms_mysql, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_nodes_dbms_SourceMustBeDatabase(tosca_nodes_dbms_mysql, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMycompany_mytypes_myscalingpolicy(Mycompany_mytypes_myscalingpolicy mycompany_mytypes_myscalingpolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mycompany_mytypes_myscalingpolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTosca_relationships_ha(Tosca_relationships_ha tosca_relationships_ha, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tosca_relationships_ha, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tosca_relationships_ha, diagnostics, context);
		if (result || diagnostics != null) result &= validateTosca_relationships_root_appliesConstraint(tosca_relationships_ha, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest_relation_connects(Test_relation_connects test_relation_connects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(test_relation_connects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateprotocolEnum(protocolEnum protocolEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateinitiatorEnum(initiatorEnum initiatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestring(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestringMinOne(String stringMinOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatestringMinOne_MinLength(stringMinOne, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>string Min One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestringMinOne_MinLength(String stringMinOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringMinOne.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ExtendedtoscaPackage.Literals.STRING_MIN_ONE, stringMinOne, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateboolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatebyte(Byte byte_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatefloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateinteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateintegerMinOne(Integer integerMinOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateshort(Short short_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatemap(Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateversion(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateversion_Pattern(version, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateversion_Pattern
	 */
	public static final  PatternMatcher [][] VERSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((\\d+)((\\.\\d+)+)?)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateversion_Pattern(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ExtendedtoscaPackage.Literals.VERSION, version, VERSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validaterange(Short range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetoscadatatypesnetworkPortDef(Short toscadatatypesnetworkPortDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatescalarFrequency(Double scalarFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatescalarSizeMinOneMB(Integer scalarSizeMinOneMB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatescalarSizeMinZeroGB(Integer scalarSizeMinZeroGB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatescalarSizeMinZeroMB(Integer scalarSizeMinZeroMB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ExtendedtoscaValidator

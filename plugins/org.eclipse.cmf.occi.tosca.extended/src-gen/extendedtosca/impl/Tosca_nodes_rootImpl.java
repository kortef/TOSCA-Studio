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
package extendedtosca.impl;

import extendedtosca.ExtendedtoscaPackage;
import extendedtosca.ExtendedtoscaTables;
import extendedtosca.Tosca_interfaces_node_lifecycle_standard;
import extendedtosca.Tosca_interfaces_root;
import extendedtosca.Tosca_nodes_root;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Tosca_nodes_rootImpl extends Tosca_capabilities_nodeImpl implements Tosca_nodes_root {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_rootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedtoscaPackage.Literals.TOSCA_NODES_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Tosca_nodes_root::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(occi::Resource)
		 *       in
		 *         'Tosca_nodes_root::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ExtendedtoscaTables.STR_Tosca_nodes_root_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ExtendedtoscaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(ExtendedtoscaTables.CLSSid_Resource, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ExtendedtoscaTables.STR_Tosca_nodes_root_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ExtendedtoscaTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_node_lifecycle_standard!create()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void configure() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_node_lifecycle_standard!configure()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occi/tosca/ecore!Tosca_interfaces_node_lifecycle_standard!delete()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Tosca_interfaces_root.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Tosca_interfaces_node_lifecycle_standard.class) {
			switch (baseOperationID) {
				case ExtendedtoscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE: return ExtendedtoscaPackage.TOSCA_NODES_ROOT___CREATE;
				case ExtendedtoscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE: return ExtendedtoscaPackage.TOSCA_NODES_ROOT___CONFIGURE;
				case ExtendedtoscaPackage.TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE: return ExtendedtoscaPackage.TOSCA_NODES_ROOT___DELETE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT___CREATE:
				create();
				return null;
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT___CONFIGURE:
				configure();
				return null;
			case ExtendedtoscaPackage.TOSCA_NODES_ROOT___DELETE:
				delete();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Tosca_nodes_rootImpl

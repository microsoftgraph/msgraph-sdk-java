// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.models.WorkbookFunctionResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WorkbookFunctionsDeltaParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAbsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAccrIntParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAccrIntMParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAcosParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAcoshParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAcotParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAcothParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAmorDegrcParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAmorLincParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAndParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsArabicParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAreasParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAsinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAsinhParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAtanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAtan2ParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAtanhParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAveDevParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAverageParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAverageAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAverageIfParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsAverageIfsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBahtTextParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBaseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBesselIParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBesselJParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBesselKParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBesselYParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBeta_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBeta_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBin2DecParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBin2HexParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBin2OctParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBinom_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBinom_Dist_RangeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBinom_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBitandParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBitlshiftParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBitorParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBitrshiftParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsBitxorParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCeiling_MathParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCeiling_PreciseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCharParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsChiSq_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsChiSq_Dist_RTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsChiSq_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsChiSq_Inv_RTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsChooseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCleanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCodeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsColumnsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCombinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCombinaParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsComplexParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsConcatenateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsConfidence_NormParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsConfidence_TParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsConvertParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCosParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoshParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCotParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCothParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCountParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCountAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCountBlankParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCountIfParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCountIfsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupDayBsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupDaysParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupDaysNcParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupNcdParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupNumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCoupPcdParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCschParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCumIPmtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsCumPrincParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDatevalueParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDaverageParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDayParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDaysParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDays360ParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDbcsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDcountParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDcountAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDdbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDec2BinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDec2HexParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDec2OctParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDecimalParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDegreesParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDevSqParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDgetParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDiscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDmaxParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDminParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDollarParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDollarDeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDollarFrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDproductParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDstDevParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDstDevPParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDsumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDurationParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDvarParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsDvarPParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsEcma_CeilingParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsEdateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsEffectParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsEoMonthParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsErfParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsErfCParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsErfC_PreciseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsErf_PreciseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsError_TypeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsEvenParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsExactParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsExpParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsExpon_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFactParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFactDoubleParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFindParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFindBParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFisherParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFisherInvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFixedParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFloor_MathParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFloor_PreciseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsFvscheduleParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsF_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsF_Dist_RTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsF_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsF_Inv_RTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGammaParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGammaLnParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGammaLn_PreciseParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGamma_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGamma_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGaussParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGcdParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGeoMeanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsGeStepParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHarMeanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHex2BinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHex2DecParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHex2OctParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHlookupParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHourParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHyperlinkParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsHypGeom_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIfParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImAbsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImaginaryParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImArgumentParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImConjugateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImCosParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImCoshParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImCotParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImCscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImCschParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImDivParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImExpParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImLnParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImLog10ParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImLog2ParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImPowerParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImProductParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImRealParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSecParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSechParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSinhParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSqrtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSubParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImSumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsImTanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIntParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIntRateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIpmtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIrrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsErrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsErrorParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsEvenParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsFormulaParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsLogicalParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsNAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsNonTextParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsNumberParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsOddParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsoWeekNumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIso_CeilingParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIspmtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsrefParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsIsTextParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsKurtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLargeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLcmParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLeftParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLeftbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLenParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLenbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLnParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLogParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLog10ParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLogNorm_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLogNorm_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLookupParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsLowerParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMatchParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMaxParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMaxAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMdurationParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMedianParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMidParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMidbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMinAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMinuteParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMirrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsModParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMonthParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMroundParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsMultiNomialParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNegBinom_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNetworkDaysParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNetworkDays_IntlParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNominalParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNorm_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNorm_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNorm_S_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNorm_S_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNotParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNperParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNpvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsNumberValueParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOct2BinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOct2DecParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOct2HexParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOddParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOddFPriceParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOddFYieldParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOddLPriceParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOddLYieldParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsOrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPdurationParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPercentile_ExcParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPercentile_IncParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPercentRank_ExcParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPercentRank_IncParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPermutParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPermutationaParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPhiParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPmtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPoisson_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPowerParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPpmtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPriceParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPriceDiscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPriceMatParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsProductParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsProperParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsPvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsQuartile_ExcParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsQuartile_IncParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsQuotientParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRadiansParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRandBetweenParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRank_AvgParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRank_EqParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRateParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsReceivedParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsReplaceParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsReplaceBParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsReptParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRightParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRightbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRomanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRoundParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRoundDownParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRoundUpParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRowsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsRriParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSecParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSechParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSecondParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSeriesSumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSheetParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSheetsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSignParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSinParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSinhParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSkewParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSkew_pParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSlnParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSmallParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSqrtParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSqrtPiParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsStandardizeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsStDevAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsStDevPAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsStDev_PParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsStDev_SParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSubstituteParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSubtotalParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSumIfParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSumIfsParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSumSqParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsSydParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTanhParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTbillEqParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTbillPriceParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTbillYieldParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTextParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTimeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTimevalueParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTrimParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTrimMeanParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTruncParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsTypeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsT_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsT_Dist_2TParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsT_Dist_RTParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsT_InvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsT_Inv_2TParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsUnicharParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsUnicodeParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsUpperParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsUsdollarParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsValueParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVarAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVarPAParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVar_PParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVar_SParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVdbParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsVlookupParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsWeekdayParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsWeekNumParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsWeibull_DistParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsWorkDayParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsWorkDay_IntlParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsXirrParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsXnpvParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsXorParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsYearParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsYearFracParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsYieldParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsYieldDiscParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsYieldMatParameterSet;
import com.microsoft.graph.models.WorkbookFunctionsZ_TestParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Request Builder.
 */
public class WorkbookFunctionsRequestBuilder extends BaseRequestBuilder<WorkbookFunctions> {

    /**
     * The request builder for the WorkbookFunctions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookFunctionsRequest instance
     */
    @Nonnull
    public WorkbookFunctionsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookFunctionsRequest instance
     */
    @Nonnull
    public WorkbookFunctionsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WorkbookFunctionsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDeltaRequestBuilder delta(@Nonnull final WorkbookFunctionsDeltaParameterSet parameters) {
        return new WorkbookFunctionsDeltaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAbsRequestBuilder abs(@Nonnull final WorkbookFunctionsAbsParameterSet parameters) {
        return new WorkbookFunctionsAbsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.abs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAccrIntRequestBuilder accrInt(@Nonnull final WorkbookFunctionsAccrIntParameterSet parameters) {
        return new WorkbookFunctionsAccrIntRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accrInt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAccrIntMRequestBuilder accrIntM(@Nonnull final WorkbookFunctionsAccrIntMParameterSet parameters) {
        return new WorkbookFunctionsAccrIntMRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accrIntM"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcosRequestBuilder acos(@Nonnull final WorkbookFunctionsAcosParameterSet parameters) {
        return new WorkbookFunctionsAcosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcoshRequestBuilder acosh(@Nonnull final WorkbookFunctionsAcoshParameterSet parameters) {
        return new WorkbookFunctionsAcoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcotRequestBuilder acot(@Nonnull final WorkbookFunctionsAcotParameterSet parameters) {
        return new WorkbookFunctionsAcotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcothRequestBuilder acoth(@Nonnull final WorkbookFunctionsAcothParameterSet parameters) {
        return new WorkbookFunctionsAcothRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acoth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAmorDegrcRequestBuilder amorDegrc(@Nonnull final WorkbookFunctionsAmorDegrcParameterSet parameters) {
        return new WorkbookFunctionsAmorDegrcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.amorDegrc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAmorLincRequestBuilder amorLinc(@Nonnull final WorkbookFunctionsAmorLincParameterSet parameters) {
        return new WorkbookFunctionsAmorLincRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.amorLinc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAndRequestBuilder and(@Nonnull final WorkbookFunctionsAndParameterSet parameters) {
        return new WorkbookFunctionsAndRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.and"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsArabicRequestBuilder arabic(@Nonnull final WorkbookFunctionsArabicParameterSet parameters) {
        return new WorkbookFunctionsArabicRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.arabic"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAreasRequestBuilder areas(@Nonnull final WorkbookFunctionsAreasParameterSet parameters) {
        return new WorkbookFunctionsAreasRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.areas"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAscRequestBuilder asc(@Nonnull final WorkbookFunctionsAscParameterSet parameters) {
        return new WorkbookFunctionsAscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAsinRequestBuilder asin(@Nonnull final WorkbookFunctionsAsinParameterSet parameters) {
        return new WorkbookFunctionsAsinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAsinhRequestBuilder asinh(@Nonnull final WorkbookFunctionsAsinhParameterSet parameters) {
        return new WorkbookFunctionsAsinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtanRequestBuilder atan(@Nonnull final WorkbookFunctionsAtanParameterSet parameters) {
        return new WorkbookFunctionsAtanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtan2RequestBuilder atan2(@Nonnull final WorkbookFunctionsAtan2ParameterSet parameters) {
        return new WorkbookFunctionsAtan2RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atan2"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtanhRequestBuilder atanh(@Nonnull final WorkbookFunctionsAtanhParameterSet parameters) {
        return new WorkbookFunctionsAtanhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atanh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAveDevRequestBuilder aveDev(@Nonnull final WorkbookFunctionsAveDevParameterSet parameters) {
        return new WorkbookFunctionsAveDevRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.aveDev"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageRequestBuilder average(@Nonnull final WorkbookFunctionsAverageParameterSet parameters) {
        return new WorkbookFunctionsAverageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.average"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageARequestBuilder averageA(@Nonnull final WorkbookFunctionsAverageAParameterSet parameters) {
        return new WorkbookFunctionsAverageARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageIfRequestBuilder averageIf(@Nonnull final WorkbookFunctionsAverageIfParameterSet parameters) {
        return new WorkbookFunctionsAverageIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageIfsRequestBuilder averageIfs(@Nonnull final WorkbookFunctionsAverageIfsParameterSet parameters) {
        return new WorkbookFunctionsAverageIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBahtTextRequestBuilder bahtText(@Nonnull final WorkbookFunctionsBahtTextParameterSet parameters) {
        return new WorkbookFunctionsBahtTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bahtText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBaseRequestBuilder base(@Nonnull final WorkbookFunctionsBaseParameterSet parameters) {
        return new WorkbookFunctionsBaseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.base"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselIRequestBuilder besselI(@Nonnull final WorkbookFunctionsBesselIParameterSet parameters) {
        return new WorkbookFunctionsBesselIRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselI"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselJRequestBuilder besselJ(@Nonnull final WorkbookFunctionsBesselJParameterSet parameters) {
        return new WorkbookFunctionsBesselJRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselJ"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselKRequestBuilder besselK(@Nonnull final WorkbookFunctionsBesselKParameterSet parameters) {
        return new WorkbookFunctionsBesselKRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselK"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselYRequestBuilder besselY(@Nonnull final WorkbookFunctionsBesselYParameterSet parameters) {
        return new WorkbookFunctionsBesselYRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselY"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBeta_DistRequestBuilder beta_Dist(@Nonnull final WorkbookFunctionsBeta_DistParameterSet parameters) {
        return new WorkbookFunctionsBeta_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.beta_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBeta_InvRequestBuilder beta_Inv(@Nonnull final WorkbookFunctionsBeta_InvParameterSet parameters) {
        return new WorkbookFunctionsBeta_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.beta_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2DecRequestBuilder bin2Dec(@Nonnull final WorkbookFunctionsBin2DecParameterSet parameters) {
        return new WorkbookFunctionsBin2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2HexRequestBuilder bin2Hex(@Nonnull final WorkbookFunctionsBin2HexParameterSet parameters) {
        return new WorkbookFunctionsBin2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2OctRequestBuilder bin2Oct(@Nonnull final WorkbookFunctionsBin2OctParameterSet parameters) {
        return new WorkbookFunctionsBin2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_DistRequestBuilder binom_Dist(@Nonnull final WorkbookFunctionsBinom_DistParameterSet parameters) {
        return new WorkbookFunctionsBinom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_Dist_RangeRequestBuilder binom_Dist_Range(@Nonnull final WorkbookFunctionsBinom_Dist_RangeParameterSet parameters) {
        return new WorkbookFunctionsBinom_Dist_RangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Dist_Range"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_InvRequestBuilder binom_Inv(@Nonnull final WorkbookFunctionsBinom_InvParameterSet parameters) {
        return new WorkbookFunctionsBinom_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitandRequestBuilder bitand(@Nonnull final WorkbookFunctionsBitandParameterSet parameters) {
        return new WorkbookFunctionsBitandRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitand"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitlshiftRequestBuilder bitlshift(@Nonnull final WorkbookFunctionsBitlshiftParameterSet parameters) {
        return new WorkbookFunctionsBitlshiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitlshift"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitorRequestBuilder bitor(@Nonnull final WorkbookFunctionsBitorParameterSet parameters) {
        return new WorkbookFunctionsBitorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitrshiftRequestBuilder bitrshift(@Nonnull final WorkbookFunctionsBitrshiftParameterSet parameters) {
        return new WorkbookFunctionsBitrshiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitrshift"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitxorRequestBuilder bitxor(@Nonnull final WorkbookFunctionsBitxorParameterSet parameters) {
        return new WorkbookFunctionsBitxorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitxor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCeiling_MathRequestBuilder ceiling_Math(@Nonnull final WorkbookFunctionsCeiling_MathParameterSet parameters) {
        return new WorkbookFunctionsCeiling_MathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ceiling_Math"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCeiling_PreciseRequestBuilder ceiling_Precise(@Nonnull final WorkbookFunctionsCeiling_PreciseParameterSet parameters) {
        return new WorkbookFunctionsCeiling_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ceiling_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCharRequestBuilder msgraphChar(@Nonnull final WorkbookFunctionsCharParameterSet parameters) {
        return new WorkbookFunctionsCharRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.char"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_DistRequestBuilder chiSq_Dist(@Nonnull final WorkbookFunctionsChiSq_DistParameterSet parameters) {
        return new WorkbookFunctionsChiSq_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_Dist_RTRequestBuilder chiSq_Dist_RT(@Nonnull final WorkbookFunctionsChiSq_Dist_RTParameterSet parameters) {
        return new WorkbookFunctionsChiSq_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_InvRequestBuilder chiSq_Inv(@Nonnull final WorkbookFunctionsChiSq_InvParameterSet parameters) {
        return new WorkbookFunctionsChiSq_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_Inv_RTRequestBuilder chiSq_Inv_RT(@Nonnull final WorkbookFunctionsChiSq_Inv_RTParameterSet parameters) {
        return new WorkbookFunctionsChiSq_Inv_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Inv_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChooseRequestBuilder choose(@Nonnull final WorkbookFunctionsChooseParameterSet parameters) {
        return new WorkbookFunctionsChooseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.choose"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCleanRequestBuilder clean(@Nonnull final WorkbookFunctionsCleanParameterSet parameters) {
        return new WorkbookFunctionsCleanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCodeRequestBuilder code(@Nonnull final WorkbookFunctionsCodeParameterSet parameters) {
        return new WorkbookFunctionsCodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.code"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsColumnsRequestBuilder columns(@Nonnull final WorkbookFunctionsColumnsParameterSet parameters) {
        return new WorkbookFunctionsColumnsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columns"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCombinRequestBuilder combin(@Nonnull final WorkbookFunctionsCombinParameterSet parameters) {
        return new WorkbookFunctionsCombinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.combin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCombinaRequestBuilder combina(@Nonnull final WorkbookFunctionsCombinaParameterSet parameters) {
        return new WorkbookFunctionsCombinaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.combina"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsComplexRequestBuilder complex(@Nonnull final WorkbookFunctionsComplexParameterSet parameters) {
        return new WorkbookFunctionsComplexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.complex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConcatenateRequestBuilder concatenate(@Nonnull final WorkbookFunctionsConcatenateParameterSet parameters) {
        return new WorkbookFunctionsConcatenateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.concatenate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConfidence_NormRequestBuilder confidence_Norm(@Nonnull final WorkbookFunctionsConfidence_NormParameterSet parameters) {
        return new WorkbookFunctionsConfidence_NormRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confidence_Norm"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConfidence_TRequestBuilder confidence_T(@Nonnull final WorkbookFunctionsConfidence_TParameterSet parameters) {
        return new WorkbookFunctionsConfidence_TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confidence_T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConvertRequestBuilder convert(@Nonnull final WorkbookFunctionsConvertParameterSet parameters) {
        return new WorkbookFunctionsConvertRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.convert"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCosRequestBuilder cos(@Nonnull final WorkbookFunctionsCosParameterSet parameters) {
        return new WorkbookFunctionsCosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoshRequestBuilder cosh(@Nonnull final WorkbookFunctionsCoshParameterSet parameters) {
        return new WorkbookFunctionsCoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCotRequestBuilder cot(@Nonnull final WorkbookFunctionsCotParameterSet parameters) {
        return new WorkbookFunctionsCotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCothRequestBuilder coth(@Nonnull final WorkbookFunctionsCothParameterSet parameters) {
        return new WorkbookFunctionsCothRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountRequestBuilder count(@Nonnull final WorkbookFunctionsCountParameterSet parameters) {
        return new WorkbookFunctionsCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountARequestBuilder countA(@Nonnull final WorkbookFunctionsCountAParameterSet parameters) {
        return new WorkbookFunctionsCountARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountBlankRequestBuilder countBlank(@Nonnull final WorkbookFunctionsCountBlankParameterSet parameters) {
        return new WorkbookFunctionsCountBlankRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countBlank"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountIfRequestBuilder countIf(@Nonnull final WorkbookFunctionsCountIfParameterSet parameters) {
        return new WorkbookFunctionsCountIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountIfsRequestBuilder countIfs(@Nonnull final WorkbookFunctionsCountIfsParameterSet parameters) {
        return new WorkbookFunctionsCountIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDayBsRequestBuilder coupDayBs(@Nonnull final WorkbookFunctionsCoupDayBsParameterSet parameters) {
        return new WorkbookFunctionsCoupDayBsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDayBs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDaysRequestBuilder coupDays(@Nonnull final WorkbookFunctionsCoupDaysParameterSet parameters) {
        return new WorkbookFunctionsCoupDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDays"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDaysNcRequestBuilder coupDaysNc(@Nonnull final WorkbookFunctionsCoupDaysNcParameterSet parameters) {
        return new WorkbookFunctionsCoupDaysNcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDaysNc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupNcdRequestBuilder coupNcd(@Nonnull final WorkbookFunctionsCoupNcdParameterSet parameters) {
        return new WorkbookFunctionsCoupNcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupNcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupNumRequestBuilder coupNum(@Nonnull final WorkbookFunctionsCoupNumParameterSet parameters) {
        return new WorkbookFunctionsCoupNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupPcdRequestBuilder coupPcd(@Nonnull final WorkbookFunctionsCoupPcdParameterSet parameters) {
        return new WorkbookFunctionsCoupPcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupPcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCscRequestBuilder csc(@Nonnull final WorkbookFunctionsCscParameterSet parameters) {
        return new WorkbookFunctionsCscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.csc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCschRequestBuilder csch(@Nonnull final WorkbookFunctionsCschParameterSet parameters) {
        return new WorkbookFunctionsCschRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.csch"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCumIPmtRequestBuilder cumIPmt(@Nonnull final WorkbookFunctionsCumIPmtParameterSet parameters) {
        return new WorkbookFunctionsCumIPmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cumIPmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCumPrincRequestBuilder cumPrinc(@Nonnull final WorkbookFunctionsCumPrincParameterSet parameters) {
        return new WorkbookFunctionsCumPrincRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cumPrinc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDateRequestBuilder date(@Nonnull final WorkbookFunctionsDateParameterSet parameters) {
        return new WorkbookFunctionsDateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.date"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDatevalueRequestBuilder datevalue(@Nonnull final WorkbookFunctionsDatevalueParameterSet parameters) {
        return new WorkbookFunctionsDatevalueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.datevalue"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDaverageRequestBuilder daverage(@Nonnull final WorkbookFunctionsDaverageParameterSet parameters) {
        return new WorkbookFunctionsDaverageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.daverage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDayRequestBuilder day(@Nonnull final WorkbookFunctionsDayParameterSet parameters) {
        return new WorkbookFunctionsDayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.day"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDaysRequestBuilder days(@Nonnull final WorkbookFunctionsDaysParameterSet parameters) {
        return new WorkbookFunctionsDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.days"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDays360RequestBuilder days360(@Nonnull final WorkbookFunctionsDays360ParameterSet parameters) {
        return new WorkbookFunctionsDays360RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.days360"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDbRequestBuilder db(@Nonnull final WorkbookFunctionsDbParameterSet parameters) {
        return new WorkbookFunctionsDbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.db"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDbcsRequestBuilder dbcs(@Nonnull final WorkbookFunctionsDbcsParameterSet parameters) {
        return new WorkbookFunctionsDbcsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dbcs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDcountRequestBuilder dcount(@Nonnull final WorkbookFunctionsDcountParameterSet parameters) {
        return new WorkbookFunctionsDcountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dcount"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDcountARequestBuilder dcountA(@Nonnull final WorkbookFunctionsDcountAParameterSet parameters) {
        return new WorkbookFunctionsDcountARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dcountA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDdbRequestBuilder ddb(@Nonnull final WorkbookFunctionsDdbParameterSet parameters) {
        return new WorkbookFunctionsDdbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ddb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2BinRequestBuilder dec2Bin(@Nonnull final WorkbookFunctionsDec2BinParameterSet parameters) {
        return new WorkbookFunctionsDec2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2HexRequestBuilder dec2Hex(@Nonnull final WorkbookFunctionsDec2HexParameterSet parameters) {
        return new WorkbookFunctionsDec2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2OctRequestBuilder dec2Oct(@Nonnull final WorkbookFunctionsDec2OctParameterSet parameters) {
        return new WorkbookFunctionsDec2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDecimalRequestBuilder decimal(@Nonnull final WorkbookFunctionsDecimalParameterSet parameters) {
        return new WorkbookFunctionsDecimalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.decimal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDegreesRequestBuilder degrees(@Nonnull final WorkbookFunctionsDegreesParameterSet parameters) {
        return new WorkbookFunctionsDegreesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.degrees"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDevSqRequestBuilder devSq(@Nonnull final WorkbookFunctionsDevSqParameterSet parameters) {
        return new WorkbookFunctionsDevSqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.devSq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDgetRequestBuilder dget(@Nonnull final WorkbookFunctionsDgetParameterSet parameters) {
        return new WorkbookFunctionsDgetRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dget"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDiscRequestBuilder disc(@Nonnull final WorkbookFunctionsDiscParameterSet parameters) {
        return new WorkbookFunctionsDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDmaxRequestBuilder dmax(@Nonnull final WorkbookFunctionsDmaxParameterSet parameters) {
        return new WorkbookFunctionsDmaxRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dmax"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDminRequestBuilder dmin(@Nonnull final WorkbookFunctionsDminParameterSet parameters) {
        return new WorkbookFunctionsDminRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dmin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarRequestBuilder dollar(@Nonnull final WorkbookFunctionsDollarParameterSet parameters) {
        return new WorkbookFunctionsDollarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarDeRequestBuilder dollarDe(@Nonnull final WorkbookFunctionsDollarDeParameterSet parameters) {
        return new WorkbookFunctionsDollarDeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollarDe"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarFrRequestBuilder dollarFr(@Nonnull final WorkbookFunctionsDollarFrParameterSet parameters) {
        return new WorkbookFunctionsDollarFrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollarFr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDproductRequestBuilder dproduct(@Nonnull final WorkbookFunctionsDproductParameterSet parameters) {
        return new WorkbookFunctionsDproductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dproduct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDstDevRequestBuilder dstDev(@Nonnull final WorkbookFunctionsDstDevParameterSet parameters) {
        return new WorkbookFunctionsDstDevRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dstDev"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDstDevPRequestBuilder dstDevP(@Nonnull final WorkbookFunctionsDstDevPParameterSet parameters) {
        return new WorkbookFunctionsDstDevPRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dstDevP"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDsumRequestBuilder dsum(@Nonnull final WorkbookFunctionsDsumParameterSet parameters) {
        return new WorkbookFunctionsDsumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dsum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDurationRequestBuilder duration(@Nonnull final WorkbookFunctionsDurationParameterSet parameters) {
        return new WorkbookFunctionsDurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.duration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDvarRequestBuilder dvar(@Nonnull final WorkbookFunctionsDvarParameterSet parameters) {
        return new WorkbookFunctionsDvarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dvar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDvarPRequestBuilder dvarP(@Nonnull final WorkbookFunctionsDvarPParameterSet parameters) {
        return new WorkbookFunctionsDvarPRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dvarP"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEcma_CeilingRequestBuilder ecma_Ceiling(@Nonnull final WorkbookFunctionsEcma_CeilingParameterSet parameters) {
        return new WorkbookFunctionsEcma_CeilingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ecma_Ceiling"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEdateRequestBuilder edate(@Nonnull final WorkbookFunctionsEdateParameterSet parameters) {
        return new WorkbookFunctionsEdateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.edate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEffectRequestBuilder effect(@Nonnull final WorkbookFunctionsEffectParameterSet parameters) {
        return new WorkbookFunctionsEffectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.effect"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEoMonthRequestBuilder eoMonth(@Nonnull final WorkbookFunctionsEoMonthParameterSet parameters) {
        return new WorkbookFunctionsEoMonthRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.eoMonth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfRequestBuilder erf(@Nonnull final WorkbookFunctionsErfParameterSet parameters) {
        return new WorkbookFunctionsErfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfCRequestBuilder erfC(@Nonnull final WorkbookFunctionsErfCParameterSet parameters) {
        return new WorkbookFunctionsErfCRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erfC"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfC_PreciseRequestBuilder erfC_Precise(@Nonnull final WorkbookFunctionsErfC_PreciseParameterSet parameters) {
        return new WorkbookFunctionsErfC_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erfC_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErf_PreciseRequestBuilder erf_Precise(@Nonnull final WorkbookFunctionsErf_PreciseParameterSet parameters) {
        return new WorkbookFunctionsErf_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erf_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsError_TypeRequestBuilder error_Type(@Nonnull final WorkbookFunctionsError_TypeParameterSet parameters) {
        return new WorkbookFunctionsError_TypeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.error_Type"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEvenRequestBuilder even(@Nonnull final WorkbookFunctionsEvenParameterSet parameters) {
        return new WorkbookFunctionsEvenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.even"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExactRequestBuilder exact(@Nonnull final WorkbookFunctionsExactParameterSet parameters) {
        return new WorkbookFunctionsExactRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exact"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExpRequestBuilder exp(@Nonnull final WorkbookFunctionsExpParameterSet parameters) {
        return new WorkbookFunctionsExpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExpon_DistRequestBuilder expon_Dist(@Nonnull final WorkbookFunctionsExpon_DistParameterSet parameters) {
        return new WorkbookFunctionsExpon_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.expon_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFactRequestBuilder fact(@Nonnull final WorkbookFunctionsFactParameterSet parameters) {
        return new WorkbookFunctionsFactRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fact"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFactDoubleRequestBuilder factDouble(@Nonnull final WorkbookFunctionsFactDoubleParameterSet parameters) {
        return new WorkbookFunctionsFactDoubleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.factDouble"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsFalseRequestBuilder msgraphFalse() {
        return new WorkbookFunctionsFalseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.false"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFindRequestBuilder find(@Nonnull final WorkbookFunctionsFindParameterSet parameters) {
        return new WorkbookFunctionsFindRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.find"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFindBRequestBuilder findB(@Nonnull final WorkbookFunctionsFindBParameterSet parameters) {
        return new WorkbookFunctionsFindBRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findB"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFisherRequestBuilder fisher(@Nonnull final WorkbookFunctionsFisherParameterSet parameters) {
        return new WorkbookFunctionsFisherRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fisher"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFisherInvRequestBuilder fisherInv(@Nonnull final WorkbookFunctionsFisherInvParameterSet parameters) {
        return new WorkbookFunctionsFisherInvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fisherInv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFixedRequestBuilder fixed(@Nonnull final WorkbookFunctionsFixedParameterSet parameters) {
        return new WorkbookFunctionsFixedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fixed"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFloor_MathRequestBuilder floor_Math(@Nonnull final WorkbookFunctionsFloor_MathParameterSet parameters) {
        return new WorkbookFunctionsFloor_MathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.floor_Math"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFloor_PreciseRequestBuilder floor_Precise(@Nonnull final WorkbookFunctionsFloor_PreciseParameterSet parameters) {
        return new WorkbookFunctionsFloor_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.floor_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFvRequestBuilder fv(@Nonnull final WorkbookFunctionsFvParameterSet parameters) {
        return new WorkbookFunctionsFvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFvscheduleRequestBuilder fvschedule(@Nonnull final WorkbookFunctionsFvscheduleParameterSet parameters) {
        return new WorkbookFunctionsFvscheduleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fvschedule"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_DistRequestBuilder f_Dist(@Nonnull final WorkbookFunctionsF_DistParameterSet parameters) {
        return new WorkbookFunctionsF_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_Dist_RTRequestBuilder f_Dist_RT(@Nonnull final WorkbookFunctionsF_Dist_RTParameterSet parameters) {
        return new WorkbookFunctionsF_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_InvRequestBuilder f_Inv(@Nonnull final WorkbookFunctionsF_InvParameterSet parameters) {
        return new WorkbookFunctionsF_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_Inv_RTRequestBuilder f_Inv_RT(@Nonnull final WorkbookFunctionsF_Inv_RTParameterSet parameters) {
        return new WorkbookFunctionsF_Inv_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Inv_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaRequestBuilder gamma(@Nonnull final WorkbookFunctionsGammaParameterSet parameters) {
        return new WorkbookFunctionsGammaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaLnRequestBuilder gammaLn(@Nonnull final WorkbookFunctionsGammaLnParameterSet parameters) {
        return new WorkbookFunctionsGammaLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gammaLn"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaLn_PreciseRequestBuilder gammaLn_Precise(@Nonnull final WorkbookFunctionsGammaLn_PreciseParameterSet parameters) {
        return new WorkbookFunctionsGammaLn_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gammaLn_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGamma_DistRequestBuilder gamma_Dist(@Nonnull final WorkbookFunctionsGamma_DistParameterSet parameters) {
        return new WorkbookFunctionsGamma_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGamma_InvRequestBuilder gamma_Inv(@Nonnull final WorkbookFunctionsGamma_InvParameterSet parameters) {
        return new WorkbookFunctionsGamma_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGaussRequestBuilder gauss(@Nonnull final WorkbookFunctionsGaussParameterSet parameters) {
        return new WorkbookFunctionsGaussRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gauss"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGcdRequestBuilder gcd(@Nonnull final WorkbookFunctionsGcdParameterSet parameters) {
        return new WorkbookFunctionsGcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGeoMeanRequestBuilder geoMean(@Nonnull final WorkbookFunctionsGeoMeanParameterSet parameters) {
        return new WorkbookFunctionsGeoMeanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.geoMean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGeStepRequestBuilder geStep(@Nonnull final WorkbookFunctionsGeStepParameterSet parameters) {
        return new WorkbookFunctionsGeStepRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.geStep"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHarMeanRequestBuilder harMean(@Nonnull final WorkbookFunctionsHarMeanParameterSet parameters) {
        return new WorkbookFunctionsHarMeanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.harMean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2BinRequestBuilder hex2Bin(@Nonnull final WorkbookFunctionsHex2BinParameterSet parameters) {
        return new WorkbookFunctionsHex2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2DecRequestBuilder hex2Dec(@Nonnull final WorkbookFunctionsHex2DecParameterSet parameters) {
        return new WorkbookFunctionsHex2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2OctRequestBuilder hex2Oct(@Nonnull final WorkbookFunctionsHex2OctParameterSet parameters) {
        return new WorkbookFunctionsHex2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHlookupRequestBuilder hlookup(@Nonnull final WorkbookFunctionsHlookupParameterSet parameters) {
        return new WorkbookFunctionsHlookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hlookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHourRequestBuilder hour(@Nonnull final WorkbookFunctionsHourParameterSet parameters) {
        return new WorkbookFunctionsHourRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hour"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHyperlinkRequestBuilder hyperlink(@Nonnull final WorkbookFunctionsHyperlinkParameterSet parameters) {
        return new WorkbookFunctionsHyperlinkRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hyperlink"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHypGeom_DistRequestBuilder hypGeom_Dist(@Nonnull final WorkbookFunctionsHypGeom_DistParameterSet parameters) {
        return new WorkbookFunctionsHypGeom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hypGeom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIfRequestBuilder msgraphIf(@Nonnull final WorkbookFunctionsIfParameterSet parameters) {
        return new WorkbookFunctionsIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.if"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImAbsRequestBuilder imAbs(@Nonnull final WorkbookFunctionsImAbsParameterSet parameters) {
        return new WorkbookFunctionsImAbsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imAbs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImaginaryRequestBuilder imaginary(@Nonnull final WorkbookFunctionsImaginaryParameterSet parameters) {
        return new WorkbookFunctionsImaginaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imaginary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImArgumentRequestBuilder imArgument(@Nonnull final WorkbookFunctionsImArgumentParameterSet parameters) {
        return new WorkbookFunctionsImArgumentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imArgument"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImConjugateRequestBuilder imConjugate(@Nonnull final WorkbookFunctionsImConjugateParameterSet parameters) {
        return new WorkbookFunctionsImConjugateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imConjugate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCosRequestBuilder imCos(@Nonnull final WorkbookFunctionsImCosParameterSet parameters) {
        return new WorkbookFunctionsImCosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCoshRequestBuilder imCosh(@Nonnull final WorkbookFunctionsImCoshParameterSet parameters) {
        return new WorkbookFunctionsImCoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCotRequestBuilder imCot(@Nonnull final WorkbookFunctionsImCotParameterSet parameters) {
        return new WorkbookFunctionsImCotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCscRequestBuilder imCsc(@Nonnull final WorkbookFunctionsImCscParameterSet parameters) {
        return new WorkbookFunctionsImCscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCsc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCschRequestBuilder imCsch(@Nonnull final WorkbookFunctionsImCschParameterSet parameters) {
        return new WorkbookFunctionsImCschRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCsch"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImDivRequestBuilder imDiv(@Nonnull final WorkbookFunctionsImDivParameterSet parameters) {
        return new WorkbookFunctionsImDivRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imDiv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImExpRequestBuilder imExp(@Nonnull final WorkbookFunctionsImExpParameterSet parameters) {
        return new WorkbookFunctionsImExpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imExp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLnRequestBuilder imLn(@Nonnull final WorkbookFunctionsImLnParameterSet parameters) {
        return new WorkbookFunctionsImLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLn"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLog10RequestBuilder imLog10(@Nonnull final WorkbookFunctionsImLog10ParameterSet parameters) {
        return new WorkbookFunctionsImLog10RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLog10"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLog2RequestBuilder imLog2(@Nonnull final WorkbookFunctionsImLog2ParameterSet parameters) {
        return new WorkbookFunctionsImLog2RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLog2"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImPowerRequestBuilder imPower(@Nonnull final WorkbookFunctionsImPowerParameterSet parameters) {
        return new WorkbookFunctionsImPowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imPower"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImProductRequestBuilder imProduct(@Nonnull final WorkbookFunctionsImProductParameterSet parameters) {
        return new WorkbookFunctionsImProductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imProduct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImRealRequestBuilder imReal(@Nonnull final WorkbookFunctionsImRealParameterSet parameters) {
        return new WorkbookFunctionsImRealRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imReal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSecRequestBuilder imSec(@Nonnull final WorkbookFunctionsImSecParameterSet parameters) {
        return new WorkbookFunctionsImSecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSechRequestBuilder imSech(@Nonnull final WorkbookFunctionsImSechParameterSet parameters) {
        return new WorkbookFunctionsImSechRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSech"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSinRequestBuilder imSin(@Nonnull final WorkbookFunctionsImSinParameterSet parameters) {
        return new WorkbookFunctionsImSinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSinhRequestBuilder imSinh(@Nonnull final WorkbookFunctionsImSinhParameterSet parameters) {
        return new WorkbookFunctionsImSinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSqrtRequestBuilder imSqrt(@Nonnull final WorkbookFunctionsImSqrtParameterSet parameters) {
        return new WorkbookFunctionsImSqrtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSqrt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSubRequestBuilder imSub(@Nonnull final WorkbookFunctionsImSubParameterSet parameters) {
        return new WorkbookFunctionsImSubRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSub"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSumRequestBuilder imSum(@Nonnull final WorkbookFunctionsImSumParameterSet parameters) {
        return new WorkbookFunctionsImSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImTanRequestBuilder imTan(@Nonnull final WorkbookFunctionsImTanParameterSet parameters) {
        return new WorkbookFunctionsImTanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imTan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIntRequestBuilder msgraphInt(@Nonnull final WorkbookFunctionsIntParameterSet parameters) {
        return new WorkbookFunctionsIntRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.int"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIntRateRequestBuilder intRate(@Nonnull final WorkbookFunctionsIntRateParameterSet parameters) {
        return new WorkbookFunctionsIntRateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.intRate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIpmtRequestBuilder ipmt(@Nonnull final WorkbookFunctionsIpmtParameterSet parameters) {
        return new WorkbookFunctionsIpmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ipmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIrrRequestBuilder irr(@Nonnull final WorkbookFunctionsIrrParameterSet parameters) {
        return new WorkbookFunctionsIrrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.irr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsErrRequestBuilder isErr(@Nonnull final WorkbookFunctionsIsErrParameterSet parameters) {
        return new WorkbookFunctionsIsErrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isErr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsErrorRequestBuilder isError(@Nonnull final WorkbookFunctionsIsErrorParameterSet parameters) {
        return new WorkbookFunctionsIsErrorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isError"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsEvenRequestBuilder isEven(@Nonnull final WorkbookFunctionsIsEvenParameterSet parameters) {
        return new WorkbookFunctionsIsEvenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isEven"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsFormulaRequestBuilder isFormula(@Nonnull final WorkbookFunctionsIsFormulaParameterSet parameters) {
        return new WorkbookFunctionsIsFormulaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isFormula"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsLogicalRequestBuilder isLogical(@Nonnull final WorkbookFunctionsIsLogicalParameterSet parameters) {
        return new WorkbookFunctionsIsLogicalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isLogical"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNARequestBuilder isNA(@Nonnull final WorkbookFunctionsIsNAParameterSet parameters) {
        return new WorkbookFunctionsIsNARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNonTextRequestBuilder isNonText(@Nonnull final WorkbookFunctionsIsNonTextParameterSet parameters) {
        return new WorkbookFunctionsIsNonTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNonText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNumberRequestBuilder isNumber(@Nonnull final WorkbookFunctionsIsNumberParameterSet parameters) {
        return new WorkbookFunctionsIsNumberRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNumber"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsOddRequestBuilder isOdd(@Nonnull final WorkbookFunctionsIsOddParameterSet parameters) {
        return new WorkbookFunctionsIsOddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isOdd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsoWeekNumRequestBuilder isoWeekNum(@Nonnull final WorkbookFunctionsIsoWeekNumParameterSet parameters) {
        return new WorkbookFunctionsIsoWeekNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isoWeekNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIso_CeilingRequestBuilder iso_Ceiling(@Nonnull final WorkbookFunctionsIso_CeilingParameterSet parameters) {
        return new WorkbookFunctionsIso_CeilingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.iso_Ceiling"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIspmtRequestBuilder ispmt(@Nonnull final WorkbookFunctionsIspmtParameterSet parameters) {
        return new WorkbookFunctionsIspmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ispmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsrefRequestBuilder isref(@Nonnull final WorkbookFunctionsIsrefParameterSet parameters) {
        return new WorkbookFunctionsIsrefRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isref"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsTextRequestBuilder isText(@Nonnull final WorkbookFunctionsIsTextParameterSet parameters) {
        return new WorkbookFunctionsIsTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsKurtRequestBuilder kurt(@Nonnull final WorkbookFunctionsKurtParameterSet parameters) {
        return new WorkbookFunctionsKurtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.kurt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLargeRequestBuilder large(@Nonnull final WorkbookFunctionsLargeParameterSet parameters) {
        return new WorkbookFunctionsLargeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.large"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLcmRequestBuilder lcm(@Nonnull final WorkbookFunctionsLcmParameterSet parameters) {
        return new WorkbookFunctionsLcmRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lcm"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLeftRequestBuilder left(@Nonnull final WorkbookFunctionsLeftParameterSet parameters) {
        return new WorkbookFunctionsLeftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.left"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLeftbRequestBuilder leftb(@Nonnull final WorkbookFunctionsLeftbParameterSet parameters) {
        return new WorkbookFunctionsLeftbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.leftb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLenRequestBuilder len(@Nonnull final WorkbookFunctionsLenParameterSet parameters) {
        return new WorkbookFunctionsLenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.len"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLenbRequestBuilder lenb(@Nonnull final WorkbookFunctionsLenbParameterSet parameters) {
        return new WorkbookFunctionsLenbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lenb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLnRequestBuilder ln(@Nonnull final WorkbookFunctionsLnParameterSet parameters) {
        return new WorkbookFunctionsLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ln"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogRequestBuilder log(@Nonnull final WorkbookFunctionsLogParameterSet parameters) {
        return new WorkbookFunctionsLogRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.log"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLog10RequestBuilder log10(@Nonnull final WorkbookFunctionsLog10ParameterSet parameters) {
        return new WorkbookFunctionsLog10RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.log10"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_DistRequestBuilder logNorm_Dist(@Nonnull final WorkbookFunctionsLogNorm_DistParameterSet parameters) {
        return new WorkbookFunctionsLogNorm_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logNorm_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_InvRequestBuilder logNorm_Inv(@Nonnull final WorkbookFunctionsLogNorm_InvParameterSet parameters) {
        return new WorkbookFunctionsLogNorm_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logNorm_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLookupRequestBuilder lookup(@Nonnull final WorkbookFunctionsLookupParameterSet parameters) {
        return new WorkbookFunctionsLookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLowerRequestBuilder lower(@Nonnull final WorkbookFunctionsLowerParameterSet parameters) {
        return new WorkbookFunctionsLowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lower"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMatchRequestBuilder match(@Nonnull final WorkbookFunctionsMatchParameterSet parameters) {
        return new WorkbookFunctionsMatchRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.match"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMaxRequestBuilder max(@Nonnull final WorkbookFunctionsMaxParameterSet parameters) {
        return new WorkbookFunctionsMaxRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.max"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMaxARequestBuilder maxA(@Nonnull final WorkbookFunctionsMaxAParameterSet parameters) {
        return new WorkbookFunctionsMaxARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.maxA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMdurationRequestBuilder mduration(@Nonnull final WorkbookFunctionsMdurationParameterSet parameters) {
        return new WorkbookFunctionsMdurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mduration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMedianRequestBuilder median(@Nonnull final WorkbookFunctionsMedianParameterSet parameters) {
        return new WorkbookFunctionsMedianRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.median"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMidRequestBuilder mid(@Nonnull final WorkbookFunctionsMidParameterSet parameters) {
        return new WorkbookFunctionsMidRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mid"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMidbRequestBuilder midb(@Nonnull final WorkbookFunctionsMidbParameterSet parameters) {
        return new WorkbookFunctionsMidbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.midb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinRequestBuilder min(@Nonnull final WorkbookFunctionsMinParameterSet parameters) {
        return new WorkbookFunctionsMinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.min"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinARequestBuilder minA(@Nonnull final WorkbookFunctionsMinAParameterSet parameters) {
        return new WorkbookFunctionsMinARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.minA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinuteRequestBuilder minute(@Nonnull final WorkbookFunctionsMinuteParameterSet parameters) {
        return new WorkbookFunctionsMinuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.minute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMirrRequestBuilder mirr(@Nonnull final WorkbookFunctionsMirrParameterSet parameters) {
        return new WorkbookFunctionsMirrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mirr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsModRequestBuilder mod(@Nonnull final WorkbookFunctionsModParameterSet parameters) {
        return new WorkbookFunctionsModRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mod"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMonthRequestBuilder month(@Nonnull final WorkbookFunctionsMonthParameterSet parameters) {
        return new WorkbookFunctionsMonthRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.month"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMroundRequestBuilder mround(@Nonnull final WorkbookFunctionsMroundParameterSet parameters) {
        return new WorkbookFunctionsMroundRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mround"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMultiNomialRequestBuilder multiNomial(@Nonnull final WorkbookFunctionsMultiNomialParameterSet parameters) {
        return new WorkbookFunctionsMultiNomialRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.multiNomial"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNRequestBuilder n(@Nonnull final WorkbookFunctionsNParameterSet parameters) {
        return new WorkbookFunctionsNRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.n"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsNaRequestBuilder na() {
        return new WorkbookFunctionsNaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.na"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNegBinom_DistRequestBuilder negBinom_Dist(@Nonnull final WorkbookFunctionsNegBinom_DistParameterSet parameters) {
        return new WorkbookFunctionsNegBinom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.negBinom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNetworkDaysRequestBuilder networkDays(@Nonnull final WorkbookFunctionsNetworkDaysParameterSet parameters) {
        return new WorkbookFunctionsNetworkDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.networkDays"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNetworkDays_IntlRequestBuilder networkDays_Intl(@Nonnull final WorkbookFunctionsNetworkDays_IntlParameterSet parameters) {
        return new WorkbookFunctionsNetworkDays_IntlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.networkDays_Intl"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNominalRequestBuilder nominal(@Nonnull final WorkbookFunctionsNominalParameterSet parameters) {
        return new WorkbookFunctionsNominalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.nominal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_DistRequestBuilder norm_Dist(@Nonnull final WorkbookFunctionsNorm_DistParameterSet parameters) {
        return new WorkbookFunctionsNorm_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_InvRequestBuilder norm_Inv(@Nonnull final WorkbookFunctionsNorm_InvParameterSet parameters) {
        return new WorkbookFunctionsNorm_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_DistRequestBuilder norm_S_Dist(@Nonnull final WorkbookFunctionsNorm_S_DistParameterSet parameters) {
        return new WorkbookFunctionsNorm_S_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_S_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_InvRequestBuilder norm_S_Inv(@Nonnull final WorkbookFunctionsNorm_S_InvParameterSet parameters) {
        return new WorkbookFunctionsNorm_S_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_S_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNotRequestBuilder not(@Nonnull final WorkbookFunctionsNotParameterSet parameters) {
        return new WorkbookFunctionsNotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.not"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsNowRequestBuilder now() {
        return new WorkbookFunctionsNowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.now"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNperRequestBuilder nper(@Nonnull final WorkbookFunctionsNperParameterSet parameters) {
        return new WorkbookFunctionsNperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.nper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNpvRequestBuilder npv(@Nonnull final WorkbookFunctionsNpvParameterSet parameters) {
        return new WorkbookFunctionsNpvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.npv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNumberValueRequestBuilder numberValue(@Nonnull final WorkbookFunctionsNumberValueParameterSet parameters) {
        return new WorkbookFunctionsNumberValueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.numberValue"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2BinRequestBuilder oct2Bin(@Nonnull final WorkbookFunctionsOct2BinParameterSet parameters) {
        return new WorkbookFunctionsOct2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2DecRequestBuilder oct2Dec(@Nonnull final WorkbookFunctionsOct2DecParameterSet parameters) {
        return new WorkbookFunctionsOct2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2HexRequestBuilder oct2Hex(@Nonnull final WorkbookFunctionsOct2HexParameterSet parameters) {
        return new WorkbookFunctionsOct2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddRequestBuilder odd(@Nonnull final WorkbookFunctionsOddParameterSet parameters) {
        return new WorkbookFunctionsOddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.odd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddFPriceRequestBuilder oddFPrice(@Nonnull final WorkbookFunctionsOddFPriceParameterSet parameters) {
        return new WorkbookFunctionsOddFPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddFPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddFYieldRequestBuilder oddFYield(@Nonnull final WorkbookFunctionsOddFYieldParameterSet parameters) {
        return new WorkbookFunctionsOddFYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddFYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddLPriceRequestBuilder oddLPrice(@Nonnull final WorkbookFunctionsOddLPriceParameterSet parameters) {
        return new WorkbookFunctionsOddLPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddLPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddLYieldRequestBuilder oddLYield(@Nonnull final WorkbookFunctionsOddLYieldParameterSet parameters) {
        return new WorkbookFunctionsOddLYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddLYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOrRequestBuilder or(@Nonnull final WorkbookFunctionsOrParameterSet parameters) {
        return new WorkbookFunctionsOrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.or"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPdurationRequestBuilder pduration(@Nonnull final WorkbookFunctionsPdurationParameterSet parameters) {
        return new WorkbookFunctionsPdurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pduration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentile_ExcRequestBuilder percentile_Exc(@Nonnull final WorkbookFunctionsPercentile_ExcParameterSet parameters) {
        return new WorkbookFunctionsPercentile_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentile_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentile_IncRequestBuilder percentile_Inc(@Nonnull final WorkbookFunctionsPercentile_IncParameterSet parameters) {
        return new WorkbookFunctionsPercentile_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentile_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentRank_ExcRequestBuilder percentRank_Exc(@Nonnull final WorkbookFunctionsPercentRank_ExcParameterSet parameters) {
        return new WorkbookFunctionsPercentRank_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentRank_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentRank_IncRequestBuilder percentRank_Inc(@Nonnull final WorkbookFunctionsPercentRank_IncParameterSet parameters) {
        return new WorkbookFunctionsPercentRank_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentRank_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPermutRequestBuilder permut(@Nonnull final WorkbookFunctionsPermutParameterSet parameters) {
        return new WorkbookFunctionsPermutRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.permut"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPermutationaRequestBuilder permutationa(@Nonnull final WorkbookFunctionsPermutationaParameterSet parameters) {
        return new WorkbookFunctionsPermutationaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.permutationa"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPhiRequestBuilder phi(@Nonnull final WorkbookFunctionsPhiParameterSet parameters) {
        return new WorkbookFunctionsPhiRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.phi"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsPiRequestBuilder pi() {
        return new WorkbookFunctionsPiRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pi"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPmtRequestBuilder pmt(@Nonnull final WorkbookFunctionsPmtParameterSet parameters) {
        return new WorkbookFunctionsPmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPoisson_DistRequestBuilder poisson_Dist(@Nonnull final WorkbookFunctionsPoisson_DistParameterSet parameters) {
        return new WorkbookFunctionsPoisson_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.poisson_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPowerRequestBuilder power(@Nonnull final WorkbookFunctionsPowerParameterSet parameters) {
        return new WorkbookFunctionsPowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.power"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPpmtRequestBuilder ppmt(@Nonnull final WorkbookFunctionsPpmtParameterSet parameters) {
        return new WorkbookFunctionsPpmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ppmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceRequestBuilder price(@Nonnull final WorkbookFunctionsPriceParameterSet parameters) {
        return new WorkbookFunctionsPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.price"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceDiscRequestBuilder priceDisc(@Nonnull final WorkbookFunctionsPriceDiscParameterSet parameters) {
        return new WorkbookFunctionsPriceDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.priceDisc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceMatRequestBuilder priceMat(@Nonnull final WorkbookFunctionsPriceMatParameterSet parameters) {
        return new WorkbookFunctionsPriceMatRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.priceMat"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsProductRequestBuilder product(@Nonnull final WorkbookFunctionsProductParameterSet parameters) {
        return new WorkbookFunctionsProductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.product"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsProperRequestBuilder proper(@Nonnull final WorkbookFunctionsProperParameterSet parameters) {
        return new WorkbookFunctionsProperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.proper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPvRequestBuilder pv(@Nonnull final WorkbookFunctionsPvParameterSet parameters) {
        return new WorkbookFunctionsPvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuartile_ExcRequestBuilder quartile_Exc(@Nonnull final WorkbookFunctionsQuartile_ExcParameterSet parameters) {
        return new WorkbookFunctionsQuartile_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quartile_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuartile_IncRequestBuilder quartile_Inc(@Nonnull final WorkbookFunctionsQuartile_IncParameterSet parameters) {
        return new WorkbookFunctionsQuartile_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quartile_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuotientRequestBuilder quotient(@Nonnull final WorkbookFunctionsQuotientParameterSet parameters) {
        return new WorkbookFunctionsQuotientRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quotient"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRadiansRequestBuilder radians(@Nonnull final WorkbookFunctionsRadiansParameterSet parameters) {
        return new WorkbookFunctionsRadiansRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.radians"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsRandRequestBuilder rand() {
        return new WorkbookFunctionsRandRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rand"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRandBetweenRequestBuilder randBetween(@Nonnull final WorkbookFunctionsRandBetweenParameterSet parameters) {
        return new WorkbookFunctionsRandBetweenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.randBetween"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRank_AvgRequestBuilder rank_Avg(@Nonnull final WorkbookFunctionsRank_AvgParameterSet parameters) {
        return new WorkbookFunctionsRank_AvgRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rank_Avg"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRank_EqRequestBuilder rank_Eq(@Nonnull final WorkbookFunctionsRank_EqParameterSet parameters) {
        return new WorkbookFunctionsRank_EqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rank_Eq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRateRequestBuilder rate(@Nonnull final WorkbookFunctionsRateParameterSet parameters) {
        return new WorkbookFunctionsRateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReceivedRequestBuilder received(@Nonnull final WorkbookFunctionsReceivedParameterSet parameters) {
        return new WorkbookFunctionsReceivedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.received"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReplaceRequestBuilder replace(@Nonnull final WorkbookFunctionsReplaceParameterSet parameters) {
        return new WorkbookFunctionsReplaceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replace"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReplaceBRequestBuilder replaceB(@Nonnull final WorkbookFunctionsReplaceBParameterSet parameters) {
        return new WorkbookFunctionsReplaceBRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replaceB"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReptRequestBuilder rept(@Nonnull final WorkbookFunctionsReptParameterSet parameters) {
        return new WorkbookFunctionsReptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rept"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRightRequestBuilder right(@Nonnull final WorkbookFunctionsRightParameterSet parameters) {
        return new WorkbookFunctionsRightRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.right"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRightbRequestBuilder rightb(@Nonnull final WorkbookFunctionsRightbParameterSet parameters) {
        return new WorkbookFunctionsRightbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rightb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRomanRequestBuilder roman(@Nonnull final WorkbookFunctionsRomanParameterSet parameters) {
        return new WorkbookFunctionsRomanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roman"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundRequestBuilder round(@Nonnull final WorkbookFunctionsRoundParameterSet parameters) {
        return new WorkbookFunctionsRoundRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.round"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundDownRequestBuilder roundDown(@Nonnull final WorkbookFunctionsRoundDownParameterSet parameters) {
        return new WorkbookFunctionsRoundDownRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roundDown"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundUpRequestBuilder roundUp(@Nonnull final WorkbookFunctionsRoundUpParameterSet parameters) {
        return new WorkbookFunctionsRoundUpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roundUp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRowsRequestBuilder rows(@Nonnull final WorkbookFunctionsRowsParameterSet parameters) {
        return new WorkbookFunctionsRowsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rows"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRriRequestBuilder rri(@Nonnull final WorkbookFunctionsRriParameterSet parameters) {
        return new WorkbookFunctionsRriRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rri"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSecRequestBuilder sec(@Nonnull final WorkbookFunctionsSecParameterSet parameters) {
        return new WorkbookFunctionsSecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSechRequestBuilder sech(@Nonnull final WorkbookFunctionsSechParameterSet parameters) {
        return new WorkbookFunctionsSechRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sech"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSecondRequestBuilder second(@Nonnull final WorkbookFunctionsSecondParameterSet parameters) {
        return new WorkbookFunctionsSecondRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.second"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSeriesSumRequestBuilder seriesSum(@Nonnull final WorkbookFunctionsSeriesSumParameterSet parameters) {
        return new WorkbookFunctionsSeriesSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.seriesSum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSheetRequestBuilder sheet(@Nonnull final WorkbookFunctionsSheetParameterSet parameters) {
        return new WorkbookFunctionsSheetRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sheet"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSheetsRequestBuilder sheets(@Nonnull final WorkbookFunctionsSheetsParameterSet parameters) {
        return new WorkbookFunctionsSheetsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sheets"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSignRequestBuilder sign(@Nonnull final WorkbookFunctionsSignParameterSet parameters) {
        return new WorkbookFunctionsSignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSinRequestBuilder sin(@Nonnull final WorkbookFunctionsSinParameterSet parameters) {
        return new WorkbookFunctionsSinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSinhRequestBuilder sinh(@Nonnull final WorkbookFunctionsSinhParameterSet parameters) {
        return new WorkbookFunctionsSinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSkewRequestBuilder skew(@Nonnull final WorkbookFunctionsSkewParameterSet parameters) {
        return new WorkbookFunctionsSkewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.skew"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSkew_pRequestBuilder skew_p(@Nonnull final WorkbookFunctionsSkew_pParameterSet parameters) {
        return new WorkbookFunctionsSkew_pRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.skew_p"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSlnRequestBuilder sln(@Nonnull final WorkbookFunctionsSlnParameterSet parameters) {
        return new WorkbookFunctionsSlnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sln"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSmallRequestBuilder small(@Nonnull final WorkbookFunctionsSmallParameterSet parameters) {
        return new WorkbookFunctionsSmallRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.small"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSqrtRequestBuilder sqrt(@Nonnull final WorkbookFunctionsSqrtParameterSet parameters) {
        return new WorkbookFunctionsSqrtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sqrt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSqrtPiRequestBuilder sqrtPi(@Nonnull final WorkbookFunctionsSqrtPiParameterSet parameters) {
        return new WorkbookFunctionsSqrtPiRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sqrtPi"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStandardizeRequestBuilder standardize(@Nonnull final WorkbookFunctionsStandardizeParameterSet parameters) {
        return new WorkbookFunctionsStandardizeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.standardize"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDevARequestBuilder stDevA(@Nonnull final WorkbookFunctionsStDevAParameterSet parameters) {
        return new WorkbookFunctionsStDevARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDevA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDevPARequestBuilder stDevPA(@Nonnull final WorkbookFunctionsStDevPAParameterSet parameters) {
        return new WorkbookFunctionsStDevPARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDevPA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDev_PRequestBuilder stDev_P(@Nonnull final WorkbookFunctionsStDev_PParameterSet parameters) {
        return new WorkbookFunctionsStDev_PRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDev_P"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDev_SRequestBuilder stDev_S(@Nonnull final WorkbookFunctionsStDev_SParameterSet parameters) {
        return new WorkbookFunctionsStDev_SRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDev_S"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSubstituteRequestBuilder substitute(@Nonnull final WorkbookFunctionsSubstituteParameterSet parameters) {
        return new WorkbookFunctionsSubstituteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.substitute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSubtotalRequestBuilder subtotal(@Nonnull final WorkbookFunctionsSubtotalParameterSet parameters) {
        return new WorkbookFunctionsSubtotalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subtotal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumRequestBuilder sum(@Nonnull final WorkbookFunctionsSumParameterSet parameters) {
        return new WorkbookFunctionsSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumIfRequestBuilder sumIf(@Nonnull final WorkbookFunctionsSumIfParameterSet parameters) {
        return new WorkbookFunctionsSumIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumIfsRequestBuilder sumIfs(@Nonnull final WorkbookFunctionsSumIfsParameterSet parameters) {
        return new WorkbookFunctionsSumIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumSqRequestBuilder sumSq(@Nonnull final WorkbookFunctionsSumSqParameterSet parameters) {
        return new WorkbookFunctionsSumSqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumSq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSydRequestBuilder syd(@Nonnull final WorkbookFunctionsSydParameterSet parameters) {
        return new WorkbookFunctionsSydRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTRequestBuilder t(@Nonnull final WorkbookFunctionsTParameterSet parameters) {
        return new WorkbookFunctionsTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTanRequestBuilder tan(@Nonnull final WorkbookFunctionsTanParameterSet parameters) {
        return new WorkbookFunctionsTanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTanhRequestBuilder tanh(@Nonnull final WorkbookFunctionsTanhParameterSet parameters) {
        return new WorkbookFunctionsTanhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tanh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillEqRequestBuilder tbillEq(@Nonnull final WorkbookFunctionsTbillEqParameterSet parameters) {
        return new WorkbookFunctionsTbillEqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillEq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillPriceRequestBuilder tbillPrice(@Nonnull final WorkbookFunctionsTbillPriceParameterSet parameters) {
        return new WorkbookFunctionsTbillPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillYieldRequestBuilder tbillYield(@Nonnull final WorkbookFunctionsTbillYieldParameterSet parameters) {
        return new WorkbookFunctionsTbillYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTextRequestBuilder text(@Nonnull final WorkbookFunctionsTextParameterSet parameters) {
        return new WorkbookFunctionsTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.text"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTimeRequestBuilder time(@Nonnull final WorkbookFunctionsTimeParameterSet parameters) {
        return new WorkbookFunctionsTimeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.time"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTimevalueRequestBuilder timevalue(@Nonnull final WorkbookFunctionsTimevalueParameterSet parameters) {
        return new WorkbookFunctionsTimevalueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.timevalue"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsTodayRequestBuilder today() {
        return new WorkbookFunctionsTodayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.today"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTrimRequestBuilder trim(@Nonnull final WorkbookFunctionsTrimParameterSet parameters) {
        return new WorkbookFunctionsTrimRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.trim"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTrimMeanRequestBuilder trimMean(@Nonnull final WorkbookFunctionsTrimMeanParameterSet parameters) {
        return new WorkbookFunctionsTrimMeanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.trimMean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookFunctionsTrueRequestBuilder msgraphTrue() {
        return new WorkbookFunctionsTrueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.true"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTruncRequestBuilder trunc(@Nonnull final WorkbookFunctionsTruncParameterSet parameters) {
        return new WorkbookFunctionsTruncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.trunc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTypeRequestBuilder type(@Nonnull final WorkbookFunctionsTypeParameterSet parameters) {
        return new WorkbookFunctionsTypeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.type"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_DistRequestBuilder t_Dist(@Nonnull final WorkbookFunctionsT_DistParameterSet parameters) {
        return new WorkbookFunctionsT_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Dist_2TRequestBuilder t_Dist_2T(@Nonnull final WorkbookFunctionsT_Dist_2TParameterSet parameters) {
        return new WorkbookFunctionsT_Dist_2TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist_2T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Dist_RTRequestBuilder t_Dist_RT(@Nonnull final WorkbookFunctionsT_Dist_RTParameterSet parameters) {
        return new WorkbookFunctionsT_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_InvRequestBuilder t_Inv(@Nonnull final WorkbookFunctionsT_InvParameterSet parameters) {
        return new WorkbookFunctionsT_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Inv_2TRequestBuilder t_Inv_2T(@Nonnull final WorkbookFunctionsT_Inv_2TParameterSet parameters) {
        return new WorkbookFunctionsT_Inv_2TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Inv_2T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUnicharRequestBuilder unichar(@Nonnull final WorkbookFunctionsUnicharParameterSet parameters) {
        return new WorkbookFunctionsUnicharRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unichar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUnicodeRequestBuilder unicode(@Nonnull final WorkbookFunctionsUnicodeParameterSet parameters) {
        return new WorkbookFunctionsUnicodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unicode"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUpperRequestBuilder upper(@Nonnull final WorkbookFunctionsUpperParameterSet parameters) {
        return new WorkbookFunctionsUpperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.upper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUsdollarRequestBuilder usdollar(@Nonnull final WorkbookFunctionsUsdollarParameterSet parameters) {
        return new WorkbookFunctionsUsdollarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usdollar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsValueRequestBuilder value(@Nonnull final WorkbookFunctionsValueParameterSet parameters) {
        return new WorkbookFunctionsValueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.value"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVarARequestBuilder varA(@Nonnull final WorkbookFunctionsVarAParameterSet parameters) {
        return new WorkbookFunctionsVarARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.varA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVarPARequestBuilder varPA(@Nonnull final WorkbookFunctionsVarPAParameterSet parameters) {
        return new WorkbookFunctionsVarPARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.varPA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVar_PRequestBuilder var_P(@Nonnull final WorkbookFunctionsVar_PParameterSet parameters) {
        return new WorkbookFunctionsVar_PRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.var_P"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVar_SRequestBuilder var_S(@Nonnull final WorkbookFunctionsVar_SParameterSet parameters) {
        return new WorkbookFunctionsVar_SRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.var_S"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVdbRequestBuilder vdb(@Nonnull final WorkbookFunctionsVdbParameterSet parameters) {
        return new WorkbookFunctionsVdbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.vdb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVlookupRequestBuilder vlookup(@Nonnull final WorkbookFunctionsVlookupParameterSet parameters) {
        return new WorkbookFunctionsVlookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.vlookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeekdayRequestBuilder weekday(@Nonnull final WorkbookFunctionsWeekdayParameterSet parameters) {
        return new WorkbookFunctionsWeekdayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weekday"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeekNumRequestBuilder weekNum(@Nonnull final WorkbookFunctionsWeekNumParameterSet parameters) {
        return new WorkbookFunctionsWeekNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weekNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeibull_DistRequestBuilder weibull_Dist(@Nonnull final WorkbookFunctionsWeibull_DistParameterSet parameters) {
        return new WorkbookFunctionsWeibull_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weibull_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWorkDayRequestBuilder workDay(@Nonnull final WorkbookFunctionsWorkDayParameterSet parameters) {
        return new WorkbookFunctionsWorkDayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.workDay"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWorkDay_IntlRequestBuilder workDay_Intl(@Nonnull final WorkbookFunctionsWorkDay_IntlParameterSet parameters) {
        return new WorkbookFunctionsWorkDay_IntlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.workDay_Intl"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXirrRequestBuilder xirr(@Nonnull final WorkbookFunctionsXirrParameterSet parameters) {
        return new WorkbookFunctionsXirrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xirr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXnpvRequestBuilder xnpv(@Nonnull final WorkbookFunctionsXnpvParameterSet parameters) {
        return new WorkbookFunctionsXnpvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xnpv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXorRequestBuilder xor(@Nonnull final WorkbookFunctionsXorParameterSet parameters) {
        return new WorkbookFunctionsXorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYearRequestBuilder year(@Nonnull final WorkbookFunctionsYearParameterSet parameters) {
        return new WorkbookFunctionsYearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.year"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYearFracRequestBuilder yearFrac(@Nonnull final WorkbookFunctionsYearFracParameterSet parameters) {
        return new WorkbookFunctionsYearFracRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yearFrac"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldRequestBuilder yield(@Nonnull final WorkbookFunctionsYieldParameterSet parameters) {
        return new WorkbookFunctionsYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldDiscRequestBuilder yieldDisc(@Nonnull final WorkbookFunctionsYieldDiscParameterSet parameters) {
        return new WorkbookFunctionsYieldDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yieldDisc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldMatRequestBuilder yieldMat(@Nonnull final WorkbookFunctionsYieldMatParameterSet parameters) {
        return new WorkbookFunctionsYieldMatRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yieldMat"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsZ_TestRequestBuilder z_Test(@Nonnull final WorkbookFunctionsZ_TestParameterSet parameters) {
        return new WorkbookFunctionsZ_TestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.z_Test"), getClient(), null, parameters);
    }
}

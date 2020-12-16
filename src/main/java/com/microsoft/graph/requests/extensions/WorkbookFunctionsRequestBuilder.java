// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDeltaBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAbsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAccrIntBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAccrIntMBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAcosBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAcoshBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAcotBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAcothBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAmorDegrcBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAmorLincBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAndBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsArabicBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAreasBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAsinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAsinhBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAtanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAtan2Body;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAtanhBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAveDevBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAverageBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAverageABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAverageIfBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsAverageIfsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBahtTextBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBaseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBesselIBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBesselJBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBesselKBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBesselYBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBeta_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBeta_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBin2DecBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBin2HexBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBin2OctBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBinom_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBinom_Dist_RangeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBinom_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBitandBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBitlshiftBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBitorBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBitrshiftBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsBitxorBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCeiling_MathBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCeiling_PreciseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCharBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsChiSq_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsChiSq_Dist_RTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsChiSq_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsChiSq_Inv_RTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsChooseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCleanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCodeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsColumnsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCombinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCombinaBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsComplexBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsConcatenateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsConfidence_NormBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsConfidence_TBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsConvertBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCosBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoshBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCotBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCothBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCountBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCountABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCountBlankBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCountIfBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCountIfsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupDayBsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupDaysBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupDaysNcBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupNcdBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupNumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCoupPcdBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCschBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCumIPmtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsCumPrincBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDatevalueBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDaverageBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDayBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDaysBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDays360Body;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDbcsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDcountBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDcountABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDdbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDec2BinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDec2HexBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDec2OctBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDecimalBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDegreesBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDevSqBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDgetBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDiscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDmaxBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDminBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDollarBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDollarDeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDollarFrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDproductBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDstDevBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDstDevPBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDsumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDurationBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDvarBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsDvarPBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsEcma_CeilingBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsEdateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsEffectBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsEoMonthBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsErfBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsErfCBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsErfC_PreciseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsErf_PreciseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsError_TypeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsEvenBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsExactBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsExpBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsExpon_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFactBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFactDoubleBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFindBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFindBBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFisherBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFisherInvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFixedBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFloor_MathBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFloor_PreciseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFvscheduleBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsF_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsF_Dist_RTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsF_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsF_Inv_RTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGammaBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGammaLnBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGammaLn_PreciseBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGamma_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGamma_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGaussBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGcdBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGeoMeanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsGeStepBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHarMeanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHex2BinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHex2DecBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHex2OctBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHlookupBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHourBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHyperlinkBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsHypGeom_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIfBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImAbsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImaginaryBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImArgumentBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImConjugateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImCosBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImCoshBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImCotBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImCscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImCschBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImDivBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImExpBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImLnBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImLog10Body;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImLog2Body;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImPowerBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImProductBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImRealBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSecBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSechBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSinhBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSqrtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSubBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImSumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsImTanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIntBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIntRateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIpmtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIrrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsErrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsErrorBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsEvenBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsFormulaBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsLogicalBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsNABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsNonTextBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsNumberBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsOddBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsoWeekNumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIso_CeilingBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIspmtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsrefBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsIsTextBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsKurtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLargeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLcmBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLeftBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLeftbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLenBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLenbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLnBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLogBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLog10Body;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLogNorm_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLogNorm_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLookupBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsLowerBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMatchBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMaxBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMaxABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMdurationBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMedianBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMidBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMidbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMinABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMinuteBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMirrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsModBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMonthBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMroundBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsMultiNomialBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNegBinom_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNetworkDaysBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNetworkDays_IntlBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNominalBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNorm_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNorm_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNorm_S_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNorm_S_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNotBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNperBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNpvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsNumberValueBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOct2BinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOct2DecBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOct2HexBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOddBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOddFPriceBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOddFYieldBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOddLPriceBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOddLYieldBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsOrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPdurationBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPercentile_ExcBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPercentile_IncBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPercentRank_ExcBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPercentRank_IncBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPermutBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPermutationaBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPhiBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPmtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPoisson_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPowerBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPpmtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPriceBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPriceDiscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPriceMatBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsProductBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsProperBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsPvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsQuartile_ExcBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsQuartile_IncBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsQuotientBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRadiansBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRandBetweenBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRank_AvgBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRank_EqBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRateBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsReceivedBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsReplaceBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsReplaceBBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsReptBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRightBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRightbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRomanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRoundBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRoundDownBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRoundUpBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRowsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsRriBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSecBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSechBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSecondBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSeriesSumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSheetBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSheetsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSignBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSinBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSinhBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSkewBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSkew_pBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSlnBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSmallBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSqrtBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSqrtPiBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsStandardizeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsStDevABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsStDevPABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsStDev_PBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsStDev_SBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSubstituteBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSubtotalBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSumIfBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSumIfsBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSumSqBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsSydBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTanhBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTbillEqBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTbillPriceBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTbillYieldBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTextBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTimeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTimevalueBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTrimBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTrimMeanBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTruncBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsTypeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsT_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsT_Dist_2TBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsT_Dist_RTBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsT_InvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsT_Inv_2TBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsUnicharBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsUnicodeBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsUpperBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsUsdollarBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsValueBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVarABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVarPABody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVar_PBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVar_SBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVdbBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsVlookupBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsWeekdayBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsWeekNumBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsWeibull_DistBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsWorkDayBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsWorkDay_IntlBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsXirrBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsXnpvBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsXorBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsYearBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsYearFracBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsYieldBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsYieldDiscBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsYieldMatBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionsZ_TestBody;

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
    public WorkbookFunctionsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
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
        return new com.microsoft.graph.requests.extensions.WorkbookFunctionsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDeltaRequestBuilder delta(@Nonnull final WorkbookFunctionsDeltaBody parameters) {
        return new WorkbookFunctionsDeltaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAbsRequestBuilder abs(@Nonnull final WorkbookFunctionsAbsBody parameters) {
        return new WorkbookFunctionsAbsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.abs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAccrIntRequestBuilder accrInt(@Nonnull final WorkbookFunctionsAccrIntBody parameters) {
        return new WorkbookFunctionsAccrIntRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accrInt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAccrIntMRequestBuilder accrIntM(@Nonnull final WorkbookFunctionsAccrIntMBody parameters) {
        return new WorkbookFunctionsAccrIntMRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.accrIntM"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcosRequestBuilder acos(@Nonnull final WorkbookFunctionsAcosBody parameters) {
        return new WorkbookFunctionsAcosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcoshRequestBuilder acosh(@Nonnull final WorkbookFunctionsAcoshBody parameters) {
        return new WorkbookFunctionsAcoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcotRequestBuilder acot(@Nonnull final WorkbookFunctionsAcotBody parameters) {
        return new WorkbookFunctionsAcotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAcothRequestBuilder acoth(@Nonnull final WorkbookFunctionsAcothBody parameters) {
        return new WorkbookFunctionsAcothRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acoth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAmorDegrcRequestBuilder amorDegrc(@Nonnull final WorkbookFunctionsAmorDegrcBody parameters) {
        return new WorkbookFunctionsAmorDegrcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.amorDegrc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAmorLincRequestBuilder amorLinc(@Nonnull final WorkbookFunctionsAmorLincBody parameters) {
        return new WorkbookFunctionsAmorLincRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.amorLinc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAndRequestBuilder and(@Nonnull final WorkbookFunctionsAndBody parameters) {
        return new WorkbookFunctionsAndRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.and"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsArabicRequestBuilder arabic(@Nonnull final WorkbookFunctionsArabicBody parameters) {
        return new WorkbookFunctionsArabicRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.arabic"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAreasRequestBuilder areas(@Nonnull final WorkbookFunctionsAreasBody parameters) {
        return new WorkbookFunctionsAreasRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.areas"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAscRequestBuilder asc(@Nonnull final WorkbookFunctionsAscBody parameters) {
        return new WorkbookFunctionsAscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAsinRequestBuilder asin(@Nonnull final WorkbookFunctionsAsinBody parameters) {
        return new WorkbookFunctionsAsinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAsinhRequestBuilder asinh(@Nonnull final WorkbookFunctionsAsinhBody parameters) {
        return new WorkbookFunctionsAsinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.asinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtanRequestBuilder atan(@Nonnull final WorkbookFunctionsAtanBody parameters) {
        return new WorkbookFunctionsAtanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtan2RequestBuilder atan2(@Nonnull final WorkbookFunctionsAtan2Body parameters) {
        return new WorkbookFunctionsAtan2RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atan2"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAtanhRequestBuilder atanh(@Nonnull final WorkbookFunctionsAtanhBody parameters) {
        return new WorkbookFunctionsAtanhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.atanh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAveDevRequestBuilder aveDev(@Nonnull final WorkbookFunctionsAveDevBody parameters) {
        return new WorkbookFunctionsAveDevRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.aveDev"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageRequestBuilder average(@Nonnull final WorkbookFunctionsAverageBody parameters) {
        return new WorkbookFunctionsAverageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.average"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageARequestBuilder averageA(@Nonnull final WorkbookFunctionsAverageABody parameters) {
        return new WorkbookFunctionsAverageARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageIfRequestBuilder averageIf(@Nonnull final WorkbookFunctionsAverageIfBody parameters) {
        return new WorkbookFunctionsAverageIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsAverageIfsRequestBuilder averageIfs(@Nonnull final WorkbookFunctionsAverageIfsBody parameters) {
        return new WorkbookFunctionsAverageIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.averageIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBahtTextRequestBuilder bahtText(@Nonnull final WorkbookFunctionsBahtTextBody parameters) {
        return new WorkbookFunctionsBahtTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bahtText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBaseRequestBuilder base(@Nonnull final WorkbookFunctionsBaseBody parameters) {
        return new WorkbookFunctionsBaseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.base"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselIRequestBuilder besselI(@Nonnull final WorkbookFunctionsBesselIBody parameters) {
        return new WorkbookFunctionsBesselIRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselI"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselJRequestBuilder besselJ(@Nonnull final WorkbookFunctionsBesselJBody parameters) {
        return new WorkbookFunctionsBesselJRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselJ"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselKRequestBuilder besselK(@Nonnull final WorkbookFunctionsBesselKBody parameters) {
        return new WorkbookFunctionsBesselKRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselK"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBesselYRequestBuilder besselY(@Nonnull final WorkbookFunctionsBesselYBody parameters) {
        return new WorkbookFunctionsBesselYRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.besselY"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBeta_DistRequestBuilder beta_Dist(@Nonnull final WorkbookFunctionsBeta_DistBody parameters) {
        return new WorkbookFunctionsBeta_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.beta_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBeta_InvRequestBuilder beta_Inv(@Nonnull final WorkbookFunctionsBeta_InvBody parameters) {
        return new WorkbookFunctionsBeta_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.beta_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2DecRequestBuilder bin2Dec(@Nonnull final WorkbookFunctionsBin2DecBody parameters) {
        return new WorkbookFunctionsBin2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2HexRequestBuilder bin2Hex(@Nonnull final WorkbookFunctionsBin2HexBody parameters) {
        return new WorkbookFunctionsBin2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBin2OctRequestBuilder bin2Oct(@Nonnull final WorkbookFunctionsBin2OctBody parameters) {
        return new WorkbookFunctionsBin2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bin2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_DistRequestBuilder binom_Dist(@Nonnull final WorkbookFunctionsBinom_DistBody parameters) {
        return new WorkbookFunctionsBinom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_Dist_RangeRequestBuilder binom_Dist_Range(@Nonnull final WorkbookFunctionsBinom_Dist_RangeBody parameters) {
        return new WorkbookFunctionsBinom_Dist_RangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Dist_Range"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBinom_InvRequestBuilder binom_Inv(@Nonnull final WorkbookFunctionsBinom_InvBody parameters) {
        return new WorkbookFunctionsBinom_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.binom_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitandRequestBuilder bitand(@Nonnull final WorkbookFunctionsBitandBody parameters) {
        return new WorkbookFunctionsBitandRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitand"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitlshiftRequestBuilder bitlshift(@Nonnull final WorkbookFunctionsBitlshiftBody parameters) {
        return new WorkbookFunctionsBitlshiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitlshift"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitorRequestBuilder bitor(@Nonnull final WorkbookFunctionsBitorBody parameters) {
        return new WorkbookFunctionsBitorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitrshiftRequestBuilder bitrshift(@Nonnull final WorkbookFunctionsBitrshiftBody parameters) {
        return new WorkbookFunctionsBitrshiftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitrshift"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsBitxorRequestBuilder bitxor(@Nonnull final WorkbookFunctionsBitxorBody parameters) {
        return new WorkbookFunctionsBitxorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bitxor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCeiling_MathRequestBuilder ceiling_Math(@Nonnull final WorkbookFunctionsCeiling_MathBody parameters) {
        return new WorkbookFunctionsCeiling_MathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ceiling_Math"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCeiling_PreciseRequestBuilder ceiling_Precise(@Nonnull final WorkbookFunctionsCeiling_PreciseBody parameters) {
        return new WorkbookFunctionsCeiling_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ceiling_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCharRequestBuilder msgraphChar(@Nonnull final WorkbookFunctionsCharBody parameters) {
        return new WorkbookFunctionsCharRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.char"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_DistRequestBuilder chiSq_Dist(@Nonnull final WorkbookFunctionsChiSq_DistBody parameters) {
        return new WorkbookFunctionsChiSq_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_Dist_RTRequestBuilder chiSq_Dist_RT(@Nonnull final WorkbookFunctionsChiSq_Dist_RTBody parameters) {
        return new WorkbookFunctionsChiSq_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_InvRequestBuilder chiSq_Inv(@Nonnull final WorkbookFunctionsChiSq_InvBody parameters) {
        return new WorkbookFunctionsChiSq_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChiSq_Inv_RTRequestBuilder chiSq_Inv_RT(@Nonnull final WorkbookFunctionsChiSq_Inv_RTBody parameters) {
        return new WorkbookFunctionsChiSq_Inv_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.chiSq_Inv_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsChooseRequestBuilder choose(@Nonnull final WorkbookFunctionsChooseBody parameters) {
        return new WorkbookFunctionsChooseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.choose"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCleanRequestBuilder clean(@Nonnull final WorkbookFunctionsCleanBody parameters) {
        return new WorkbookFunctionsCleanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCodeRequestBuilder code(@Nonnull final WorkbookFunctionsCodeBody parameters) {
        return new WorkbookFunctionsCodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.code"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsColumnsRequestBuilder columns(@Nonnull final WorkbookFunctionsColumnsBody parameters) {
        return new WorkbookFunctionsColumnsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.columns"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCombinRequestBuilder combin(@Nonnull final WorkbookFunctionsCombinBody parameters) {
        return new WorkbookFunctionsCombinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.combin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCombinaRequestBuilder combina(@Nonnull final WorkbookFunctionsCombinaBody parameters) {
        return new WorkbookFunctionsCombinaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.combina"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsComplexRequestBuilder complex(@Nonnull final WorkbookFunctionsComplexBody parameters) {
        return new WorkbookFunctionsComplexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.complex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConcatenateRequestBuilder concatenate(@Nonnull final WorkbookFunctionsConcatenateBody parameters) {
        return new WorkbookFunctionsConcatenateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.concatenate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConfidence_NormRequestBuilder confidence_Norm(@Nonnull final WorkbookFunctionsConfidence_NormBody parameters) {
        return new WorkbookFunctionsConfidence_NormRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confidence_Norm"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConfidence_TRequestBuilder confidence_T(@Nonnull final WorkbookFunctionsConfidence_TBody parameters) {
        return new WorkbookFunctionsConfidence_TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confidence_T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsConvertRequestBuilder convert(@Nonnull final WorkbookFunctionsConvertBody parameters) {
        return new WorkbookFunctionsConvertRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.convert"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCosRequestBuilder cos(@Nonnull final WorkbookFunctionsCosBody parameters) {
        return new WorkbookFunctionsCosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoshRequestBuilder cosh(@Nonnull final WorkbookFunctionsCoshBody parameters) {
        return new WorkbookFunctionsCoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCotRequestBuilder cot(@Nonnull final WorkbookFunctionsCotBody parameters) {
        return new WorkbookFunctionsCotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCothRequestBuilder coth(@Nonnull final WorkbookFunctionsCothBody parameters) {
        return new WorkbookFunctionsCothRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountRequestBuilder count(@Nonnull final WorkbookFunctionsCountBody parameters) {
        return new WorkbookFunctionsCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountARequestBuilder countA(@Nonnull final WorkbookFunctionsCountABody parameters) {
        return new WorkbookFunctionsCountARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountBlankRequestBuilder countBlank(@Nonnull final WorkbookFunctionsCountBlankBody parameters) {
        return new WorkbookFunctionsCountBlankRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countBlank"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountIfRequestBuilder countIf(@Nonnull final WorkbookFunctionsCountIfBody parameters) {
        return new WorkbookFunctionsCountIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCountIfsRequestBuilder countIfs(@Nonnull final WorkbookFunctionsCountIfsBody parameters) {
        return new WorkbookFunctionsCountIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.countIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDayBsRequestBuilder coupDayBs(@Nonnull final WorkbookFunctionsCoupDayBsBody parameters) {
        return new WorkbookFunctionsCoupDayBsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDayBs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDaysRequestBuilder coupDays(@Nonnull final WorkbookFunctionsCoupDaysBody parameters) {
        return new WorkbookFunctionsCoupDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDays"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupDaysNcRequestBuilder coupDaysNc(@Nonnull final WorkbookFunctionsCoupDaysNcBody parameters) {
        return new WorkbookFunctionsCoupDaysNcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupDaysNc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupNcdRequestBuilder coupNcd(@Nonnull final WorkbookFunctionsCoupNcdBody parameters) {
        return new WorkbookFunctionsCoupNcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupNcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupNumRequestBuilder coupNum(@Nonnull final WorkbookFunctionsCoupNumBody parameters) {
        return new WorkbookFunctionsCoupNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCoupPcdRequestBuilder coupPcd(@Nonnull final WorkbookFunctionsCoupPcdBody parameters) {
        return new WorkbookFunctionsCoupPcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.coupPcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCscRequestBuilder csc(@Nonnull final WorkbookFunctionsCscBody parameters) {
        return new WorkbookFunctionsCscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.csc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCschRequestBuilder csch(@Nonnull final WorkbookFunctionsCschBody parameters) {
        return new WorkbookFunctionsCschRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.csch"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCumIPmtRequestBuilder cumIPmt(@Nonnull final WorkbookFunctionsCumIPmtBody parameters) {
        return new WorkbookFunctionsCumIPmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cumIPmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsCumPrincRequestBuilder cumPrinc(@Nonnull final WorkbookFunctionsCumPrincBody parameters) {
        return new WorkbookFunctionsCumPrincRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cumPrinc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDateRequestBuilder date(@Nonnull final WorkbookFunctionsDateBody parameters) {
        return new WorkbookFunctionsDateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.date"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDatevalueRequestBuilder datevalue(@Nonnull final WorkbookFunctionsDatevalueBody parameters) {
        return new WorkbookFunctionsDatevalueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.datevalue"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDaverageRequestBuilder daverage(@Nonnull final WorkbookFunctionsDaverageBody parameters) {
        return new WorkbookFunctionsDaverageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.daverage"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDayRequestBuilder day(@Nonnull final WorkbookFunctionsDayBody parameters) {
        return new WorkbookFunctionsDayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.day"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDaysRequestBuilder days(@Nonnull final WorkbookFunctionsDaysBody parameters) {
        return new WorkbookFunctionsDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.days"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDays360RequestBuilder days360(@Nonnull final WorkbookFunctionsDays360Body parameters) {
        return new WorkbookFunctionsDays360RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.days360"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDbRequestBuilder db(@Nonnull final WorkbookFunctionsDbBody parameters) {
        return new WorkbookFunctionsDbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.db"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDbcsRequestBuilder dbcs(@Nonnull final WorkbookFunctionsDbcsBody parameters) {
        return new WorkbookFunctionsDbcsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dbcs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDcountRequestBuilder dcount(@Nonnull final WorkbookFunctionsDcountBody parameters) {
        return new WorkbookFunctionsDcountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dcount"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDcountARequestBuilder dcountA(@Nonnull final WorkbookFunctionsDcountABody parameters) {
        return new WorkbookFunctionsDcountARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dcountA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDdbRequestBuilder ddb(@Nonnull final WorkbookFunctionsDdbBody parameters) {
        return new WorkbookFunctionsDdbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ddb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2BinRequestBuilder dec2Bin(@Nonnull final WorkbookFunctionsDec2BinBody parameters) {
        return new WorkbookFunctionsDec2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2HexRequestBuilder dec2Hex(@Nonnull final WorkbookFunctionsDec2HexBody parameters) {
        return new WorkbookFunctionsDec2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDec2OctRequestBuilder dec2Oct(@Nonnull final WorkbookFunctionsDec2OctBody parameters) {
        return new WorkbookFunctionsDec2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dec2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDecimalRequestBuilder decimal(@Nonnull final WorkbookFunctionsDecimalBody parameters) {
        return new WorkbookFunctionsDecimalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.decimal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDegreesRequestBuilder degrees(@Nonnull final WorkbookFunctionsDegreesBody parameters) {
        return new WorkbookFunctionsDegreesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.degrees"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDevSqRequestBuilder devSq(@Nonnull final WorkbookFunctionsDevSqBody parameters) {
        return new WorkbookFunctionsDevSqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.devSq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDgetRequestBuilder dget(@Nonnull final WorkbookFunctionsDgetBody parameters) {
        return new WorkbookFunctionsDgetRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dget"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDiscRequestBuilder disc(@Nonnull final WorkbookFunctionsDiscBody parameters) {
        return new WorkbookFunctionsDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDmaxRequestBuilder dmax(@Nonnull final WorkbookFunctionsDmaxBody parameters) {
        return new WorkbookFunctionsDmaxRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dmax"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDminRequestBuilder dmin(@Nonnull final WorkbookFunctionsDminBody parameters) {
        return new WorkbookFunctionsDminRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dmin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarRequestBuilder dollar(@Nonnull final WorkbookFunctionsDollarBody parameters) {
        return new WorkbookFunctionsDollarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarDeRequestBuilder dollarDe(@Nonnull final WorkbookFunctionsDollarDeBody parameters) {
        return new WorkbookFunctionsDollarDeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollarDe"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDollarFrRequestBuilder dollarFr(@Nonnull final WorkbookFunctionsDollarFrBody parameters) {
        return new WorkbookFunctionsDollarFrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dollarFr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDproductRequestBuilder dproduct(@Nonnull final WorkbookFunctionsDproductBody parameters) {
        return new WorkbookFunctionsDproductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dproduct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDstDevRequestBuilder dstDev(@Nonnull final WorkbookFunctionsDstDevBody parameters) {
        return new WorkbookFunctionsDstDevRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dstDev"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDstDevPRequestBuilder dstDevP(@Nonnull final WorkbookFunctionsDstDevPBody parameters) {
        return new WorkbookFunctionsDstDevPRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dstDevP"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDsumRequestBuilder dsum(@Nonnull final WorkbookFunctionsDsumBody parameters) {
        return new WorkbookFunctionsDsumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dsum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDurationRequestBuilder duration(@Nonnull final WorkbookFunctionsDurationBody parameters) {
        return new WorkbookFunctionsDurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.duration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDvarRequestBuilder dvar(@Nonnull final WorkbookFunctionsDvarBody parameters) {
        return new WorkbookFunctionsDvarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dvar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsDvarPRequestBuilder dvarP(@Nonnull final WorkbookFunctionsDvarPBody parameters) {
        return new WorkbookFunctionsDvarPRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dvarP"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEcma_CeilingRequestBuilder ecma_Ceiling(@Nonnull final WorkbookFunctionsEcma_CeilingBody parameters) {
        return new WorkbookFunctionsEcma_CeilingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ecma_Ceiling"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEdateRequestBuilder edate(@Nonnull final WorkbookFunctionsEdateBody parameters) {
        return new WorkbookFunctionsEdateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.edate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEffectRequestBuilder effect(@Nonnull final WorkbookFunctionsEffectBody parameters) {
        return new WorkbookFunctionsEffectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.effect"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEoMonthRequestBuilder eoMonth(@Nonnull final WorkbookFunctionsEoMonthBody parameters) {
        return new WorkbookFunctionsEoMonthRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.eoMonth"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfRequestBuilder erf(@Nonnull final WorkbookFunctionsErfBody parameters) {
        return new WorkbookFunctionsErfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfCRequestBuilder erfC(@Nonnull final WorkbookFunctionsErfCBody parameters) {
        return new WorkbookFunctionsErfCRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erfC"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErfC_PreciseRequestBuilder erfC_Precise(@Nonnull final WorkbookFunctionsErfC_PreciseBody parameters) {
        return new WorkbookFunctionsErfC_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erfC_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsErf_PreciseRequestBuilder erf_Precise(@Nonnull final WorkbookFunctionsErf_PreciseBody parameters) {
        return new WorkbookFunctionsErf_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.erf_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsError_TypeRequestBuilder error_Type(@Nonnull final WorkbookFunctionsError_TypeBody parameters) {
        return new WorkbookFunctionsError_TypeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.error_Type"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsEvenRequestBuilder even(@Nonnull final WorkbookFunctionsEvenBody parameters) {
        return new WorkbookFunctionsEvenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.even"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExactRequestBuilder exact(@Nonnull final WorkbookFunctionsExactBody parameters) {
        return new WorkbookFunctionsExactRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exact"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExpRequestBuilder exp(@Nonnull final WorkbookFunctionsExpBody parameters) {
        return new WorkbookFunctionsExpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsExpon_DistRequestBuilder expon_Dist(@Nonnull final WorkbookFunctionsExpon_DistBody parameters) {
        return new WorkbookFunctionsExpon_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.expon_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFactRequestBuilder fact(@Nonnull final WorkbookFunctionsFactBody parameters) {
        return new WorkbookFunctionsFactRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fact"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFactDoubleRequestBuilder factDouble(@Nonnull final WorkbookFunctionsFactDoubleBody parameters) {
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
    public WorkbookFunctionsFindRequestBuilder find(@Nonnull final WorkbookFunctionsFindBody parameters) {
        return new WorkbookFunctionsFindRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.find"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFindBRequestBuilder findB(@Nonnull final WorkbookFunctionsFindBBody parameters) {
        return new WorkbookFunctionsFindBRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findB"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFisherRequestBuilder fisher(@Nonnull final WorkbookFunctionsFisherBody parameters) {
        return new WorkbookFunctionsFisherRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fisher"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFisherInvRequestBuilder fisherInv(@Nonnull final WorkbookFunctionsFisherInvBody parameters) {
        return new WorkbookFunctionsFisherInvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fisherInv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFixedRequestBuilder fixed(@Nonnull final WorkbookFunctionsFixedBody parameters) {
        return new WorkbookFunctionsFixedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fixed"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFloor_MathRequestBuilder floor_Math(@Nonnull final WorkbookFunctionsFloor_MathBody parameters) {
        return new WorkbookFunctionsFloor_MathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.floor_Math"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFloor_PreciseRequestBuilder floor_Precise(@Nonnull final WorkbookFunctionsFloor_PreciseBody parameters) {
        return new WorkbookFunctionsFloor_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.floor_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFvRequestBuilder fv(@Nonnull final WorkbookFunctionsFvBody parameters) {
        return new WorkbookFunctionsFvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsFvscheduleRequestBuilder fvschedule(@Nonnull final WorkbookFunctionsFvscheduleBody parameters) {
        return new WorkbookFunctionsFvscheduleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.fvschedule"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_DistRequestBuilder f_Dist(@Nonnull final WorkbookFunctionsF_DistBody parameters) {
        return new WorkbookFunctionsF_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_Dist_RTRequestBuilder f_Dist_RT(@Nonnull final WorkbookFunctionsF_Dist_RTBody parameters) {
        return new WorkbookFunctionsF_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_InvRequestBuilder f_Inv(@Nonnull final WorkbookFunctionsF_InvBody parameters) {
        return new WorkbookFunctionsF_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsF_Inv_RTRequestBuilder f_Inv_RT(@Nonnull final WorkbookFunctionsF_Inv_RTBody parameters) {
        return new WorkbookFunctionsF_Inv_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.f_Inv_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaRequestBuilder gamma(@Nonnull final WorkbookFunctionsGammaBody parameters) {
        return new WorkbookFunctionsGammaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaLnRequestBuilder gammaLn(@Nonnull final WorkbookFunctionsGammaLnBody parameters) {
        return new WorkbookFunctionsGammaLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gammaLn"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGammaLn_PreciseRequestBuilder gammaLn_Precise(@Nonnull final WorkbookFunctionsGammaLn_PreciseBody parameters) {
        return new WorkbookFunctionsGammaLn_PreciseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gammaLn_Precise"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGamma_DistRequestBuilder gamma_Dist(@Nonnull final WorkbookFunctionsGamma_DistBody parameters) {
        return new WorkbookFunctionsGamma_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGamma_InvRequestBuilder gamma_Inv(@Nonnull final WorkbookFunctionsGamma_InvBody parameters) {
        return new WorkbookFunctionsGamma_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gamma_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGaussRequestBuilder gauss(@Nonnull final WorkbookFunctionsGaussBody parameters) {
        return new WorkbookFunctionsGaussRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gauss"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGcdRequestBuilder gcd(@Nonnull final WorkbookFunctionsGcdBody parameters) {
        return new WorkbookFunctionsGcdRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.gcd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGeoMeanRequestBuilder geoMean(@Nonnull final WorkbookFunctionsGeoMeanBody parameters) {
        return new WorkbookFunctionsGeoMeanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.geoMean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsGeStepRequestBuilder geStep(@Nonnull final WorkbookFunctionsGeStepBody parameters) {
        return new WorkbookFunctionsGeStepRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.geStep"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHarMeanRequestBuilder harMean(@Nonnull final WorkbookFunctionsHarMeanBody parameters) {
        return new WorkbookFunctionsHarMeanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.harMean"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2BinRequestBuilder hex2Bin(@Nonnull final WorkbookFunctionsHex2BinBody parameters) {
        return new WorkbookFunctionsHex2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2DecRequestBuilder hex2Dec(@Nonnull final WorkbookFunctionsHex2DecBody parameters) {
        return new WorkbookFunctionsHex2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHex2OctRequestBuilder hex2Oct(@Nonnull final WorkbookFunctionsHex2OctBody parameters) {
        return new WorkbookFunctionsHex2OctRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hex2Oct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHlookupRequestBuilder hlookup(@Nonnull final WorkbookFunctionsHlookupBody parameters) {
        return new WorkbookFunctionsHlookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hlookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHourRequestBuilder hour(@Nonnull final WorkbookFunctionsHourBody parameters) {
        return new WorkbookFunctionsHourRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hour"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHyperlinkRequestBuilder hyperlink(@Nonnull final WorkbookFunctionsHyperlinkBody parameters) {
        return new WorkbookFunctionsHyperlinkRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hyperlink"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsHypGeom_DistRequestBuilder hypGeom_Dist(@Nonnull final WorkbookFunctionsHypGeom_DistBody parameters) {
        return new WorkbookFunctionsHypGeom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hypGeom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIfRequestBuilder msgraphIf(@Nonnull final WorkbookFunctionsIfBody parameters) {
        return new WorkbookFunctionsIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.if"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImAbsRequestBuilder imAbs(@Nonnull final WorkbookFunctionsImAbsBody parameters) {
        return new WorkbookFunctionsImAbsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imAbs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImaginaryRequestBuilder imaginary(@Nonnull final WorkbookFunctionsImaginaryBody parameters) {
        return new WorkbookFunctionsImaginaryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imaginary"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImArgumentRequestBuilder imArgument(@Nonnull final WorkbookFunctionsImArgumentBody parameters) {
        return new WorkbookFunctionsImArgumentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imArgument"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImConjugateRequestBuilder imConjugate(@Nonnull final WorkbookFunctionsImConjugateBody parameters) {
        return new WorkbookFunctionsImConjugateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imConjugate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCosRequestBuilder imCos(@Nonnull final WorkbookFunctionsImCosBody parameters) {
        return new WorkbookFunctionsImCosRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCos"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCoshRequestBuilder imCosh(@Nonnull final WorkbookFunctionsImCoshBody parameters) {
        return new WorkbookFunctionsImCoshRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCosh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCotRequestBuilder imCot(@Nonnull final WorkbookFunctionsImCotBody parameters) {
        return new WorkbookFunctionsImCotRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCot"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCscRequestBuilder imCsc(@Nonnull final WorkbookFunctionsImCscBody parameters) {
        return new WorkbookFunctionsImCscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCsc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImCschRequestBuilder imCsch(@Nonnull final WorkbookFunctionsImCschBody parameters) {
        return new WorkbookFunctionsImCschRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imCsch"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImDivRequestBuilder imDiv(@Nonnull final WorkbookFunctionsImDivBody parameters) {
        return new WorkbookFunctionsImDivRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imDiv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImExpRequestBuilder imExp(@Nonnull final WorkbookFunctionsImExpBody parameters) {
        return new WorkbookFunctionsImExpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imExp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLnRequestBuilder imLn(@Nonnull final WorkbookFunctionsImLnBody parameters) {
        return new WorkbookFunctionsImLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLn"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLog10RequestBuilder imLog10(@Nonnull final WorkbookFunctionsImLog10Body parameters) {
        return new WorkbookFunctionsImLog10RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLog10"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImLog2RequestBuilder imLog2(@Nonnull final WorkbookFunctionsImLog2Body parameters) {
        return new WorkbookFunctionsImLog2RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imLog2"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImPowerRequestBuilder imPower(@Nonnull final WorkbookFunctionsImPowerBody parameters) {
        return new WorkbookFunctionsImPowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imPower"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImProductRequestBuilder imProduct(@Nonnull final WorkbookFunctionsImProductBody parameters) {
        return new WorkbookFunctionsImProductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imProduct"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImRealRequestBuilder imReal(@Nonnull final WorkbookFunctionsImRealBody parameters) {
        return new WorkbookFunctionsImRealRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imReal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSecRequestBuilder imSec(@Nonnull final WorkbookFunctionsImSecBody parameters) {
        return new WorkbookFunctionsImSecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSechRequestBuilder imSech(@Nonnull final WorkbookFunctionsImSechBody parameters) {
        return new WorkbookFunctionsImSechRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSech"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSinRequestBuilder imSin(@Nonnull final WorkbookFunctionsImSinBody parameters) {
        return new WorkbookFunctionsImSinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSinhRequestBuilder imSinh(@Nonnull final WorkbookFunctionsImSinhBody parameters) {
        return new WorkbookFunctionsImSinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSqrtRequestBuilder imSqrt(@Nonnull final WorkbookFunctionsImSqrtBody parameters) {
        return new WorkbookFunctionsImSqrtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSqrt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSubRequestBuilder imSub(@Nonnull final WorkbookFunctionsImSubBody parameters) {
        return new WorkbookFunctionsImSubRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSub"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImSumRequestBuilder imSum(@Nonnull final WorkbookFunctionsImSumBody parameters) {
        return new WorkbookFunctionsImSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imSum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsImTanRequestBuilder imTan(@Nonnull final WorkbookFunctionsImTanBody parameters) {
        return new WorkbookFunctionsImTanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.imTan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIntRequestBuilder msgraphInt(@Nonnull final WorkbookFunctionsIntBody parameters) {
        return new WorkbookFunctionsIntRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.int"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIntRateRequestBuilder intRate(@Nonnull final WorkbookFunctionsIntRateBody parameters) {
        return new WorkbookFunctionsIntRateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.intRate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIpmtRequestBuilder ipmt(@Nonnull final WorkbookFunctionsIpmtBody parameters) {
        return new WorkbookFunctionsIpmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ipmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIrrRequestBuilder irr(@Nonnull final WorkbookFunctionsIrrBody parameters) {
        return new WorkbookFunctionsIrrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.irr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsErrRequestBuilder isErr(@Nonnull final WorkbookFunctionsIsErrBody parameters) {
        return new WorkbookFunctionsIsErrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isErr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsErrorRequestBuilder isError(@Nonnull final WorkbookFunctionsIsErrorBody parameters) {
        return new WorkbookFunctionsIsErrorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isError"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsEvenRequestBuilder isEven(@Nonnull final WorkbookFunctionsIsEvenBody parameters) {
        return new WorkbookFunctionsIsEvenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isEven"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsFormulaRequestBuilder isFormula(@Nonnull final WorkbookFunctionsIsFormulaBody parameters) {
        return new WorkbookFunctionsIsFormulaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isFormula"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsLogicalRequestBuilder isLogical(@Nonnull final WorkbookFunctionsIsLogicalBody parameters) {
        return new WorkbookFunctionsIsLogicalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isLogical"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNARequestBuilder isNA(@Nonnull final WorkbookFunctionsIsNABody parameters) {
        return new WorkbookFunctionsIsNARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNonTextRequestBuilder isNonText(@Nonnull final WorkbookFunctionsIsNonTextBody parameters) {
        return new WorkbookFunctionsIsNonTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNonText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsNumberRequestBuilder isNumber(@Nonnull final WorkbookFunctionsIsNumberBody parameters) {
        return new WorkbookFunctionsIsNumberRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isNumber"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsOddRequestBuilder isOdd(@Nonnull final WorkbookFunctionsIsOddBody parameters) {
        return new WorkbookFunctionsIsOddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isOdd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsoWeekNumRequestBuilder isoWeekNum(@Nonnull final WorkbookFunctionsIsoWeekNumBody parameters) {
        return new WorkbookFunctionsIsoWeekNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isoWeekNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIso_CeilingRequestBuilder iso_Ceiling(@Nonnull final WorkbookFunctionsIso_CeilingBody parameters) {
        return new WorkbookFunctionsIso_CeilingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.iso_Ceiling"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIspmtRequestBuilder ispmt(@Nonnull final WorkbookFunctionsIspmtBody parameters) {
        return new WorkbookFunctionsIspmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ispmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsrefRequestBuilder isref(@Nonnull final WorkbookFunctionsIsrefBody parameters) {
        return new WorkbookFunctionsIsrefRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isref"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsIsTextRequestBuilder isText(@Nonnull final WorkbookFunctionsIsTextBody parameters) {
        return new WorkbookFunctionsIsTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isText"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsKurtRequestBuilder kurt(@Nonnull final WorkbookFunctionsKurtBody parameters) {
        return new WorkbookFunctionsKurtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.kurt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLargeRequestBuilder large(@Nonnull final WorkbookFunctionsLargeBody parameters) {
        return new WorkbookFunctionsLargeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.large"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLcmRequestBuilder lcm(@Nonnull final WorkbookFunctionsLcmBody parameters) {
        return new WorkbookFunctionsLcmRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lcm"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLeftRequestBuilder left(@Nonnull final WorkbookFunctionsLeftBody parameters) {
        return new WorkbookFunctionsLeftRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.left"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLeftbRequestBuilder leftb(@Nonnull final WorkbookFunctionsLeftbBody parameters) {
        return new WorkbookFunctionsLeftbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.leftb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLenRequestBuilder len(@Nonnull final WorkbookFunctionsLenBody parameters) {
        return new WorkbookFunctionsLenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.len"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLenbRequestBuilder lenb(@Nonnull final WorkbookFunctionsLenbBody parameters) {
        return new WorkbookFunctionsLenbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lenb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLnRequestBuilder ln(@Nonnull final WorkbookFunctionsLnBody parameters) {
        return new WorkbookFunctionsLnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ln"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogRequestBuilder log(@Nonnull final WorkbookFunctionsLogBody parameters) {
        return new WorkbookFunctionsLogRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.log"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLog10RequestBuilder log10(@Nonnull final WorkbookFunctionsLog10Body parameters) {
        return new WorkbookFunctionsLog10RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.log10"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_DistRequestBuilder logNorm_Dist(@Nonnull final WorkbookFunctionsLogNorm_DistBody parameters) {
        return new WorkbookFunctionsLogNorm_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logNorm_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLogNorm_InvRequestBuilder logNorm_Inv(@Nonnull final WorkbookFunctionsLogNorm_InvBody parameters) {
        return new WorkbookFunctionsLogNorm_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logNorm_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLookupRequestBuilder lookup(@Nonnull final WorkbookFunctionsLookupBody parameters) {
        return new WorkbookFunctionsLookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsLowerRequestBuilder lower(@Nonnull final WorkbookFunctionsLowerBody parameters) {
        return new WorkbookFunctionsLowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lower"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMatchRequestBuilder match(@Nonnull final WorkbookFunctionsMatchBody parameters) {
        return new WorkbookFunctionsMatchRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.match"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMaxRequestBuilder max(@Nonnull final WorkbookFunctionsMaxBody parameters) {
        return new WorkbookFunctionsMaxRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.max"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMaxARequestBuilder maxA(@Nonnull final WorkbookFunctionsMaxABody parameters) {
        return new WorkbookFunctionsMaxARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.maxA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMdurationRequestBuilder mduration(@Nonnull final WorkbookFunctionsMdurationBody parameters) {
        return new WorkbookFunctionsMdurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mduration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMedianRequestBuilder median(@Nonnull final WorkbookFunctionsMedianBody parameters) {
        return new WorkbookFunctionsMedianRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.median"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMidRequestBuilder mid(@Nonnull final WorkbookFunctionsMidBody parameters) {
        return new WorkbookFunctionsMidRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mid"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMidbRequestBuilder midb(@Nonnull final WorkbookFunctionsMidbBody parameters) {
        return new WorkbookFunctionsMidbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.midb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinRequestBuilder min(@Nonnull final WorkbookFunctionsMinBody parameters) {
        return new WorkbookFunctionsMinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.min"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinARequestBuilder minA(@Nonnull final WorkbookFunctionsMinABody parameters) {
        return new WorkbookFunctionsMinARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.minA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMinuteRequestBuilder minute(@Nonnull final WorkbookFunctionsMinuteBody parameters) {
        return new WorkbookFunctionsMinuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.minute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMirrRequestBuilder mirr(@Nonnull final WorkbookFunctionsMirrBody parameters) {
        return new WorkbookFunctionsMirrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mirr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsModRequestBuilder mod(@Nonnull final WorkbookFunctionsModBody parameters) {
        return new WorkbookFunctionsModRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mod"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMonthRequestBuilder month(@Nonnull final WorkbookFunctionsMonthBody parameters) {
        return new WorkbookFunctionsMonthRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.month"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMroundRequestBuilder mround(@Nonnull final WorkbookFunctionsMroundBody parameters) {
        return new WorkbookFunctionsMroundRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mround"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsMultiNomialRequestBuilder multiNomial(@Nonnull final WorkbookFunctionsMultiNomialBody parameters) {
        return new WorkbookFunctionsMultiNomialRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.multiNomial"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNRequestBuilder n(@Nonnull final WorkbookFunctionsNBody parameters) {
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
    public WorkbookFunctionsNegBinom_DistRequestBuilder negBinom_Dist(@Nonnull final WorkbookFunctionsNegBinom_DistBody parameters) {
        return new WorkbookFunctionsNegBinom_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.negBinom_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNetworkDaysRequestBuilder networkDays(@Nonnull final WorkbookFunctionsNetworkDaysBody parameters) {
        return new WorkbookFunctionsNetworkDaysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.networkDays"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNetworkDays_IntlRequestBuilder networkDays_Intl(@Nonnull final WorkbookFunctionsNetworkDays_IntlBody parameters) {
        return new WorkbookFunctionsNetworkDays_IntlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.networkDays_Intl"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNominalRequestBuilder nominal(@Nonnull final WorkbookFunctionsNominalBody parameters) {
        return new WorkbookFunctionsNominalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.nominal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_DistRequestBuilder norm_Dist(@Nonnull final WorkbookFunctionsNorm_DistBody parameters) {
        return new WorkbookFunctionsNorm_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_InvRequestBuilder norm_Inv(@Nonnull final WorkbookFunctionsNorm_InvBody parameters) {
        return new WorkbookFunctionsNorm_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_DistRequestBuilder norm_S_Dist(@Nonnull final WorkbookFunctionsNorm_S_DistBody parameters) {
        return new WorkbookFunctionsNorm_S_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_S_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNorm_S_InvRequestBuilder norm_S_Inv(@Nonnull final WorkbookFunctionsNorm_S_InvBody parameters) {
        return new WorkbookFunctionsNorm_S_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.norm_S_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNotRequestBuilder not(@Nonnull final WorkbookFunctionsNotBody parameters) {
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
    public WorkbookFunctionsNperRequestBuilder nper(@Nonnull final WorkbookFunctionsNperBody parameters) {
        return new WorkbookFunctionsNperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.nper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNpvRequestBuilder npv(@Nonnull final WorkbookFunctionsNpvBody parameters) {
        return new WorkbookFunctionsNpvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.npv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsNumberValueRequestBuilder numberValue(@Nonnull final WorkbookFunctionsNumberValueBody parameters) {
        return new WorkbookFunctionsNumberValueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.numberValue"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2BinRequestBuilder oct2Bin(@Nonnull final WorkbookFunctionsOct2BinBody parameters) {
        return new WorkbookFunctionsOct2BinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Bin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2DecRequestBuilder oct2Dec(@Nonnull final WorkbookFunctionsOct2DecBody parameters) {
        return new WorkbookFunctionsOct2DecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Dec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOct2HexRequestBuilder oct2Hex(@Nonnull final WorkbookFunctionsOct2HexBody parameters) {
        return new WorkbookFunctionsOct2HexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oct2Hex"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddRequestBuilder odd(@Nonnull final WorkbookFunctionsOddBody parameters) {
        return new WorkbookFunctionsOddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.odd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddFPriceRequestBuilder oddFPrice(@Nonnull final WorkbookFunctionsOddFPriceBody parameters) {
        return new WorkbookFunctionsOddFPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddFPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddFYieldRequestBuilder oddFYield(@Nonnull final WorkbookFunctionsOddFYieldBody parameters) {
        return new WorkbookFunctionsOddFYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddFYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddLPriceRequestBuilder oddLPrice(@Nonnull final WorkbookFunctionsOddLPriceBody parameters) {
        return new WorkbookFunctionsOddLPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddLPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOddLYieldRequestBuilder oddLYield(@Nonnull final WorkbookFunctionsOddLYieldBody parameters) {
        return new WorkbookFunctionsOddLYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.oddLYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsOrRequestBuilder or(@Nonnull final WorkbookFunctionsOrBody parameters) {
        return new WorkbookFunctionsOrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.or"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPdurationRequestBuilder pduration(@Nonnull final WorkbookFunctionsPdurationBody parameters) {
        return new WorkbookFunctionsPdurationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pduration"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentile_ExcRequestBuilder percentile_Exc(@Nonnull final WorkbookFunctionsPercentile_ExcBody parameters) {
        return new WorkbookFunctionsPercentile_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentile_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentile_IncRequestBuilder percentile_Inc(@Nonnull final WorkbookFunctionsPercentile_IncBody parameters) {
        return new WorkbookFunctionsPercentile_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentile_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentRank_ExcRequestBuilder percentRank_Exc(@Nonnull final WorkbookFunctionsPercentRank_ExcBody parameters) {
        return new WorkbookFunctionsPercentRank_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentRank_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPercentRank_IncRequestBuilder percentRank_Inc(@Nonnull final WorkbookFunctionsPercentRank_IncBody parameters) {
        return new WorkbookFunctionsPercentRank_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.percentRank_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPermutRequestBuilder permut(@Nonnull final WorkbookFunctionsPermutBody parameters) {
        return new WorkbookFunctionsPermutRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.permut"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPermutationaRequestBuilder permutationa(@Nonnull final WorkbookFunctionsPermutationaBody parameters) {
        return new WorkbookFunctionsPermutationaRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.permutationa"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPhiRequestBuilder phi(@Nonnull final WorkbookFunctionsPhiBody parameters) {
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
    public WorkbookFunctionsPmtRequestBuilder pmt(@Nonnull final WorkbookFunctionsPmtBody parameters) {
        return new WorkbookFunctionsPmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPoisson_DistRequestBuilder poisson_Dist(@Nonnull final WorkbookFunctionsPoisson_DistBody parameters) {
        return new WorkbookFunctionsPoisson_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.poisson_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPowerRequestBuilder power(@Nonnull final WorkbookFunctionsPowerBody parameters) {
        return new WorkbookFunctionsPowerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.power"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPpmtRequestBuilder ppmt(@Nonnull final WorkbookFunctionsPpmtBody parameters) {
        return new WorkbookFunctionsPpmtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ppmt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceRequestBuilder price(@Nonnull final WorkbookFunctionsPriceBody parameters) {
        return new WorkbookFunctionsPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.price"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceDiscRequestBuilder priceDisc(@Nonnull final WorkbookFunctionsPriceDiscBody parameters) {
        return new WorkbookFunctionsPriceDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.priceDisc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPriceMatRequestBuilder priceMat(@Nonnull final WorkbookFunctionsPriceMatBody parameters) {
        return new WorkbookFunctionsPriceMatRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.priceMat"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsProductRequestBuilder product(@Nonnull final WorkbookFunctionsProductBody parameters) {
        return new WorkbookFunctionsProductRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.product"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsProperRequestBuilder proper(@Nonnull final WorkbookFunctionsProperBody parameters) {
        return new WorkbookFunctionsProperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.proper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsPvRequestBuilder pv(@Nonnull final WorkbookFunctionsPvBody parameters) {
        return new WorkbookFunctionsPvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.pv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuartile_ExcRequestBuilder quartile_Exc(@Nonnull final WorkbookFunctionsQuartile_ExcBody parameters) {
        return new WorkbookFunctionsQuartile_ExcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quartile_Exc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuartile_IncRequestBuilder quartile_Inc(@Nonnull final WorkbookFunctionsQuartile_IncBody parameters) {
        return new WorkbookFunctionsQuartile_IncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quartile_Inc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsQuotientRequestBuilder quotient(@Nonnull final WorkbookFunctionsQuotientBody parameters) {
        return new WorkbookFunctionsQuotientRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.quotient"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRadiansRequestBuilder radians(@Nonnull final WorkbookFunctionsRadiansBody parameters) {
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
    public WorkbookFunctionsRandBetweenRequestBuilder randBetween(@Nonnull final WorkbookFunctionsRandBetweenBody parameters) {
        return new WorkbookFunctionsRandBetweenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.randBetween"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRank_AvgRequestBuilder rank_Avg(@Nonnull final WorkbookFunctionsRank_AvgBody parameters) {
        return new WorkbookFunctionsRank_AvgRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rank_Avg"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRank_EqRequestBuilder rank_Eq(@Nonnull final WorkbookFunctionsRank_EqBody parameters) {
        return new WorkbookFunctionsRank_EqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rank_Eq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRateRequestBuilder rate(@Nonnull final WorkbookFunctionsRateBody parameters) {
        return new WorkbookFunctionsRateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rate"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReceivedRequestBuilder received(@Nonnull final WorkbookFunctionsReceivedBody parameters) {
        return new WorkbookFunctionsReceivedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.received"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReplaceRequestBuilder replace(@Nonnull final WorkbookFunctionsReplaceBody parameters) {
        return new WorkbookFunctionsReplaceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replace"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReplaceBRequestBuilder replaceB(@Nonnull final WorkbookFunctionsReplaceBBody parameters) {
        return new WorkbookFunctionsReplaceBRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replaceB"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsReptRequestBuilder rept(@Nonnull final WorkbookFunctionsReptBody parameters) {
        return new WorkbookFunctionsReptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rept"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRightRequestBuilder right(@Nonnull final WorkbookFunctionsRightBody parameters) {
        return new WorkbookFunctionsRightRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.right"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRightbRequestBuilder rightb(@Nonnull final WorkbookFunctionsRightbBody parameters) {
        return new WorkbookFunctionsRightbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rightb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRomanRequestBuilder roman(@Nonnull final WorkbookFunctionsRomanBody parameters) {
        return new WorkbookFunctionsRomanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roman"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundRequestBuilder round(@Nonnull final WorkbookFunctionsRoundBody parameters) {
        return new WorkbookFunctionsRoundRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.round"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundDownRequestBuilder roundDown(@Nonnull final WorkbookFunctionsRoundDownBody parameters) {
        return new WorkbookFunctionsRoundDownRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roundDown"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRoundUpRequestBuilder roundUp(@Nonnull final WorkbookFunctionsRoundUpBody parameters) {
        return new WorkbookFunctionsRoundUpRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.roundUp"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRowsRequestBuilder rows(@Nonnull final WorkbookFunctionsRowsBody parameters) {
        return new WorkbookFunctionsRowsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rows"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsRriRequestBuilder rri(@Nonnull final WorkbookFunctionsRriBody parameters) {
        return new WorkbookFunctionsRriRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rri"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSecRequestBuilder sec(@Nonnull final WorkbookFunctionsSecBody parameters) {
        return new WorkbookFunctionsSecRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sec"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSechRequestBuilder sech(@Nonnull final WorkbookFunctionsSechBody parameters) {
        return new WorkbookFunctionsSechRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sech"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSecondRequestBuilder second(@Nonnull final WorkbookFunctionsSecondBody parameters) {
        return new WorkbookFunctionsSecondRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.second"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSeriesSumRequestBuilder seriesSum(@Nonnull final WorkbookFunctionsSeriesSumBody parameters) {
        return new WorkbookFunctionsSeriesSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.seriesSum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSheetRequestBuilder sheet(@Nonnull final WorkbookFunctionsSheetBody parameters) {
        return new WorkbookFunctionsSheetRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sheet"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSheetsRequestBuilder sheets(@Nonnull final WorkbookFunctionsSheetsBody parameters) {
        return new WorkbookFunctionsSheetsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sheets"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSignRequestBuilder sign(@Nonnull final WorkbookFunctionsSignBody parameters) {
        return new WorkbookFunctionsSignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSinRequestBuilder sin(@Nonnull final WorkbookFunctionsSinBody parameters) {
        return new WorkbookFunctionsSinRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sin"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSinhRequestBuilder sinh(@Nonnull final WorkbookFunctionsSinhBody parameters) {
        return new WorkbookFunctionsSinhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sinh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSkewRequestBuilder skew(@Nonnull final WorkbookFunctionsSkewBody parameters) {
        return new WorkbookFunctionsSkewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.skew"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSkew_pRequestBuilder skew_p(@Nonnull final WorkbookFunctionsSkew_pBody parameters) {
        return new WorkbookFunctionsSkew_pRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.skew_p"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSlnRequestBuilder sln(@Nonnull final WorkbookFunctionsSlnBody parameters) {
        return new WorkbookFunctionsSlnRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sln"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSmallRequestBuilder small(@Nonnull final WorkbookFunctionsSmallBody parameters) {
        return new WorkbookFunctionsSmallRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.small"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSqrtRequestBuilder sqrt(@Nonnull final WorkbookFunctionsSqrtBody parameters) {
        return new WorkbookFunctionsSqrtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sqrt"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSqrtPiRequestBuilder sqrtPi(@Nonnull final WorkbookFunctionsSqrtPiBody parameters) {
        return new WorkbookFunctionsSqrtPiRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sqrtPi"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStandardizeRequestBuilder standardize(@Nonnull final WorkbookFunctionsStandardizeBody parameters) {
        return new WorkbookFunctionsStandardizeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.standardize"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDevARequestBuilder stDevA(@Nonnull final WorkbookFunctionsStDevABody parameters) {
        return new WorkbookFunctionsStDevARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDevA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDevPARequestBuilder stDevPA(@Nonnull final WorkbookFunctionsStDevPABody parameters) {
        return new WorkbookFunctionsStDevPARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDevPA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDev_PRequestBuilder stDev_P(@Nonnull final WorkbookFunctionsStDev_PBody parameters) {
        return new WorkbookFunctionsStDev_PRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDev_P"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsStDev_SRequestBuilder stDev_S(@Nonnull final WorkbookFunctionsStDev_SBody parameters) {
        return new WorkbookFunctionsStDev_SRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stDev_S"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSubstituteRequestBuilder substitute(@Nonnull final WorkbookFunctionsSubstituteBody parameters) {
        return new WorkbookFunctionsSubstituteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.substitute"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSubtotalRequestBuilder subtotal(@Nonnull final WorkbookFunctionsSubtotalBody parameters) {
        return new WorkbookFunctionsSubtotalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subtotal"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumRequestBuilder sum(@Nonnull final WorkbookFunctionsSumBody parameters) {
        return new WorkbookFunctionsSumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumIfRequestBuilder sumIf(@Nonnull final WorkbookFunctionsSumIfBody parameters) {
        return new WorkbookFunctionsSumIfRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumIf"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumIfsRequestBuilder sumIfs(@Nonnull final WorkbookFunctionsSumIfsBody parameters) {
        return new WorkbookFunctionsSumIfsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumIfs"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSumSqRequestBuilder sumSq(@Nonnull final WorkbookFunctionsSumSqBody parameters) {
        return new WorkbookFunctionsSumSqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sumSq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsSydRequestBuilder syd(@Nonnull final WorkbookFunctionsSydBody parameters) {
        return new WorkbookFunctionsSydRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syd"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTRequestBuilder t(@Nonnull final WorkbookFunctionsTBody parameters) {
        return new WorkbookFunctionsTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTanRequestBuilder tan(@Nonnull final WorkbookFunctionsTanBody parameters) {
        return new WorkbookFunctionsTanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTanhRequestBuilder tanh(@Nonnull final WorkbookFunctionsTanhBody parameters) {
        return new WorkbookFunctionsTanhRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tanh"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillEqRequestBuilder tbillEq(@Nonnull final WorkbookFunctionsTbillEqBody parameters) {
        return new WorkbookFunctionsTbillEqRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillEq"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillPriceRequestBuilder tbillPrice(@Nonnull final WorkbookFunctionsTbillPriceBody parameters) {
        return new WorkbookFunctionsTbillPriceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillPrice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTbillYieldRequestBuilder tbillYield(@Nonnull final WorkbookFunctionsTbillYieldBody parameters) {
        return new WorkbookFunctionsTbillYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.tbillYield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTextRequestBuilder text(@Nonnull final WorkbookFunctionsTextBody parameters) {
        return new WorkbookFunctionsTextRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.text"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTimeRequestBuilder time(@Nonnull final WorkbookFunctionsTimeBody parameters) {
        return new WorkbookFunctionsTimeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.time"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTimevalueRequestBuilder timevalue(@Nonnull final WorkbookFunctionsTimevalueBody parameters) {
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
    public WorkbookFunctionsTrimRequestBuilder trim(@Nonnull final WorkbookFunctionsTrimBody parameters) {
        return new WorkbookFunctionsTrimRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.trim"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTrimMeanRequestBuilder trimMean(@Nonnull final WorkbookFunctionsTrimMeanBody parameters) {
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
    public WorkbookFunctionsTruncRequestBuilder trunc(@Nonnull final WorkbookFunctionsTruncBody parameters) {
        return new WorkbookFunctionsTruncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.trunc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsTypeRequestBuilder type(@Nonnull final WorkbookFunctionsTypeBody parameters) {
        return new WorkbookFunctionsTypeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.type"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_DistRequestBuilder t_Dist(@Nonnull final WorkbookFunctionsT_DistBody parameters) {
        return new WorkbookFunctionsT_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Dist_2TRequestBuilder t_Dist_2T(@Nonnull final WorkbookFunctionsT_Dist_2TBody parameters) {
        return new WorkbookFunctionsT_Dist_2TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist_2T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Dist_RTRequestBuilder t_Dist_RT(@Nonnull final WorkbookFunctionsT_Dist_RTBody parameters) {
        return new WorkbookFunctionsT_Dist_RTRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Dist_RT"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_InvRequestBuilder t_Inv(@Nonnull final WorkbookFunctionsT_InvBody parameters) {
        return new WorkbookFunctionsT_InvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Inv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsT_Inv_2TRequestBuilder t_Inv_2T(@Nonnull final WorkbookFunctionsT_Inv_2TBody parameters) {
        return new WorkbookFunctionsT_Inv_2TRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.t_Inv_2T"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUnicharRequestBuilder unichar(@Nonnull final WorkbookFunctionsUnicharBody parameters) {
        return new WorkbookFunctionsUnicharRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unichar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUnicodeRequestBuilder unicode(@Nonnull final WorkbookFunctionsUnicodeBody parameters) {
        return new WorkbookFunctionsUnicodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unicode"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUpperRequestBuilder upper(@Nonnull final WorkbookFunctionsUpperBody parameters) {
        return new WorkbookFunctionsUpperRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.upper"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsUsdollarRequestBuilder usdollar(@Nonnull final WorkbookFunctionsUsdollarBody parameters) {
        return new WorkbookFunctionsUsdollarRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usdollar"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsValueRequestBuilder value(@Nonnull final WorkbookFunctionsValueBody parameters) {
        return new WorkbookFunctionsValueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.value"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVarARequestBuilder varA(@Nonnull final WorkbookFunctionsVarABody parameters) {
        return new WorkbookFunctionsVarARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.varA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVarPARequestBuilder varPA(@Nonnull final WorkbookFunctionsVarPABody parameters) {
        return new WorkbookFunctionsVarPARequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.varPA"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVar_PRequestBuilder var_P(@Nonnull final WorkbookFunctionsVar_PBody parameters) {
        return new WorkbookFunctionsVar_PRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.var_P"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVar_SRequestBuilder var_S(@Nonnull final WorkbookFunctionsVar_SBody parameters) {
        return new WorkbookFunctionsVar_SRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.var_S"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVdbRequestBuilder vdb(@Nonnull final WorkbookFunctionsVdbBody parameters) {
        return new WorkbookFunctionsVdbRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.vdb"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsVlookupRequestBuilder vlookup(@Nonnull final WorkbookFunctionsVlookupBody parameters) {
        return new WorkbookFunctionsVlookupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.vlookup"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeekdayRequestBuilder weekday(@Nonnull final WorkbookFunctionsWeekdayBody parameters) {
        return new WorkbookFunctionsWeekdayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weekday"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeekNumRequestBuilder weekNum(@Nonnull final WorkbookFunctionsWeekNumBody parameters) {
        return new WorkbookFunctionsWeekNumRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weekNum"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWeibull_DistRequestBuilder weibull_Dist(@Nonnull final WorkbookFunctionsWeibull_DistBody parameters) {
        return new WorkbookFunctionsWeibull_DistRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.weibull_Dist"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWorkDayRequestBuilder workDay(@Nonnull final WorkbookFunctionsWorkDayBody parameters) {
        return new WorkbookFunctionsWorkDayRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.workDay"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsWorkDay_IntlRequestBuilder workDay_Intl(@Nonnull final WorkbookFunctionsWorkDay_IntlBody parameters) {
        return new WorkbookFunctionsWorkDay_IntlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.workDay_Intl"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXirrRequestBuilder xirr(@Nonnull final WorkbookFunctionsXirrBody parameters) {
        return new WorkbookFunctionsXirrRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xirr"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXnpvRequestBuilder xnpv(@Nonnull final WorkbookFunctionsXnpvBody parameters) {
        return new WorkbookFunctionsXnpvRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xnpv"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsXorRequestBuilder xor(@Nonnull final WorkbookFunctionsXorBody parameters) {
        return new WorkbookFunctionsXorRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.xor"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYearRequestBuilder year(@Nonnull final WorkbookFunctionsYearBody parameters) {
        return new WorkbookFunctionsYearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.year"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYearFracRequestBuilder yearFrac(@Nonnull final WorkbookFunctionsYearFracBody parameters) {
        return new WorkbookFunctionsYearFracRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yearFrac"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldRequestBuilder yield(@Nonnull final WorkbookFunctionsYieldBody parameters) {
        return new WorkbookFunctionsYieldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yield"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldDiscRequestBuilder yieldDisc(@Nonnull final WorkbookFunctionsYieldDiscBody parameters) {
        return new WorkbookFunctionsYieldDiscRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yieldDisc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsYieldMatRequestBuilder yieldMat(@Nonnull final WorkbookFunctionsYieldMatBody parameters) {
        return new WorkbookFunctionsYieldMatRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.yieldMat"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookFunctionsZ_TestRequestBuilder z_Test(@Nonnull final WorkbookFunctionsZ_TestBody parameters) {
        return new WorkbookFunctionsZ_TestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.z_Test"), getClient(), null, parameters);
    }
}

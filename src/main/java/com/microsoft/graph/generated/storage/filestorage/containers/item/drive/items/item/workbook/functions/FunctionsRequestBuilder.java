package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.abs.AbsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.accrint.AccrIntRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.accrintm.AccrIntMRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.acos.AcosRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.acosh.AcoshRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.acot.AcotRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.acoth.AcothRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.amordegrc.AmorDegrcRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.amorlinc.AmorLincRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.and.AndRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.arabic.ArabicRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.areas.AreasRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.asc.AscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.asin.AsinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.asinh.AsinhRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.atan.AtanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.atan2.Atan2RequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.atanh.AtanhRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.avedev.AveDevRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.average.AverageRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.averagea.AverageARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.averageif.AverageIfRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.averageifs.AverageIfsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bahttext.BahtTextRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.base.BaseRequestBuilderEscaped;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.besseli.BesselIRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.besselj.BesselJRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.besselk.BesselKRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bessely.BesselYRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.beta_dist.BetaDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.beta_inv.BetaInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bin2dec.Bin2DecRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bin2hex.Bin2HexRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bin2oct.Bin2OctRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.binom_dist_range.BinomDistRangeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.binom_dist.BinomDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.binom_inv.BinomInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bitand.BitandRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bitlshift.BitlshiftRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bitor.BitorRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bitrshift.BitrshiftRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.bitxor.BitxorRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ceiling_math.CeilingMathRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ceiling_precise.CeilingPreciseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.charescaped.CharRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.chisq_dist_rt.ChiSqDistRTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.chisq_dist.ChiSqDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.chisq_inv_rt.ChiSqInvRTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.chisq_inv.ChiSqInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.choose.ChooseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.clean.CleanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.code.CodeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.columns.ColumnsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.combin.CombinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.combina.CombinaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.complex.ComplexRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.concatenate.ConcatenateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.confidence_norm.ConfidenceNormRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.confidence_t.ConfidenceTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.convert.ConvertRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.cos.CosRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.cosh.CoshRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.cot.CotRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coth.CothRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.count.CountRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.counta.CountARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.countblank.CountBlankRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.countif.CountIfRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.countifs.CountIfsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coupdaybs.CoupDayBsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coupdays.CoupDaysRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coupdaysnc.CoupDaysNcRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coupncd.CoupNcdRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.coupnum.CoupNumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.couppcd.CoupPcdRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.csc.CscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.csch.CschRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.cumipmt.CumIPmtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.cumprinc.CumPrincRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.date.DateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.datevalue.DatevalueRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.daverage.DaverageRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.day.DayRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.days.DaysRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.days360.Days360RequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.db.DbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dbcs.DbcsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dcount.DcountRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dcounta.DcountARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ddb.DdbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dec2bin.Dec2BinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dec2hex.Dec2HexRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dec2oct.Dec2OctRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.decimal.DecimalRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.degrees.DegreesRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.delta.DeltaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.devsq.DevSqRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dget.DgetRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.disc.DiscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dmax.DmaxRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dmin.DminRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dollar.DollarRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dollarde.DollarDeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dollarfr.DollarFrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dproduct.DproductRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dstdev.DstDevRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dstdevp.DstDevPRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dsum.DsumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.duration.DurationRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dvar.DvarRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.dvarp.DvarPRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ecma_ceiling.EcmaCeilingRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.edate.EdateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.effect.EffectRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.eomonth.EoMonthRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.erf_precise.ErfPreciseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.erf.ErfRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.erfc_precise.ErfCPreciseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.erfc.ErfCRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.error_type.ErrorTypeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.even.EvenRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.exact.ExactRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.exp.ExpRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.expon_dist.ExponDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.f_dist_rt.FDistRTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.f_dist.FDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.f_inv_rt.FInvRTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.f_inv.FInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fact.FactRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.factdouble.FactDoubleRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.falseescaped.FalseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.find.FindRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.findb.FindBRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fisher.FisherRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fisherinv.FisherInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fixed.FixedRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.floor_math.FloorMathRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.floor_precise.FloorPreciseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fv.FvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.fvschedule.FvscheduleRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gamma_dist.GammaDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gamma_inv.GammaInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gamma.GammaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gammaln_precise.GammaLnPreciseRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gammaln.GammaLnRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gauss.GaussRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gcd.GcdRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.geomean.GeoMeanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.gestep.GeStepRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.harmean.HarMeanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hex2bin.Hex2BinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hex2dec.Hex2DecRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hex2oct.Hex2OctRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hlookup.HlookupRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hour.HourRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hyperlink.HyperlinkRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.hypgeom_dist.HypGeomDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ifescaped.IfRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imabs.ImAbsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imaginary.ImaginaryRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imargument.ImArgumentRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imconjugate.ImConjugateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imcos.ImCosRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imcosh.ImCoshRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imcot.ImCotRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imcsc.ImCscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imcsch.ImCschRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imdiv.ImDivRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imexp.ImExpRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imln.ImLnRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imlog10.ImLog10RequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imlog2.ImLog2RequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.impower.ImPowerRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.improduct.ImProductRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imreal.ImRealRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsec.ImSecRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsech.ImSechRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsin.ImSinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsinh.ImSinhRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsqrt.ImSqrtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsub.ImSubRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imsum.ImSumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.imtan.ImTanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.intescaped.IntRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.intrate.IntRateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ipmt.IpmtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.irr.IrrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.iserr.IsErrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.iserror.IsErrorRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.iseven.IsEvenRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isformula.IsFormulaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.islogical.IsLogicalRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isna.IsNARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isnontext.IsNonTextRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isnumber.IsNumberRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.iso_ceiling.IsoCeilingRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isodd.IsOddRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isoweeknum.IsoWeekNumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ispmt.IspmtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.isref.IsrefRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.istext.IsTextRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.kurt.KurtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.large.LargeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lcm.LcmRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.left.LeftRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.leftb.LeftbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.len.LenRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lenb.LenbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ln.LnRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.log.LogRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.log10.Log10RequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lognorm_dist.LogNormDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lognorm_inv.LogNormInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lookup.LookupRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.lower.LowerRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.match.MatchRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.max.MaxRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.maxa.MaxARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mduration.MdurationRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.median.MedianRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mid.MidRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.midb.MidbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.min.MinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mina.MinARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.minute.MinuteRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mirr.MirrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mod.ModRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.month.MonthRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.mround.MroundRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.multinomial.MultiNomialRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.n.NRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.na.NaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.negbinom_dist.NegBinomDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.networkdays_intl.NetworkDaysIntlRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.networkdays.NetworkDaysRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.nominal.NominalRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.norm_dist.NormDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.norm_inv.NormInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.norm_s_dist.NormSDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.norm_s_inv.NormSInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.not.NotRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.now.NowRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.nper.NperRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.npv.NpvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.numbervalue.NumberValueRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oct2bin.Oct2BinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oct2dec.Oct2DecRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oct2hex.Oct2HexRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.odd.OddRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oddfprice.OddFPriceRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oddfyield.OddFYieldRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oddlprice.OddLPriceRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.oddlyield.OddLYieldRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.or.OrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pduration.PdurationRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.percentile_exc.PercentileExcRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.percentile_inc.PercentileIncRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.percentrank_exc.PercentRankExcRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.percentrank_inc.PercentRankIncRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.permut.PermutRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.permutationa.PermutationaRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.phi.PhiRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pi.PiRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pmt.PmtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.poisson_dist.PoissonDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.power.PowerRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.ppmt.PpmtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.price.PriceRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pricedisc.PriceDiscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pricemat.PriceMatRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.product.ProductRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.proper.ProperRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.pv.PvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.quartile_exc.QuartileExcRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.quartile_inc.QuartileIncRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.quotient.QuotientRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.radians.RadiansRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rand.RandRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.randbetween.RandBetweenRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rank_avg.RankAvgRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rank_eq.RankEqRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rate.RateRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.received.ReceivedRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.replace.ReplaceRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.replaceb.ReplaceBRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rept.ReptRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.right.RightRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rightb.RightbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.roman.RomanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.round.RoundRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rounddown.RoundDownRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.roundup.RoundUpRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rows.RowsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.rri.RriRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sec.SecRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sech.SechRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.second.SecondRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.seriessum.SeriesSumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sheet.SheetRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sheets.SheetsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sign.SignRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sin.SinRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sinh.SinhRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.skew_p.SkewPRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.skew.SkewRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sln.SlnRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.small.SmallRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sqrt.SqrtRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sqrtpi.SqrtPiRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.standardize.StandardizeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.stdev_p.StDevPRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.stdev_s.StDevSRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.stdeva.StDevARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.stdevpa.StDevPARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.substitute.SubstituteRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.subtotal.SubtotalRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sum.SumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sumif.SumIfRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sumifs.SumIfsRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.sumsq.SumSqRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.syd.SydRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t_dist_2t.TDist2TRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t_dist_rt.TDistRTRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t_dist.TDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t_inv_2t.TInv2TRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t_inv.TInvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.t.TRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.tan.TanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.tanh.TanhRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.tbilleq.TbillEqRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.tbillprice.TbillPriceRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.tbillyield.TbillYieldRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.text.TextRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.time.TimeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.timevalue.TimevalueRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.today.TodayRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.trim.TrimRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.trimmean.TrimMeanRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.trueescaped.TrueRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.trunc.TruncRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.type.TypeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.unichar.UnicharRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.unicode.UnicodeRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.upper.UpperRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.usdollar.UsdollarRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.value.ValueRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.var_p.VarPRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.var_s.VarSRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.vara.VarARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.varpa.VarPARequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.vdb.VdbRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.vlookup.VlookupRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.weekday.WeekdayRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.weeknum.WeekNumRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.weibull_dist.WeibullDistRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.workday_intl.WorkDayIntlRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.workday.WorkDayRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.xirr.XirrRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.xnpv.XnpvRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.xor.XorRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.year.YearRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.yearfrac.YearFracRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.yield.YieldRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.yielddisc.YieldDiscRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.yieldmat.YieldMatRequestBuilder;
import com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.z_test.ZTestRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the functions property of the microsoft.graph.workbook entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FunctionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the abs method.
     * @return a {@link AbsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AbsRequestBuilder abs() {
        return new AbsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the accrInt method.
     * @return a {@link AccrIntRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccrIntRequestBuilder accrInt() {
        return new AccrIntRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the accrIntM method.
     * @return a {@link AccrIntMRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccrIntMRequestBuilder accrIntM() {
        return new AccrIntMRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acos method.
     * @return a {@link AcosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcosRequestBuilder acos() {
        return new AcosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acosh method.
     * @return a {@link AcoshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcoshRequestBuilder acosh() {
        return new AcoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acot method.
     * @return a {@link AcotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcotRequestBuilder acot() {
        return new AcotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acoth method.
     * @return a {@link AcothRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcothRequestBuilder acoth() {
        return new AcothRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the amorDegrc method.
     * @return a {@link AmorDegrcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AmorDegrcRequestBuilder amorDegrc() {
        return new AmorDegrcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the amorLinc method.
     * @return a {@link AmorLincRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AmorLincRequestBuilder amorLinc() {
        return new AmorLincRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the and method.
     * @return a {@link AndRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AndRequestBuilder and() {
        return new AndRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the arabic method.
     * @return a {@link ArabicRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ArabicRequestBuilder arabic() {
        return new ArabicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the areas method.
     * @return a {@link AreasRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AreasRequestBuilder areas() {
        return new AreasRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asc method.
     * @return a {@link AscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AscRequestBuilder asc() {
        return new AscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asin method.
     * @return a {@link AsinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AsinRequestBuilder asin() {
        return new AsinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asinh method.
     * @return a {@link AsinhRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AsinhRequestBuilder asinh() {
        return new AsinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atan method.
     * @return a {@link AtanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AtanRequestBuilder atan() {
        return new AtanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atan2 method.
     * @return a {@link Atan2RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Atan2RequestBuilder atan2() {
        return new Atan2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atanh method.
     * @return a {@link AtanhRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AtanhRequestBuilder atanh() {
        return new AtanhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the aveDev method.
     * @return a {@link AveDevRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AveDevRequestBuilder aveDev() {
        return new AveDevRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the average method.
     * @return a {@link AverageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AverageRequestBuilder average() {
        return new AverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageA method.
     * @return a {@link AverageARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AverageARequestBuilder averageA() {
        return new AverageARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageIf method.
     * @return a {@link AverageIfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AverageIfRequestBuilder averageIf() {
        return new AverageIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageIfs method.
     * @return a {@link AverageIfsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AverageIfsRequestBuilder averageIfs() {
        return new AverageIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bahtText method.
     * @return a {@link BahtTextRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BahtTextRequestBuilder bahtText() {
        return new BahtTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the base method.
     * @return a {@link BaseRequestBuilderEscaped}
     */
    @jakarta.annotation.Nonnull
    public BaseRequestBuilderEscaped base() {
        return new BaseRequestBuilderEscaped(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselI method.
     * @return a {@link BesselIRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BesselIRequestBuilder besselI() {
        return new BesselIRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselJ method.
     * @return a {@link BesselJRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BesselJRequestBuilder besselJ() {
        return new BesselJRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselK method.
     * @return a {@link BesselKRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BesselKRequestBuilder besselK() {
        return new BesselKRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselY method.
     * @return a {@link BesselYRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BesselYRequestBuilder besselY() {
        return new BesselYRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the beta_Dist method.
     * @return a {@link BetaDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BetaDistRequestBuilder betaDist() {
        return new BetaDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the beta_Inv method.
     * @return a {@link BetaInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BetaInvRequestBuilder betaInv() {
        return new BetaInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Dec method.
     * @return a {@link Bin2DecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Bin2DecRequestBuilder bin2Dec() {
        return new Bin2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Hex method.
     * @return a {@link Bin2HexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Bin2HexRequestBuilder bin2Hex() {
        return new Bin2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Oct method.
     * @return a {@link Bin2OctRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Bin2OctRequestBuilder bin2Oct() {
        return new Bin2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Dist method.
     * @return a {@link BinomDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BinomDistRequestBuilder binomDist() {
        return new BinomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Dist_Range method.
     * @return a {@link BinomDistRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BinomDistRangeRequestBuilder binomDistRange() {
        return new BinomDistRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Inv method.
     * @return a {@link BinomInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BinomInvRequestBuilder binomInv() {
        return new BinomInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitand method.
     * @return a {@link BitandRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitandRequestBuilder bitand() {
        return new BitandRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitlshift method.
     * @return a {@link BitlshiftRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitlshiftRequestBuilder bitlshift() {
        return new BitlshiftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitor method.
     * @return a {@link BitorRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitorRequestBuilder bitor() {
        return new BitorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitrshift method.
     * @return a {@link BitrshiftRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitrshiftRequestBuilder bitrshift() {
        return new BitrshiftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitxor method.
     * @return a {@link BitxorRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BitxorRequestBuilder bitxor() {
        return new BitxorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ceiling_Math method.
     * @return a {@link CeilingMathRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CeilingMathRequestBuilder ceilingMath() {
        return new CeilingMathRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ceiling_Precise method.
     * @return a {@link CeilingPreciseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CeilingPreciseRequestBuilder ceilingPrecise() {
        return new CeilingPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the char method.
     * @return a {@link CharRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CharRequestBuilder charEscaped() {
        return new CharRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Dist method.
     * @return a {@link ChiSqDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChiSqDistRequestBuilder chiSqDist() {
        return new ChiSqDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Dist_RT method.
     * @return a {@link ChiSqDistRTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChiSqDistRTRequestBuilder chiSqDistRT() {
        return new ChiSqDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Inv method.
     * @return a {@link ChiSqInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChiSqInvRequestBuilder chiSqInv() {
        return new ChiSqInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Inv_RT method.
     * @return a {@link ChiSqInvRTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChiSqInvRTRequestBuilder chiSqInvRT() {
        return new ChiSqInvRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the choose method.
     * @return a {@link ChooseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChooseRequestBuilder choose() {
        return new ChooseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clean method.
     * @return a {@link CleanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanRequestBuilder clean() {
        return new CleanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the code method.
     * @return a {@link CodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CodeRequestBuilder code() {
        return new CodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the columns method.
     * @return a {@link ColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the combin method.
     * @return a {@link CombinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CombinRequestBuilder combin() {
        return new CombinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the combina method.
     * @return a {@link CombinaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CombinaRequestBuilder combina() {
        return new CombinaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the complex method.
     * @return a {@link ComplexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplexRequestBuilder complex() {
        return new ComplexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the concatenate method.
     * @return a {@link ConcatenateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConcatenateRequestBuilder concatenate() {
        return new ConcatenateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the confidence_Norm method.
     * @return a {@link ConfidenceNormRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfidenceNormRequestBuilder confidenceNorm() {
        return new ConfidenceNormRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the confidence_T method.
     * @return a {@link ConfidenceTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfidenceTRequestBuilder confidenceT() {
        return new ConfidenceTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the convert method.
     * @return a {@link ConvertRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConvertRequestBuilder convert() {
        return new ConvertRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cos method.
     * @return a {@link CosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CosRequestBuilder cos() {
        return new CosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cosh method.
     * @return a {@link CoshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoshRequestBuilder cosh() {
        return new CoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cot method.
     * @return a {@link CotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CotRequestBuilder cot() {
        return new CotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coth method.
     * @return a {@link CothRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CothRequestBuilder coth() {
        return new CothRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the count method.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countA method.
     * @return a {@link CountARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountARequestBuilder countA() {
        return new CountARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countBlank method.
     * @return a {@link CountBlankRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountBlankRequestBuilder countBlank() {
        return new CountBlankRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countIf method.
     * @return a {@link CountIfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountIfRequestBuilder countIf() {
        return new CountIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countIfs method.
     * @return a {@link CountIfsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountIfsRequestBuilder countIfs() {
        return new CountIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDayBs method.
     * @return a {@link CoupDayBsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupDayBsRequestBuilder coupDayBs() {
        return new CoupDayBsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDays method.
     * @return a {@link CoupDaysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupDaysRequestBuilder coupDays() {
        return new CoupDaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDaysNc method.
     * @return a {@link CoupDaysNcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupDaysNcRequestBuilder coupDaysNc() {
        return new CoupDaysNcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupNcd method.
     * @return a {@link CoupNcdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupNcdRequestBuilder coupNcd() {
        return new CoupNcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupNum method.
     * @return a {@link CoupNumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupNumRequestBuilder coupNum() {
        return new CoupNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupPcd method.
     * @return a {@link CoupPcdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CoupPcdRequestBuilder coupPcd() {
        return new CoupPcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the csc method.
     * @return a {@link CscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CscRequestBuilder csc() {
        return new CscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the csch method.
     * @return a {@link CschRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CschRequestBuilder csch() {
        return new CschRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cumIPmt method.
     * @return a {@link CumIPmtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CumIPmtRequestBuilder cumIPmt() {
        return new CumIPmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cumPrinc method.
     * @return a {@link CumPrincRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CumPrincRequestBuilder cumPrinc() {
        return new CumPrincRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the date method.
     * @return a {@link DateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DateRequestBuilder date() {
        return new DateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the datevalue method.
     * @return a {@link DatevalueRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DatevalueRequestBuilder datevalue() {
        return new DatevalueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the daverage method.
     * @return a {@link DaverageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DaverageRequestBuilder daverage() {
        return new DaverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the day method.
     * @return a {@link DayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DayRequestBuilder day() {
        return new DayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the days method.
     * @return a {@link DaysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DaysRequestBuilder days() {
        return new DaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the days360 method.
     * @return a {@link Days360RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Days360RequestBuilder days360() {
        return new Days360RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the db method.
     * @return a {@link DbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DbRequestBuilder db() {
        return new DbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dbcs method.
     * @return a {@link DbcsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DbcsRequestBuilder dbcs() {
        return new DbcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dcount method.
     * @return a {@link DcountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DcountRequestBuilder dcount() {
        return new DcountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dcountA method.
     * @return a {@link DcountARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DcountARequestBuilder dcountA() {
        return new DcountARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ddb method.
     * @return a {@link DdbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DdbRequestBuilder ddb() {
        return new DdbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Bin method.
     * @return a {@link Dec2BinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Dec2BinRequestBuilder dec2Bin() {
        return new Dec2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Hex method.
     * @return a {@link Dec2HexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Dec2HexRequestBuilder dec2Hex() {
        return new Dec2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Oct method.
     * @return a {@link Dec2OctRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Dec2OctRequestBuilder dec2Oct() {
        return new Dec2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the decimal method.
     * @return a {@link DecimalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecimalRequestBuilder decimal() {
        return new DecimalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the degrees method.
     * @return a {@link DegreesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DegreesRequestBuilder degrees() {
        return new DegreesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the devSq method.
     * @return a {@link DevSqRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevSqRequestBuilder devSq() {
        return new DevSqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dget method.
     * @return a {@link DgetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DgetRequestBuilder dget() {
        return new DgetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disc method.
     * @return a {@link DiscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DiscRequestBuilder disc() {
        return new DiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dmax method.
     * @return a {@link DmaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DmaxRequestBuilder dmax() {
        return new DmaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dmin method.
     * @return a {@link DminRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DminRequestBuilder dmin() {
        return new DminRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollar method.
     * @return a {@link DollarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DollarRequestBuilder dollar() {
        return new DollarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollarDe method.
     * @return a {@link DollarDeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DollarDeRequestBuilder dollarDe() {
        return new DollarDeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollarFr method.
     * @return a {@link DollarFrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DollarFrRequestBuilder dollarFr() {
        return new DollarFrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dproduct method.
     * @return a {@link DproductRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DproductRequestBuilder dproduct() {
        return new DproductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dstDev method.
     * @return a {@link DstDevRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DstDevRequestBuilder dstDev() {
        return new DstDevRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dstDevP method.
     * @return a {@link DstDevPRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DstDevPRequestBuilder dstDevP() {
        return new DstDevPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dsum method.
     * @return a {@link DsumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DsumRequestBuilder dsum() {
        return new DsumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the duration method.
     * @return a {@link DurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DurationRequestBuilder duration() {
        return new DurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dvar method.
     * @return a {@link DvarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DvarRequestBuilder dvar() {
        return new DvarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dvarP method.
     * @return a {@link DvarPRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DvarPRequestBuilder dvarP() {
        return new DvarPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ecma_Ceiling method.
     * @return a {@link EcmaCeilingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EcmaCeilingRequestBuilder ecmaCeiling() {
        return new EcmaCeilingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the edate method.
     * @return a {@link EdateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EdateRequestBuilder edate() {
        return new EdateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the effect method.
     * @return a {@link EffectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EffectRequestBuilder effect() {
        return new EffectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the eoMonth method.
     * @return a {@link EoMonthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EoMonthRequestBuilder eoMonth() {
        return new EoMonthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erf method.
     * @return a {@link ErfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ErfRequestBuilder erf() {
        return new ErfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erfC method.
     * @return a {@link ErfCRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ErfCRequestBuilder erfC() {
        return new ErfCRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erfC_Precise method.
     * @return a {@link ErfCPreciseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ErfCPreciseRequestBuilder erfCPrecise() {
        return new ErfCPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erf_Precise method.
     * @return a {@link ErfPreciseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ErfPreciseRequestBuilder erfPrecise() {
        return new ErfPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the error_Type method.
     * @return a {@link ErrorTypeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ErrorTypeRequestBuilder errorType() {
        return new ErrorTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the even method.
     * @return a {@link EvenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EvenRequestBuilder even() {
        return new EvenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exact method.
     * @return a {@link ExactRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExactRequestBuilder exact() {
        return new ExactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exp method.
     * @return a {@link ExpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExpRequestBuilder exp() {
        return new ExpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the expon_Dist method.
     * @return a {@link ExponDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExponDistRequestBuilder exponDist() {
        return new ExponDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fact method.
     * @return a {@link FactRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FactRequestBuilder fact() {
        return new FactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the factDouble method.
     * @return a {@link FactDoubleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FactDoubleRequestBuilder factDouble() {
        return new FactDoubleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the false method.
     * @return a {@link FalseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FalseRequestBuilder falseEscaped() {
        return new FalseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Dist method.
     * @return a {@link FDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FDistRequestBuilder fDist() {
        return new FDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Dist_RT method.
     * @return a {@link FDistRTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FDistRTRequestBuilder fDistRT() {
        return new FDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the find method.
     * @return a {@link FindRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRequestBuilder find() {
        return new FindRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findB method.
     * @return a {@link FindBRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindBRequestBuilder findB() {
        return new FindBRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Inv method.
     * @return a {@link FInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FInvRequestBuilder fInv() {
        return new FInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Inv_RT method.
     * @return a {@link FInvRTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FInvRTRequestBuilder fInvRT() {
        return new FInvRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fisher method.
     * @return a {@link FisherRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FisherRequestBuilder fisher() {
        return new FisherRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fisherInv method.
     * @return a {@link FisherInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FisherInvRequestBuilder fisherInv() {
        return new FisherInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fixed method.
     * @return a {@link FixedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FixedRequestBuilder fixed() {
        return new FixedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the floor_Math method.
     * @return a {@link FloorMathRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FloorMathRequestBuilder floorMath() {
        return new FloorMathRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the floor_Precise method.
     * @return a {@link FloorPreciseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FloorPreciseRequestBuilder floorPrecise() {
        return new FloorPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fv method.
     * @return a {@link FvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FvRequestBuilder fv() {
        return new FvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fvschedule method.
     * @return a {@link FvscheduleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FvscheduleRequestBuilder fvschedule() {
        return new FvscheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma method.
     * @return a {@link GammaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GammaRequestBuilder gamma() {
        return new GammaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma_Dist method.
     * @return a {@link GammaDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GammaDistRequestBuilder gammaDist() {
        return new GammaDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma_Inv method.
     * @return a {@link GammaInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GammaInvRequestBuilder gammaInv() {
        return new GammaInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gammaLn method.
     * @return a {@link GammaLnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GammaLnRequestBuilder gammaLn() {
        return new GammaLnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gammaLn_Precise method.
     * @return a {@link GammaLnPreciseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GammaLnPreciseRequestBuilder gammaLnPrecise() {
        return new GammaLnPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gauss method.
     * @return a {@link GaussRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GaussRequestBuilder gauss() {
        return new GaussRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gcd method.
     * @return a {@link GcdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GcdRequestBuilder gcd() {
        return new GcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the geoMean method.
     * @return a {@link GeoMeanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GeoMeanRequestBuilder geoMean() {
        return new GeoMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the geStep method.
     * @return a {@link GeStepRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GeStepRequestBuilder geStep() {
        return new GeStepRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the harMean method.
     * @return a {@link HarMeanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HarMeanRequestBuilder harMean() {
        return new HarMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Bin method.
     * @return a {@link Hex2BinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Hex2BinRequestBuilder hex2Bin() {
        return new Hex2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Dec method.
     * @return a {@link Hex2DecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Hex2DecRequestBuilder hex2Dec() {
        return new Hex2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Oct method.
     * @return a {@link Hex2OctRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Hex2OctRequestBuilder hex2Oct() {
        return new Hex2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hlookup method.
     * @return a {@link HlookupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HlookupRequestBuilder hlookup() {
        return new HlookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hour method.
     * @return a {@link HourRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HourRequestBuilder hour() {
        return new HourRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hyperlink method.
     * @return a {@link HyperlinkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HyperlinkRequestBuilder hyperlink() {
        return new HyperlinkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hypGeom_Dist method.
     * @return a {@link HypGeomDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HypGeomDistRequestBuilder hypGeomDist() {
        return new HypGeomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the if method.
     * @return a {@link IfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IfRequestBuilder ifEscaped() {
        return new IfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imAbs method.
     * @return a {@link ImAbsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImAbsRequestBuilder imAbs() {
        return new ImAbsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imaginary method.
     * @return a {@link ImaginaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImaginaryRequestBuilder imaginary() {
        return new ImaginaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imArgument method.
     * @return a {@link ImArgumentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImArgumentRequestBuilder imArgument() {
        return new ImArgumentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imConjugate method.
     * @return a {@link ImConjugateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImConjugateRequestBuilder imConjugate() {
        return new ImConjugateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCos method.
     * @return a {@link ImCosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImCosRequestBuilder imCos() {
        return new ImCosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCosh method.
     * @return a {@link ImCoshRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImCoshRequestBuilder imCosh() {
        return new ImCoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCot method.
     * @return a {@link ImCotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImCotRequestBuilder imCot() {
        return new ImCotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCsc method.
     * @return a {@link ImCscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImCscRequestBuilder imCsc() {
        return new ImCscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCsch method.
     * @return a {@link ImCschRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImCschRequestBuilder imCsch() {
        return new ImCschRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imDiv method.
     * @return a {@link ImDivRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImDivRequestBuilder imDiv() {
        return new ImDivRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imExp method.
     * @return a {@link ImExpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImExpRequestBuilder imExp() {
        return new ImExpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLn method.
     * @return a {@link ImLnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImLnRequestBuilder imLn() {
        return new ImLnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLog10 method.
     * @return a {@link ImLog10RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImLog10RequestBuilder imLog10() {
        return new ImLog10RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLog2 method.
     * @return a {@link ImLog2RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImLog2RequestBuilder imLog2() {
        return new ImLog2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imPower method.
     * @return a {@link ImPowerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImPowerRequestBuilder imPower() {
        return new ImPowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imProduct method.
     * @return a {@link ImProductRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImProductRequestBuilder imProduct() {
        return new ImProductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imReal method.
     * @return a {@link ImRealRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImRealRequestBuilder imReal() {
        return new ImRealRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSec method.
     * @return a {@link ImSecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSecRequestBuilder imSec() {
        return new ImSecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSech method.
     * @return a {@link ImSechRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSechRequestBuilder imSech() {
        return new ImSechRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSin method.
     * @return a {@link ImSinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSinRequestBuilder imSin() {
        return new ImSinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSinh method.
     * @return a {@link ImSinhRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSinhRequestBuilder imSinh() {
        return new ImSinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSqrt method.
     * @return a {@link ImSqrtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSqrtRequestBuilder imSqrt() {
        return new ImSqrtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSub method.
     * @return a {@link ImSubRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSubRequestBuilder imSub() {
        return new ImSubRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSum method.
     * @return a {@link ImSumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImSumRequestBuilder imSum() {
        return new ImSumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imTan method.
     * @return a {@link ImTanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ImTanRequestBuilder imTan() {
        return new ImTanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the int method.
     * @return a {@link IntRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IntRequestBuilder intEscaped() {
        return new IntRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the intRate method.
     * @return a {@link IntRateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IntRateRequestBuilder intRate() {
        return new IntRateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ipmt method.
     * @return a {@link IpmtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IpmtRequestBuilder ipmt() {
        return new IpmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the irr method.
     * @return a {@link IrrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IrrRequestBuilder irr() {
        return new IrrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isErr method.
     * @return a {@link IsErrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsErrRequestBuilder isErr() {
        return new IsErrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isError method.
     * @return a {@link IsErrorRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsErrorRequestBuilder isError() {
        return new IsErrorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isEven method.
     * @return a {@link IsEvenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsEvenRequestBuilder isEven() {
        return new IsEvenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isFormula method.
     * @return a {@link IsFormulaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsFormulaRequestBuilder isFormula() {
        return new IsFormulaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isLogical method.
     * @return a {@link IsLogicalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsLogicalRequestBuilder isLogical() {
        return new IsLogicalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNA method.
     * @return a {@link IsNARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsNARequestBuilder isNA() {
        return new IsNARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNonText method.
     * @return a {@link IsNonTextRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsNonTextRequestBuilder isNonText() {
        return new IsNonTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNumber method.
     * @return a {@link IsNumberRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsNumberRequestBuilder isNumber() {
        return new IsNumberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the iso_Ceiling method.
     * @return a {@link IsoCeilingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsoCeilingRequestBuilder isoCeiling() {
        return new IsoCeilingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isOdd method.
     * @return a {@link IsOddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsOddRequestBuilder isOdd() {
        return new IsOddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isoWeekNum method.
     * @return a {@link IsoWeekNumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsoWeekNumRequestBuilder isoWeekNum() {
        return new IsoWeekNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ispmt method.
     * @return a {@link IspmtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IspmtRequestBuilder ispmt() {
        return new IspmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isref method.
     * @return a {@link IsrefRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsrefRequestBuilder isref() {
        return new IsrefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isText method.
     * @return a {@link IsTextRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsTextRequestBuilder isText() {
        return new IsTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the kurt method.
     * @return a {@link KurtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KurtRequestBuilder kurt() {
        return new KurtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the large method.
     * @return a {@link LargeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LargeRequestBuilder large() {
        return new LargeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lcm method.
     * @return a {@link LcmRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LcmRequestBuilder lcm() {
        return new LcmRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the left method.
     * @return a {@link LeftRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeftRequestBuilder left() {
        return new LeftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the leftb method.
     * @return a {@link LeftbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeftbRequestBuilder leftb() {
        return new LeftbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the len method.
     * @return a {@link LenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LenRequestBuilder len() {
        return new LenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lenb method.
     * @return a {@link LenbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LenbRequestBuilder lenb() {
        return new LenbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ln method.
     * @return a {@link LnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LnRequestBuilder ln() {
        return new LnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the log method.
     * @return a {@link LogRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogRequestBuilder log() {
        return new LogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the log10 method.
     * @return a {@link Log10RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Log10RequestBuilder log10() {
        return new Log10RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logNorm_Dist method.
     * @return a {@link LogNormDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogNormDistRequestBuilder logNormDist() {
        return new LogNormDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logNorm_Inv method.
     * @return a {@link LogNormInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LogNormInvRequestBuilder logNormInv() {
        return new LogNormInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lookup method.
     * @return a {@link LookupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LookupRequestBuilder lookup() {
        return new LookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lower method.
     * @return a {@link LowerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LowerRequestBuilder lower() {
        return new LowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the match method.
     * @return a {@link MatchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MatchRequestBuilder match() {
        return new MatchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the max method.
     * @return a {@link MaxRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MaxRequestBuilder max() {
        return new MaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the maxA method.
     * @return a {@link MaxARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MaxARequestBuilder maxA() {
        return new MaxARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mduration method.
     * @return a {@link MdurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MdurationRequestBuilder mduration() {
        return new MdurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the median method.
     * @return a {@link MedianRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MedianRequestBuilder median() {
        return new MedianRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mid method.
     * @return a {@link MidRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MidRequestBuilder mid() {
        return new MidRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the midb method.
     * @return a {@link MidbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MidbRequestBuilder midb() {
        return new MidbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the min method.
     * @return a {@link MinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MinRequestBuilder min() {
        return new MinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the minA method.
     * @return a {@link MinARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MinARequestBuilder minA() {
        return new MinARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the minute method.
     * @return a {@link MinuteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MinuteRequestBuilder minute() {
        return new MinuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mirr method.
     * @return a {@link MirrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MirrRequestBuilder mirr() {
        return new MirrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mod method.
     * @return a {@link ModRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ModRequestBuilder mod() {
        return new ModRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the month method.
     * @return a {@link MonthRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthRequestBuilder month() {
        return new MonthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mround method.
     * @return a {@link MroundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MroundRequestBuilder mround() {
        return new MroundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the multiNomial method.
     * @return a {@link MultiNomialRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MultiNomialRequestBuilder multiNomial() {
        return new MultiNomialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the n method.
     * @return a {@link NRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NRequestBuilder n() {
        return new NRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the na method.
     * @return a {@link NaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NaRequestBuilder na() {
        return new NaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the negBinom_Dist method.
     * @return a {@link NegBinomDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NegBinomDistRequestBuilder negBinomDist() {
        return new NegBinomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the networkDays method.
     * @return a {@link NetworkDaysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NetworkDaysRequestBuilder networkDays() {
        return new NetworkDaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the networkDays_Intl method.
     * @return a {@link NetworkDaysIntlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NetworkDaysIntlRequestBuilder networkDaysIntl() {
        return new NetworkDaysIntlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the nominal method.
     * @return a {@link NominalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NominalRequestBuilder nominal() {
        return new NominalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_Dist method.
     * @return a {@link NormDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NormDistRequestBuilder normDist() {
        return new NormDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_Inv method.
     * @return a {@link NormInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NormInvRequestBuilder normInv() {
        return new NormInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_S_Dist method.
     * @return a {@link NormSDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NormSDistRequestBuilder normSDist() {
        return new NormSDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_S_Inv method.
     * @return a {@link NormSInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NormSInvRequestBuilder normSInv() {
        return new NormSInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the not method.
     * @return a {@link NotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotRequestBuilder not() {
        return new NotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the now method.
     * @return a {@link NowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NowRequestBuilder now() {
        return new NowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the nper method.
     * @return a {@link NperRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NperRequestBuilder nper() {
        return new NperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the npv method.
     * @return a {@link NpvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NpvRequestBuilder npv() {
        return new NpvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the numberValue method.
     * @return a {@link NumberValueRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NumberValueRequestBuilder numberValue() {
        return new NumberValueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Bin method.
     * @return a {@link Oct2BinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oct2BinRequestBuilder oct2Bin() {
        return new Oct2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Dec method.
     * @return a {@link Oct2DecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oct2DecRequestBuilder oct2Dec() {
        return new Oct2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Hex method.
     * @return a {@link Oct2HexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oct2HexRequestBuilder oct2Hex() {
        return new Oct2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the odd method.
     * @return a {@link OddRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OddRequestBuilder odd() {
        return new OddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddFPrice method.
     * @return a {@link OddFPriceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OddFPriceRequestBuilder oddFPrice() {
        return new OddFPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddFYield method.
     * @return a {@link OddFYieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OddFYieldRequestBuilder oddFYield() {
        return new OddFYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddLPrice method.
     * @return a {@link OddLPriceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OddLPriceRequestBuilder oddLPrice() {
        return new OddLPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddLYield method.
     * @return a {@link OddLYieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OddLYieldRequestBuilder oddLYield() {
        return new OddLYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the or method.
     * @return a {@link OrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrRequestBuilder or() {
        return new OrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pduration method.
     * @return a {@link PdurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PdurationRequestBuilder pduration() {
        return new PdurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentile_Exc method.
     * @return a {@link PercentileExcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PercentileExcRequestBuilder percentileExc() {
        return new PercentileExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentile_Inc method.
     * @return a {@link PercentileIncRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PercentileIncRequestBuilder percentileInc() {
        return new PercentileIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentRank_Exc method.
     * @return a {@link PercentRankExcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PercentRankExcRequestBuilder percentRankExc() {
        return new PercentRankExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentRank_Inc method.
     * @return a {@link PercentRankIncRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PercentRankIncRequestBuilder percentRankInc() {
        return new PercentRankIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permut method.
     * @return a {@link PermutRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermutRequestBuilder permut() {
        return new PermutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permutationa method.
     * @return a {@link PermutationaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermutationaRequestBuilder permutationa() {
        return new PermutationaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the phi method.
     * @return a {@link PhiRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhiRequestBuilder phi() {
        return new PhiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pi method.
     * @return a {@link PiRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PiRequestBuilder pi() {
        return new PiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pmt method.
     * @return a {@link PmtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PmtRequestBuilder pmt() {
        return new PmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the poisson_Dist method.
     * @return a {@link PoissonDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoissonDistRequestBuilder poissonDist() {
        return new PoissonDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the power method.
     * @return a {@link PowerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PowerRequestBuilder power() {
        return new PowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ppmt method.
     * @return a {@link PpmtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PpmtRequestBuilder ppmt() {
        return new PpmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the price method.
     * @return a {@link PriceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PriceRequestBuilder price() {
        return new PriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the priceDisc method.
     * @return a {@link PriceDiscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PriceDiscRequestBuilder priceDisc() {
        return new PriceDiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the priceMat method.
     * @return a {@link PriceMatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PriceMatRequestBuilder priceMat() {
        return new PriceMatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the product method.
     * @return a {@link ProductRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProductRequestBuilder product() {
        return new ProductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the proper method.
     * @return a {@link ProperRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProperRequestBuilder proper() {
        return new ProperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pv method.
     * @return a {@link PvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PvRequestBuilder pv() {
        return new PvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quartile_Exc method.
     * @return a {@link QuartileExcRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QuartileExcRequestBuilder quartileExc() {
        return new QuartileExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quartile_Inc method.
     * @return a {@link QuartileIncRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QuartileIncRequestBuilder quartileInc() {
        return new QuartileIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quotient method.
     * @return a {@link QuotientRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QuotientRequestBuilder quotient() {
        return new QuotientRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the radians method.
     * @return a {@link RadiansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RadiansRequestBuilder radians() {
        return new RadiansRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rand method.
     * @return a {@link RandRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RandRequestBuilder rand() {
        return new RandRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the randBetween method.
     * @return a {@link RandBetweenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RandBetweenRequestBuilder randBetween() {
        return new RandBetweenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rank_Avg method.
     * @return a {@link RankAvgRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RankAvgRequestBuilder rankAvg() {
        return new RankAvgRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rank_Eq method.
     * @return a {@link RankEqRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RankEqRequestBuilder rankEq() {
        return new RankEqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rate method.
     * @return a {@link RateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RateRequestBuilder rate() {
        return new RateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the received method.
     * @return a {@link ReceivedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReceivedRequestBuilder received() {
        return new ReceivedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replace method.
     * @return a {@link ReplaceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReplaceRequestBuilder replace() {
        return new ReplaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replaceB method.
     * @return a {@link ReplaceBRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReplaceBRequestBuilder replaceB() {
        return new ReplaceBRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rept method.
     * @return a {@link ReptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReptRequestBuilder rept() {
        return new ReptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the right method.
     * @return a {@link RightRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RightRequestBuilder right() {
        return new RightRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rightb method.
     * @return a {@link RightbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RightbRequestBuilder rightb() {
        return new RightbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roman method.
     * @return a {@link RomanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RomanRequestBuilder roman() {
        return new RomanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the round method.
     * @return a {@link RoundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoundRequestBuilder round() {
        return new RoundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roundDown method.
     * @return a {@link RoundDownRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoundDownRequestBuilder roundDown() {
        return new RoundDownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roundUp method.
     * @return a {@link RoundUpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoundUpRequestBuilder roundUp() {
        return new RoundUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rows method.
     * @return a {@link RowsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowsRequestBuilder rows() {
        return new RowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rri method.
     * @return a {@link RriRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RriRequestBuilder rri() {
        return new RriRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sec method.
     * @return a {@link SecRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecRequestBuilder sec() {
        return new SecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sech method.
     * @return a {@link SechRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SechRequestBuilder sech() {
        return new SechRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the second method.
     * @return a {@link SecondRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecondRequestBuilder second() {
        return new SecondRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the seriesSum method.
     * @return a {@link SeriesSumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SeriesSumRequestBuilder seriesSum() {
        return new SeriesSumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sheet method.
     * @return a {@link SheetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SheetRequestBuilder sheet() {
        return new SheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sheets method.
     * @return a {@link SheetsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SheetsRequestBuilder sheets() {
        return new SheetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sign method.
     * @return a {@link SignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignRequestBuilder sign() {
        return new SignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sin method.
     * @return a {@link SinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SinRequestBuilder sin() {
        return new SinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sinh method.
     * @return a {@link SinhRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SinhRequestBuilder sinh() {
        return new SinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the skew method.
     * @return a {@link SkewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SkewRequestBuilder skew() {
        return new SkewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the skew_p method.
     * @return a {@link SkewPRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SkewPRequestBuilder skewP() {
        return new SkewPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sln method.
     * @return a {@link SlnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SlnRequestBuilder sln() {
        return new SlnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the small method.
     * @return a {@link SmallRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SmallRequestBuilder small() {
        return new SmallRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sqrt method.
     * @return a {@link SqrtRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SqrtRequestBuilder sqrt() {
        return new SqrtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sqrtPi method.
     * @return a {@link SqrtPiRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SqrtPiRequestBuilder sqrtPi() {
        return new SqrtPiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the standardize method.
     * @return a {@link StandardizeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StandardizeRequestBuilder standardize() {
        return new StandardizeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDevA method.
     * @return a {@link StDevARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StDevARequestBuilder stDevA() {
        return new StDevARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDev_P method.
     * @return a {@link StDevPRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StDevPRequestBuilder stDevP() {
        return new StDevPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDevPA method.
     * @return a {@link StDevPARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StDevPARequestBuilder stDevPA() {
        return new StDevPARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDev_S method.
     * @return a {@link StDevSRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StDevSRequestBuilder stDevS() {
        return new StDevSRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the substitute method.
     * @return a {@link SubstituteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubstituteRequestBuilder substitute() {
        return new SubstituteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subtotal method.
     * @return a {@link SubtotalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubtotalRequestBuilder subtotal() {
        return new SubtotalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sum method.
     * @return a {@link SumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SumRequestBuilder sum() {
        return new SumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumIf method.
     * @return a {@link SumIfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SumIfRequestBuilder sumIf() {
        return new SumIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumIfs method.
     * @return a {@link SumIfsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SumIfsRequestBuilder sumIfs() {
        return new SumIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumSq method.
     * @return a {@link SumSqRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SumSqRequestBuilder sumSq() {
        return new SumSqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syd method.
     * @return a {@link SydRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SydRequestBuilder syd() {
        return new SydRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t method.
     * @return a {@link TRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TRequestBuilder t() {
        return new TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tan method.
     * @return a {@link TanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TanRequestBuilder tan() {
        return new TanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tanh method.
     * @return a {@link TanhRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TanhRequestBuilder tanh() {
        return new TanhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillEq method.
     * @return a {@link TbillEqRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TbillEqRequestBuilder tbillEq() {
        return new TbillEqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillPrice method.
     * @return a {@link TbillPriceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TbillPriceRequestBuilder tbillPrice() {
        return new TbillPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillYield method.
     * @return a {@link TbillYieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TbillYieldRequestBuilder tbillYield() {
        return new TbillYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist method.
     * @return a {@link TDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TDistRequestBuilder tDist() {
        return new TDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist_2T method.
     * @return a {@link TDist2TRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TDist2TRequestBuilder tDist2T() {
        return new TDist2TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist_RT method.
     * @return a {@link TDistRTRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TDistRTRequestBuilder tDistRT() {
        return new TDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the text method.
     * @return a {@link TextRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TextRequestBuilder text() {
        return new TextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the time method.
     * @return a {@link TimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TimeRequestBuilder time() {
        return new TimeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the timevalue method.
     * @return a {@link TimevalueRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TimevalueRequestBuilder timevalue() {
        return new TimevalueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Inv method.
     * @return a {@link TInvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TInvRequestBuilder tInv() {
        return new TInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Inv_2T method.
     * @return a {@link TInv2TRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TInv2TRequestBuilder tInv2T() {
        return new TInv2TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the today method.
     * @return a {@link TodayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TodayRequestBuilder today() {
        return new TodayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trim method.
     * @return a {@link TrimRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrimRequestBuilder trim() {
        return new TrimRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trimMean method.
     * @return a {@link TrimMeanRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrimMeanRequestBuilder trimMean() {
        return new TrimMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the true method.
     * @return a {@link TrueRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrueRequestBuilder trueEscaped() {
        return new TrueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trunc method.
     * @return a {@link TruncRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TruncRequestBuilder trunc() {
        return new TruncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the type method.
     * @return a {@link TypeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TypeRequestBuilder type() {
        return new TypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unichar method.
     * @return a {@link UnicharRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnicharRequestBuilder unichar() {
        return new UnicharRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unicode method.
     * @return a {@link UnicodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnicodeRequestBuilder unicode() {
        return new UnicodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the upper method.
     * @return a {@link UpperRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpperRequestBuilder upper() {
        return new UpperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usdollar method.
     * @return a {@link UsdollarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsdollarRequestBuilder usdollar() {
        return new UsdollarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the value method.
     * @return a {@link ValueRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValueRequestBuilder value() {
        return new ValueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the varA method.
     * @return a {@link VarARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VarARequestBuilder varA() {
        return new VarARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the var_P method.
     * @return a {@link VarPRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VarPRequestBuilder varP() {
        return new VarPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the varPA method.
     * @return a {@link VarPARequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VarPARequestBuilder varPA() {
        return new VarPARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the var_S method.
     * @return a {@link VarSRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VarSRequestBuilder varS() {
        return new VarSRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the vdb method.
     * @return a {@link VdbRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VdbRequestBuilder vdb() {
        return new VdbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the vlookup method.
     * @return a {@link VlookupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VlookupRequestBuilder vlookup() {
        return new VlookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weekday method.
     * @return a {@link WeekdayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WeekdayRequestBuilder weekday() {
        return new WeekdayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weekNum method.
     * @return a {@link WeekNumRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WeekNumRequestBuilder weekNum() {
        return new WeekNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weibull_Dist method.
     * @return a {@link WeibullDistRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WeibullDistRequestBuilder weibullDist() {
        return new WeibullDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the workDay method.
     * @return a {@link WorkDayRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkDayRequestBuilder workDay() {
        return new WorkDayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the workDay_Intl method.
     * @return a {@link WorkDayIntlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkDayIntlRequestBuilder workDayIntl() {
        return new WorkDayIntlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xirr method.
     * @return a {@link XirrRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public XirrRequestBuilder xirr() {
        return new XirrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xnpv method.
     * @return a {@link XnpvRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public XnpvRequestBuilder xnpv() {
        return new XnpvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xor method.
     * @return a {@link XorRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public XorRequestBuilder xor() {
        return new XorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the year method.
     * @return a {@link YearRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YearRequestBuilder year() {
        return new YearRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yearFrac method.
     * @return a {@link YearFracRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YearFracRequestBuilder yearFrac() {
        return new YearFracRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yield method.
     * @return a {@link YieldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YieldRequestBuilder yield() {
        return new YieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yieldDisc method.
     * @return a {@link YieldDiscRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YieldDiscRequestBuilder yieldDisc() {
        return new YieldDiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yieldMat method.
     * @return a {@link YieldMatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public YieldMatRequestBuilder yieldMat() {
        return new YieldMatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the z_Test method.
     * @return a {@link ZTestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ZTestRequestBuilder zTest() {
        return new ZTestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FunctionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FunctionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/functions{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link FunctionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FunctionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/drive/items/{driveItem%2Did}/workbook/functions{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property functions for storage
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property functions for storage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get functions from storage
     * @return a {@link WorkbookFunctions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFunctions get() {
        return get(null);
    }
    /**
     * Get functions from storage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookFunctions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFunctions get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookFunctions::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property functions in storage
     * @param body The request body
     * @return a {@link WorkbookFunctions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFunctions patch(@jakarta.annotation.Nonnull final WorkbookFunctions body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property functions in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookFunctions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFunctions patch(@jakarta.annotation.Nonnull final WorkbookFunctions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookFunctions::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property functions for storage
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property functions for storage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get functions from storage
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get functions from storage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property functions in storage
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookFunctions body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property functions in storage
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookFunctions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FunctionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FunctionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FunctionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get functions from storage
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

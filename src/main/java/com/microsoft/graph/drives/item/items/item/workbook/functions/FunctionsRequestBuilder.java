package com.microsoft.graph.drives.item.items.item.workbook.functions;

import com.microsoft.graph.drives.item.items.item.workbook.functions.abs.AbsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.accrint.AccrIntRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.accrintm.AccrIntMRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.acos.AcosRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.acosh.AcoshRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.acot.AcotRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.acoth.AcothRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.amordegrc.AmorDegrcRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.amorlinc.AmorLincRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.and.AndRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.arabic.ArabicRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.areas.AreasRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.asc.AscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.asin.AsinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.asinh.AsinhRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.atan.AtanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.atan2.Atan2RequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.atanh.AtanhRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.avedev.AveDevRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.average.AverageRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.averagea.AverageARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.averageif.AverageIfRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.averageifs.AverageIfsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bahttext.BahtTextRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.base.BaseRequestBuilderEscaped;
import com.microsoft.graph.drives.item.items.item.workbook.functions.besseli.BesselIRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.besselj.BesselJRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.besselk.BesselKRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bessely.BesselYRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.beta_dist.BetaDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.beta_inv.BetaInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bin2dec.Bin2DecRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bin2hex.Bin2HexRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bin2oct.Bin2OctRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.binom_dist_range.BinomDistRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.binom_dist.BinomDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.binom_inv.BinomInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bitand.BitandRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bitlshift.BitlshiftRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bitor.BitorRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bitrshift.BitrshiftRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.bitxor.BitxorRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ceiling_math.CeilingMathRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ceiling_precise.CeilingPreciseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.charEscaped.CharRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.chisq_dist_rt.ChiSqDistRTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.chisq_dist.ChiSqDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.chisq_inv_rt.ChiSqInvRTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.chisq_inv.ChiSqInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.choose.ChooseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.clean.CleanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.code.CodeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.columns.ColumnsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.combin.CombinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.combina.CombinaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.complex.ComplexRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.concatenate.ConcatenateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.confidence_norm.ConfidenceNormRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.confidence_t.ConfidenceTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.convert.ConvertRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.cos.CosRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.cosh.CoshRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.cot.CotRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coth.CothRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.count.CountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.counta.CountARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.countblank.CountBlankRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.countif.CountIfRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.countifs.CountIfsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coupdaybs.CoupDayBsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coupdays.CoupDaysRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coupdaysnc.CoupDaysNcRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coupncd.CoupNcdRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.coupnum.CoupNumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.couppcd.CoupPcdRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.csc.CscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.csch.CschRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.cumipmt.CumIPmtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.cumprinc.CumPrincRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.date.DateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.datevalue.DatevalueRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.daverage.DaverageRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.day.DayRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.days.DaysRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.days360.Days360RequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.db.DbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dbcs.DbcsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dcount.DcountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dcounta.DcountARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ddb.DdbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dec2bin.Dec2BinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dec2hex.Dec2HexRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dec2oct.Dec2OctRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.decimal.DecimalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.degrees.DegreesRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.delta.DeltaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.devsq.DevSqRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dget.DgetRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.disc.DiscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dmax.DmaxRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dmin.DminRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dollar.DollarRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dollarde.DollarDeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dollarfr.DollarFrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dproduct.DproductRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dstdev.DstDevRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dstdevp.DstDevPRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dsum.DsumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.duration.DurationRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dvar.DvarRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.dvarp.DvarPRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ecma_ceiling.EcmaCeilingRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.edate.EdateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.effect.EffectRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.eomonth.EoMonthRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.erf_precise.ErfPreciseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.erf.ErfRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.erfc_precise.ErfCPreciseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.erfc.ErfCRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.error_type.ErrorTypeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.even.EvenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.exact.ExactRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.exp.ExpRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.expon_dist.ExponDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.f_dist_rt.FDistRTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.f_dist.FDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.f_inv_rt.FInvRTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.f_inv.FInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fact.FactRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.factdouble.FactDoubleRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.falseEscaped.FalseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.find.FindRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.findb.FindBRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fisher.FisherRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fisherinv.FisherInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fixed.FixedRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.floor_math.FloorMathRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.floor_precise.FloorPreciseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fv.FvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.fvschedule.FvscheduleRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gamma_dist.GammaDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gamma_inv.GammaInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gamma.GammaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gammaln_precise.GammaLnPreciseRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gammaln.GammaLnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gauss.GaussRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gcd.GcdRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.geomean.GeoMeanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.gestep.GeStepRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.harmean.HarMeanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hex2bin.Hex2BinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hex2dec.Hex2DecRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hex2oct.Hex2OctRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hlookup.HlookupRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hour.HourRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hyperlink.HyperlinkRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.hypgeom_dist.HypGeomDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ifEscaped.IfRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imabs.ImAbsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imaginary.ImaginaryRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imargument.ImArgumentRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imconjugate.ImConjugateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imcos.ImCosRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imcosh.ImCoshRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imcot.ImCotRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imcsc.ImCscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imcsch.ImCschRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imdiv.ImDivRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imexp.ImExpRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imln.ImLnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imlog10.ImLog10RequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imlog2.ImLog2RequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.impower.ImPowerRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.improduct.ImProductRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imreal.ImRealRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsec.ImSecRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsech.ImSechRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsin.ImSinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsinh.ImSinhRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsqrt.ImSqrtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsub.ImSubRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imsum.ImSumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.imtan.ImTanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.intEscaped.IntRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.intrate.IntRateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ipmt.IpmtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.irr.IrrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.iserr.IsErrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.iserror.IsErrorRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.iseven.IsEvenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isformula.IsFormulaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.islogical.IsLogicalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isna.IsNARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isnontext.IsNonTextRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isnumber.IsNumberRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.iso_ceiling.IsoCeilingRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isodd.IsOddRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isoweeknum.IsoWeekNumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ispmt.IspmtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.isref.IsrefRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.istext.IsTextRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.kurt.KurtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.large.LargeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lcm.LcmRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.left.LeftRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.leftb.LeftbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.len.LenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lenb.LenbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ln.LnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.log.LogRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.log10.Log10RequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lognorm_dist.LogNormDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lognorm_inv.LogNormInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lookup.LookupRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.lower.LowerRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.match.MatchRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.max.MaxRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.maxa.MaxARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mduration.MdurationRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.median.MedianRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mid.MidRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.midb.MidbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.min.MinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mina.MinARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.minute.MinuteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mirr.MirrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mod.ModRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.month.MonthRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.mround.MroundRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.multinomial.MultiNomialRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.n.NRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.na.NaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.negbinom_dist.NegBinomDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.networkdays_intl.NetworkDaysIntlRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.networkdays.NetworkDaysRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.nominal.NominalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.norm_dist.NormDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.norm_inv.NormInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.norm_s_dist.NormSDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.norm_s_inv.NormSInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.not.NotRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.now.NowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.nper.NperRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.npv.NpvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.numbervalue.NumberValueRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oct2bin.Oct2BinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oct2dec.Oct2DecRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oct2hex.Oct2HexRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.odd.OddRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oddfprice.OddFPriceRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oddfyield.OddFYieldRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oddlprice.OddLPriceRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.oddlyield.OddLYieldRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.or.OrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pduration.PdurationRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.percentile_exc.PercentileExcRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.percentile_inc.PercentileIncRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.percentrank_exc.PercentRankExcRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.percentrank_inc.PercentRankIncRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.permut.PermutRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.permutationa.PermutationaRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.phi.PhiRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pi.PiRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pmt.PmtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.poisson_dist.PoissonDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.power.PowerRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.ppmt.PpmtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.price.PriceRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pricedisc.PriceDiscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pricemat.PriceMatRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.product.ProductRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.proper.ProperRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.pv.PvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.quartile_exc.QuartileExcRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.quartile_inc.QuartileIncRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.quotient.QuotientRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.radians.RadiansRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rand.RandRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.randbetween.RandBetweenRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rank_avg.RankAvgRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rank_eq.RankEqRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rate.RateRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.received.ReceivedRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.replace.ReplaceRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.replaceb.ReplaceBRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rept.ReptRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.right.RightRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rightb.RightbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.roman.RomanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.round.RoundRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rounddown.RoundDownRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.roundup.RoundUpRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rows.RowsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.rri.RriRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sec.SecRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sech.SechRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.second.SecondRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.seriessum.SeriesSumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sheet.SheetRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sheets.SheetsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sign.SignRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sin.SinRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sinh.SinhRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.skew_p.SkewPRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.skew.SkewRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sln.SlnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.small.SmallRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sqrt.SqrtRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sqrtpi.SqrtPiRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.standardize.StandardizeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.stdev_p.StDevPRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.stdev_s.StDevSRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.stdeva.StDevARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.stdevpa.StDevPARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.substitute.SubstituteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.subtotal.SubtotalRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sum.SumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sumif.SumIfRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sumifs.SumIfsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.sumsq.SumSqRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.syd.SydRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t_dist_2t.TDist2TRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t_dist_rt.TDistRTRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t_dist.TDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t_inv_2t.TInv2TRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t_inv.TInvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.t.TRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.tan.TanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.tanh.TanhRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.tbilleq.TbillEqRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.tbillprice.TbillPriceRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.tbillyield.TbillYieldRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.text.TextRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.time.TimeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.timevalue.TimevalueRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.today.TodayRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.trim.TrimRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.trimmean.TrimMeanRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.trueEscaped.TrueRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.trunc.TruncRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.type.TypeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.unichar.UnicharRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.unicode.UnicodeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.upper.UpperRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.usdollar.UsdollarRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.value.ValueRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.var_p.VarPRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.var_s.VarSRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.vara.VarARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.varpa.VarPARequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.vdb.VdbRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.vlookup.VlookupRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.weekday.WeekdayRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.weeknum.WeekNumRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.weibull_dist.WeibullDistRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.workday_intl.WorkDayIntlRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.workday.WorkDayRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.xirr.XirrRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.xnpv.XnpvRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.xor.XorRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.year.YearRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.yearfrac.YearFracRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.yield.YieldRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.yielddisc.YieldDiscRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.yieldmat.YieldMatRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.functions.z_test.ZTestRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the functions property of the microsoft.graph.workbook entity.
 */
public class FunctionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the abs method.
     */
    @javax.annotation.Nonnull
    public AbsRequestBuilder abs() {
        return new AbsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the accrInt method.
     */
    @javax.annotation.Nonnull
    public AccrIntRequestBuilder accrInt() {
        return new AccrIntRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the accrIntM method.
     */
    @javax.annotation.Nonnull
    public AccrIntMRequestBuilder accrIntM() {
        return new AccrIntMRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acos method.
     */
    @javax.annotation.Nonnull
    public AcosRequestBuilder acos() {
        return new AcosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acosh method.
     */
    @javax.annotation.Nonnull
    public AcoshRequestBuilder acosh() {
        return new AcoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acot method.
     */
    @javax.annotation.Nonnull
    public AcotRequestBuilder acot() {
        return new AcotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the acoth method.
     */
    @javax.annotation.Nonnull
    public AcothRequestBuilder acoth() {
        return new AcothRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the amorDegrc method.
     */
    @javax.annotation.Nonnull
    public AmorDegrcRequestBuilder amorDegrc() {
        return new AmorDegrcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the amorLinc method.
     */
    @javax.annotation.Nonnull
    public AmorLincRequestBuilder amorLinc() {
        return new AmorLincRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the and method.
     */
    @javax.annotation.Nonnull
    public AndRequestBuilder and() {
        return new AndRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the arabic method.
     */
    @javax.annotation.Nonnull
    public ArabicRequestBuilder arabic() {
        return new ArabicRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the areas method.
     */
    @javax.annotation.Nonnull
    public AreasRequestBuilder areas() {
        return new AreasRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asc method.
     */
    @javax.annotation.Nonnull
    public AscRequestBuilder asc() {
        return new AscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asin method.
     */
    @javax.annotation.Nonnull
    public AsinRequestBuilder asin() {
        return new AsinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the asinh method.
     */
    @javax.annotation.Nonnull
    public AsinhRequestBuilder asinh() {
        return new AsinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atan method.
     */
    @javax.annotation.Nonnull
    public AtanRequestBuilder atan() {
        return new AtanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atan2 method.
     */
    @javax.annotation.Nonnull
    public Atan2RequestBuilder atan2() {
        return new Atan2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the atanh method.
     */
    @javax.annotation.Nonnull
    public AtanhRequestBuilder atanh() {
        return new AtanhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the aveDev method.
     */
    @javax.annotation.Nonnull
    public AveDevRequestBuilder aveDev() {
        return new AveDevRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the average method.
     */
    @javax.annotation.Nonnull
    public AverageRequestBuilder average() {
        return new AverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageA method.
     */
    @javax.annotation.Nonnull
    public AverageARequestBuilder averageA() {
        return new AverageARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageIf method.
     */
    @javax.annotation.Nonnull
    public AverageIfRequestBuilder averageIf() {
        return new AverageIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the averageIfs method.
     */
    @javax.annotation.Nonnull
    public AverageIfsRequestBuilder averageIfs() {
        return new AverageIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bahtText method.
     */
    @javax.annotation.Nonnull
    public BahtTextRequestBuilder bahtText() {
        return new BahtTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the base method.
     */
    @javax.annotation.Nonnull
    public BaseRequestBuilderEscaped base() {
        return new BaseRequestBuilderEscaped(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselI method.
     */
    @javax.annotation.Nonnull
    public BesselIRequestBuilder besselI() {
        return new BesselIRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselJ method.
     */
    @javax.annotation.Nonnull
    public BesselJRequestBuilder besselJ() {
        return new BesselJRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselK method.
     */
    @javax.annotation.Nonnull
    public BesselKRequestBuilder besselK() {
        return new BesselKRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the besselY method.
     */
    @javax.annotation.Nonnull
    public BesselYRequestBuilder besselY() {
        return new BesselYRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the beta_Dist method.
     */
    @javax.annotation.Nonnull
    public BetaDistRequestBuilder beta_Dist() {
        return new BetaDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the beta_Inv method.
     */
    @javax.annotation.Nonnull
    public BetaInvRequestBuilder beta_Inv() {
        return new BetaInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Dec method.
     */
    @javax.annotation.Nonnull
    public Bin2DecRequestBuilder bin2Dec() {
        return new Bin2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Hex method.
     */
    @javax.annotation.Nonnull
    public Bin2HexRequestBuilder bin2Hex() {
        return new Bin2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bin2Oct method.
     */
    @javax.annotation.Nonnull
    public Bin2OctRequestBuilder bin2Oct() {
        return new Bin2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Dist method.
     */
    @javax.annotation.Nonnull
    public BinomDistRequestBuilder binom_Dist() {
        return new BinomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Dist_Range method.
     */
    @javax.annotation.Nonnull
    public BinomDistRangeRequestBuilder binom_Dist_Range() {
        return new BinomDistRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the binom_Inv method.
     */
    @javax.annotation.Nonnull
    public BinomInvRequestBuilder binom_Inv() {
        return new BinomInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitand method.
     */
    @javax.annotation.Nonnull
    public BitandRequestBuilder bitand() {
        return new BitandRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitlshift method.
     */
    @javax.annotation.Nonnull
    public BitlshiftRequestBuilder bitlshift() {
        return new BitlshiftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitor method.
     */
    @javax.annotation.Nonnull
    public BitorRequestBuilder bitor() {
        return new BitorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitrshift method.
     */
    @javax.annotation.Nonnull
    public BitrshiftRequestBuilder bitrshift() {
        return new BitrshiftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the bitxor method.
     */
    @javax.annotation.Nonnull
    public BitxorRequestBuilder bitxor() {
        return new BitxorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ceiling_Math method.
     */
    @javax.annotation.Nonnull
    public CeilingMathRequestBuilder ceiling_Math() {
        return new CeilingMathRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ceiling_Precise method.
     */
    @javax.annotation.Nonnull
    public CeilingPreciseRequestBuilder ceiling_Precise() {
        return new CeilingPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the char method.
     */
    @javax.annotation.Nonnull
    public CharRequestBuilder charEscaped() {
        return new CharRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Dist method.
     */
    @javax.annotation.Nonnull
    public ChiSqDistRequestBuilder chiSq_Dist() {
        return new ChiSqDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Dist_RT method.
     */
    @javax.annotation.Nonnull
    public ChiSqDistRTRequestBuilder chiSq_Dist_RT() {
        return new ChiSqDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Inv method.
     */
    @javax.annotation.Nonnull
    public ChiSqInvRequestBuilder chiSq_Inv() {
        return new ChiSqInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the chiSq_Inv_RT method.
     */
    @javax.annotation.Nonnull
    public ChiSqInvRTRequestBuilder chiSq_Inv_RT() {
        return new ChiSqInvRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the choose method.
     */
    @javax.annotation.Nonnull
    public ChooseRequestBuilder choose() {
        return new ChooseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clean method.
     */
    @javax.annotation.Nonnull
    public CleanRequestBuilder clean() {
        return new CleanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the code method.
     */
    @javax.annotation.Nonnull
    public CodeRequestBuilder code() {
        return new CodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the columns method.
     */
    @javax.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the combin method.
     */
    @javax.annotation.Nonnull
    public CombinRequestBuilder combin() {
        return new CombinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the combina method.
     */
    @javax.annotation.Nonnull
    public CombinaRequestBuilder combina() {
        return new CombinaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the complex method.
     */
    @javax.annotation.Nonnull
    public ComplexRequestBuilder complex() {
        return new ComplexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the concatenate method.
     */
    @javax.annotation.Nonnull
    public ConcatenateRequestBuilder concatenate() {
        return new ConcatenateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the confidence_Norm method.
     */
    @javax.annotation.Nonnull
    public ConfidenceNormRequestBuilder confidence_Norm() {
        return new ConfidenceNormRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the confidence_T method.
     */
    @javax.annotation.Nonnull
    public ConfidenceTRequestBuilder confidence_T() {
        return new ConfidenceTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the convert method.
     */
    @javax.annotation.Nonnull
    public ConvertRequestBuilder convert() {
        return new ConvertRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cos method.
     */
    @javax.annotation.Nonnull
    public CosRequestBuilder cos() {
        return new CosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cosh method.
     */
    @javax.annotation.Nonnull
    public CoshRequestBuilder cosh() {
        return new CoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cot method.
     */
    @javax.annotation.Nonnull
    public CotRequestBuilder cot() {
        return new CotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coth method.
     */
    @javax.annotation.Nonnull
    public CothRequestBuilder coth() {
        return new CothRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the count method.
     */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countA method.
     */
    @javax.annotation.Nonnull
    public CountARequestBuilder countA() {
        return new CountARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countBlank method.
     */
    @javax.annotation.Nonnull
    public CountBlankRequestBuilder countBlank() {
        return new CountBlankRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countIf method.
     */
    @javax.annotation.Nonnull
    public CountIfRequestBuilder countIf() {
        return new CountIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the countIfs method.
     */
    @javax.annotation.Nonnull
    public CountIfsRequestBuilder countIfs() {
        return new CountIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDayBs method.
     */
    @javax.annotation.Nonnull
    public CoupDayBsRequestBuilder coupDayBs() {
        return new CoupDayBsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDays method.
     */
    @javax.annotation.Nonnull
    public CoupDaysRequestBuilder coupDays() {
        return new CoupDaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupDaysNc method.
     */
    @javax.annotation.Nonnull
    public CoupDaysNcRequestBuilder coupDaysNc() {
        return new CoupDaysNcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupNcd method.
     */
    @javax.annotation.Nonnull
    public CoupNcdRequestBuilder coupNcd() {
        return new CoupNcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupNum method.
     */
    @javax.annotation.Nonnull
    public CoupNumRequestBuilder coupNum() {
        return new CoupNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the coupPcd method.
     */
    @javax.annotation.Nonnull
    public CoupPcdRequestBuilder coupPcd() {
        return new CoupPcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the csc method.
     */
    @javax.annotation.Nonnull
    public CscRequestBuilder csc() {
        return new CscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the csch method.
     */
    @javax.annotation.Nonnull
    public CschRequestBuilder csch() {
        return new CschRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cumIPmt method.
     */
    @javax.annotation.Nonnull
    public CumIPmtRequestBuilder cumIPmt() {
        return new CumIPmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cumPrinc method.
     */
    @javax.annotation.Nonnull
    public CumPrincRequestBuilder cumPrinc() {
        return new CumPrincRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the date method.
     */
    @javax.annotation.Nonnull
    public DateRequestBuilder date() {
        return new DateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the datevalue method.
     */
    @javax.annotation.Nonnull
    public DatevalueRequestBuilder datevalue() {
        return new DatevalueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the daverage method.
     */
    @javax.annotation.Nonnull
    public DaverageRequestBuilder daverage() {
        return new DaverageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the day method.
     */
    @javax.annotation.Nonnull
    public DayRequestBuilder day() {
        return new DayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the days method.
     */
    @javax.annotation.Nonnull
    public DaysRequestBuilder days() {
        return new DaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the days360 method.
     */
    @javax.annotation.Nonnull
    public Days360RequestBuilder days360() {
        return new Days360RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the db method.
     */
    @javax.annotation.Nonnull
    public DbRequestBuilder db() {
        return new DbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dbcs method.
     */
    @javax.annotation.Nonnull
    public DbcsRequestBuilder dbcs() {
        return new DbcsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dcount method.
     */
    @javax.annotation.Nonnull
    public DcountRequestBuilder dcount() {
        return new DcountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dcountA method.
     */
    @javax.annotation.Nonnull
    public DcountARequestBuilder dcountA() {
        return new DcountARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ddb method.
     */
    @javax.annotation.Nonnull
    public DdbRequestBuilder ddb() {
        return new DdbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Bin method.
     */
    @javax.annotation.Nonnull
    public Dec2BinRequestBuilder dec2Bin() {
        return new Dec2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Hex method.
     */
    @javax.annotation.Nonnull
    public Dec2HexRequestBuilder dec2Hex() {
        return new Dec2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dec2Oct method.
     */
    @javax.annotation.Nonnull
    public Dec2OctRequestBuilder dec2Oct() {
        return new Dec2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the decimal method.
     */
    @javax.annotation.Nonnull
    public DecimalRequestBuilder decimal() {
        return new DecimalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the degrees method.
     */
    @javax.annotation.Nonnull
    public DegreesRequestBuilder degrees() {
        return new DegreesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the devSq method.
     */
    @javax.annotation.Nonnull
    public DevSqRequestBuilder devSq() {
        return new DevSqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dget method.
     */
    @javax.annotation.Nonnull
    public DgetRequestBuilder dget() {
        return new DgetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disc method.
     */
    @javax.annotation.Nonnull
    public DiscRequestBuilder disc() {
        return new DiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dmax method.
     */
    @javax.annotation.Nonnull
    public DmaxRequestBuilder dmax() {
        return new DmaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dmin method.
     */
    @javax.annotation.Nonnull
    public DminRequestBuilder dmin() {
        return new DminRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollar method.
     */
    @javax.annotation.Nonnull
    public DollarRequestBuilder dollar() {
        return new DollarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollarDe method.
     */
    @javax.annotation.Nonnull
    public DollarDeRequestBuilder dollarDe() {
        return new DollarDeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dollarFr method.
     */
    @javax.annotation.Nonnull
    public DollarFrRequestBuilder dollarFr() {
        return new DollarFrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dproduct method.
     */
    @javax.annotation.Nonnull
    public DproductRequestBuilder dproduct() {
        return new DproductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dstDev method.
     */
    @javax.annotation.Nonnull
    public DstDevRequestBuilder dstDev() {
        return new DstDevRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dstDevP method.
     */
    @javax.annotation.Nonnull
    public DstDevPRequestBuilder dstDevP() {
        return new DstDevPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dsum method.
     */
    @javax.annotation.Nonnull
    public DsumRequestBuilder dsum() {
        return new DsumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the duration method.
     */
    @javax.annotation.Nonnull
    public DurationRequestBuilder duration() {
        return new DurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dvar method.
     */
    @javax.annotation.Nonnull
    public DvarRequestBuilder dvar() {
        return new DvarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dvarP method.
     */
    @javax.annotation.Nonnull
    public DvarPRequestBuilder dvarP() {
        return new DvarPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ecma_Ceiling method.
     */
    @javax.annotation.Nonnull
    public EcmaCeilingRequestBuilder ecma_Ceiling() {
        return new EcmaCeilingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the edate method.
     */
    @javax.annotation.Nonnull
    public EdateRequestBuilder edate() {
        return new EdateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the effect method.
     */
    @javax.annotation.Nonnull
    public EffectRequestBuilder effect() {
        return new EffectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the eoMonth method.
     */
    @javax.annotation.Nonnull
    public EoMonthRequestBuilder eoMonth() {
        return new EoMonthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erf method.
     */
    @javax.annotation.Nonnull
    public ErfRequestBuilder erf() {
        return new ErfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erf_Precise method.
     */
    @javax.annotation.Nonnull
    public ErfPreciseRequestBuilder erf_Precise() {
        return new ErfPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erfC method.
     */
    @javax.annotation.Nonnull
    public ErfCRequestBuilder erfC() {
        return new ErfCRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the erfC_Precise method.
     */
    @javax.annotation.Nonnull
    public ErfCPreciseRequestBuilder erfC_Precise() {
        return new ErfCPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the error_Type method.
     */
    @javax.annotation.Nonnull
    public ErrorTypeRequestBuilder error_Type() {
        return new ErrorTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the even method.
     */
    @javax.annotation.Nonnull
    public EvenRequestBuilder even() {
        return new EvenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exact method.
     */
    @javax.annotation.Nonnull
    public ExactRequestBuilder exact() {
        return new ExactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exp method.
     */
    @javax.annotation.Nonnull
    public ExpRequestBuilder exp() {
        return new ExpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the expon_Dist method.
     */
    @javax.annotation.Nonnull
    public ExponDistRequestBuilder expon_Dist() {
        return new ExponDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Dist method.
     */
    @javax.annotation.Nonnull
    public FDistRequestBuilder f_Dist() {
        return new FDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Dist_RT method.
     */
    @javax.annotation.Nonnull
    public FDistRTRequestBuilder f_Dist_RT() {
        return new FDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Inv method.
     */
    @javax.annotation.Nonnull
    public FInvRequestBuilder f_Inv() {
        return new FInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the f_Inv_RT method.
     */
    @javax.annotation.Nonnull
    public FInvRTRequestBuilder f_Inv_RT() {
        return new FInvRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fact method.
     */
    @javax.annotation.Nonnull
    public FactRequestBuilder fact() {
        return new FactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the factDouble method.
     */
    @javax.annotation.Nonnull
    public FactDoubleRequestBuilder factDouble() {
        return new FactDoubleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the false method.
     */
    @javax.annotation.Nonnull
    public FalseRequestBuilder falseEscaped() {
        return new FalseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the find method.
     */
    @javax.annotation.Nonnull
    public FindRequestBuilder find() {
        return new FindRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findB method.
     */
    @javax.annotation.Nonnull
    public FindBRequestBuilder findB() {
        return new FindBRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fisher method.
     */
    @javax.annotation.Nonnull
    public FisherRequestBuilder fisher() {
        return new FisherRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fisherInv method.
     */
    @javax.annotation.Nonnull
    public FisherInvRequestBuilder fisherInv() {
        return new FisherInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fixed method.
     */
    @javax.annotation.Nonnull
    public FixedRequestBuilder fixed() {
        return new FixedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the floor_Math method.
     */
    @javax.annotation.Nonnull
    public FloorMathRequestBuilder floor_Math() {
        return new FloorMathRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the floor_Precise method.
     */
    @javax.annotation.Nonnull
    public FloorPreciseRequestBuilder floor_Precise() {
        return new FloorPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fv method.
     */
    @javax.annotation.Nonnull
    public FvRequestBuilder fv() {
        return new FvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the fvschedule method.
     */
    @javax.annotation.Nonnull
    public FvscheduleRequestBuilder fvschedule() {
        return new FvscheduleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma method.
     */
    @javax.annotation.Nonnull
    public GammaRequestBuilder gamma() {
        return new GammaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma_Dist method.
     */
    @javax.annotation.Nonnull
    public GammaDistRequestBuilder gamma_Dist() {
        return new GammaDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gamma_Inv method.
     */
    @javax.annotation.Nonnull
    public GammaInvRequestBuilder gamma_Inv() {
        return new GammaInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gammaLn method.
     */
    @javax.annotation.Nonnull
    public GammaLnRequestBuilder gammaLn() {
        return new GammaLnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gammaLn_Precise method.
     */
    @javax.annotation.Nonnull
    public GammaLnPreciseRequestBuilder gammaLn_Precise() {
        return new GammaLnPreciseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gauss method.
     */
    @javax.annotation.Nonnull
    public GaussRequestBuilder gauss() {
        return new GaussRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the gcd method.
     */
    @javax.annotation.Nonnull
    public GcdRequestBuilder gcd() {
        return new GcdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the geoMean method.
     */
    @javax.annotation.Nonnull
    public GeoMeanRequestBuilder geoMean() {
        return new GeoMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the geStep method.
     */
    @javax.annotation.Nonnull
    public GeStepRequestBuilder geStep() {
        return new GeStepRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the harMean method.
     */
    @javax.annotation.Nonnull
    public HarMeanRequestBuilder harMean() {
        return new HarMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Bin method.
     */
    @javax.annotation.Nonnull
    public Hex2BinRequestBuilder hex2Bin() {
        return new Hex2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Dec method.
     */
    @javax.annotation.Nonnull
    public Hex2DecRequestBuilder hex2Dec() {
        return new Hex2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hex2Oct method.
     */
    @javax.annotation.Nonnull
    public Hex2OctRequestBuilder hex2Oct() {
        return new Hex2OctRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hlookup method.
     */
    @javax.annotation.Nonnull
    public HlookupRequestBuilder hlookup() {
        return new HlookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hour method.
     */
    @javax.annotation.Nonnull
    public HourRequestBuilder hour() {
        return new HourRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hyperlink method.
     */
    @javax.annotation.Nonnull
    public HyperlinkRequestBuilder hyperlink() {
        return new HyperlinkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hypGeom_Dist method.
     */
    @javax.annotation.Nonnull
    public HypGeomDistRequestBuilder hypGeom_Dist() {
        return new HypGeomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the if method.
     */
    @javax.annotation.Nonnull
    public IfRequestBuilder ifEscaped() {
        return new IfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imAbs method.
     */
    @javax.annotation.Nonnull
    public ImAbsRequestBuilder imAbs() {
        return new ImAbsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imaginary method.
     */
    @javax.annotation.Nonnull
    public ImaginaryRequestBuilder imaginary() {
        return new ImaginaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imArgument method.
     */
    @javax.annotation.Nonnull
    public ImArgumentRequestBuilder imArgument() {
        return new ImArgumentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imConjugate method.
     */
    @javax.annotation.Nonnull
    public ImConjugateRequestBuilder imConjugate() {
        return new ImConjugateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCos method.
     */
    @javax.annotation.Nonnull
    public ImCosRequestBuilder imCos() {
        return new ImCosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCosh method.
     */
    @javax.annotation.Nonnull
    public ImCoshRequestBuilder imCosh() {
        return new ImCoshRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCot method.
     */
    @javax.annotation.Nonnull
    public ImCotRequestBuilder imCot() {
        return new ImCotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCsc method.
     */
    @javax.annotation.Nonnull
    public ImCscRequestBuilder imCsc() {
        return new ImCscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imCsch method.
     */
    @javax.annotation.Nonnull
    public ImCschRequestBuilder imCsch() {
        return new ImCschRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imDiv method.
     */
    @javax.annotation.Nonnull
    public ImDivRequestBuilder imDiv() {
        return new ImDivRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imExp method.
     */
    @javax.annotation.Nonnull
    public ImExpRequestBuilder imExp() {
        return new ImExpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLn method.
     */
    @javax.annotation.Nonnull
    public ImLnRequestBuilder imLn() {
        return new ImLnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLog10 method.
     */
    @javax.annotation.Nonnull
    public ImLog10RequestBuilder imLog10() {
        return new ImLog10RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imLog2 method.
     */
    @javax.annotation.Nonnull
    public ImLog2RequestBuilder imLog2() {
        return new ImLog2RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imPower method.
     */
    @javax.annotation.Nonnull
    public ImPowerRequestBuilder imPower() {
        return new ImPowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imProduct method.
     */
    @javax.annotation.Nonnull
    public ImProductRequestBuilder imProduct() {
        return new ImProductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imReal method.
     */
    @javax.annotation.Nonnull
    public ImRealRequestBuilder imReal() {
        return new ImRealRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSec method.
     */
    @javax.annotation.Nonnull
    public ImSecRequestBuilder imSec() {
        return new ImSecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSech method.
     */
    @javax.annotation.Nonnull
    public ImSechRequestBuilder imSech() {
        return new ImSechRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSin method.
     */
    @javax.annotation.Nonnull
    public ImSinRequestBuilder imSin() {
        return new ImSinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSinh method.
     */
    @javax.annotation.Nonnull
    public ImSinhRequestBuilder imSinh() {
        return new ImSinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSqrt method.
     */
    @javax.annotation.Nonnull
    public ImSqrtRequestBuilder imSqrt() {
        return new ImSqrtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSub method.
     */
    @javax.annotation.Nonnull
    public ImSubRequestBuilder imSub() {
        return new ImSubRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imSum method.
     */
    @javax.annotation.Nonnull
    public ImSumRequestBuilder imSum() {
        return new ImSumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the imTan method.
     */
    @javax.annotation.Nonnull
    public ImTanRequestBuilder imTan() {
        return new ImTanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the int method.
     */
    @javax.annotation.Nonnull
    public IntRequestBuilder intEscaped() {
        return new IntRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the intRate method.
     */
    @javax.annotation.Nonnull
    public IntRateRequestBuilder intRate() {
        return new IntRateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ipmt method.
     */
    @javax.annotation.Nonnull
    public IpmtRequestBuilder ipmt() {
        return new IpmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the irr method.
     */
    @javax.annotation.Nonnull
    public IrrRequestBuilder irr() {
        return new IrrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isErr method.
     */
    @javax.annotation.Nonnull
    public IsErrRequestBuilder isErr() {
        return new IsErrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isError method.
     */
    @javax.annotation.Nonnull
    public IsErrorRequestBuilder isError() {
        return new IsErrorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isEven method.
     */
    @javax.annotation.Nonnull
    public IsEvenRequestBuilder isEven() {
        return new IsEvenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isFormula method.
     */
    @javax.annotation.Nonnull
    public IsFormulaRequestBuilder isFormula() {
        return new IsFormulaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isLogical method.
     */
    @javax.annotation.Nonnull
    public IsLogicalRequestBuilder isLogical() {
        return new IsLogicalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNA method.
     */
    @javax.annotation.Nonnull
    public IsNARequestBuilder isNA() {
        return new IsNARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNonText method.
     */
    @javax.annotation.Nonnull
    public IsNonTextRequestBuilder isNonText() {
        return new IsNonTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isNumber method.
     */
    @javax.annotation.Nonnull
    public IsNumberRequestBuilder isNumber() {
        return new IsNumberRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the iso_Ceiling method.
     */
    @javax.annotation.Nonnull
    public IsoCeilingRequestBuilder iso_Ceiling() {
        return new IsoCeilingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isOdd method.
     */
    @javax.annotation.Nonnull
    public IsOddRequestBuilder isOdd() {
        return new IsOddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isoWeekNum method.
     */
    @javax.annotation.Nonnull
    public IsoWeekNumRequestBuilder isoWeekNum() {
        return new IsoWeekNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ispmt method.
     */
    @javax.annotation.Nonnull
    public IspmtRequestBuilder ispmt() {
        return new IspmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isref method.
     */
    @javax.annotation.Nonnull
    public IsrefRequestBuilder isref() {
        return new IsrefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isText method.
     */
    @javax.annotation.Nonnull
    public IsTextRequestBuilder isText() {
        return new IsTextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the kurt method.
     */
    @javax.annotation.Nonnull
    public KurtRequestBuilder kurt() {
        return new KurtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the large method.
     */
    @javax.annotation.Nonnull
    public LargeRequestBuilder large() {
        return new LargeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lcm method.
     */
    @javax.annotation.Nonnull
    public LcmRequestBuilder lcm() {
        return new LcmRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the left method.
     */
    @javax.annotation.Nonnull
    public LeftRequestBuilder left() {
        return new LeftRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the leftb method.
     */
    @javax.annotation.Nonnull
    public LeftbRequestBuilder leftb() {
        return new LeftbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the len method.
     */
    @javax.annotation.Nonnull
    public LenRequestBuilder len() {
        return new LenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lenb method.
     */
    @javax.annotation.Nonnull
    public LenbRequestBuilder lenb() {
        return new LenbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ln method.
     */
    @javax.annotation.Nonnull
    public LnRequestBuilder ln() {
        return new LnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the log method.
     */
    @javax.annotation.Nonnull
    public LogRequestBuilder log() {
        return new LogRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the log10 method.
     */
    @javax.annotation.Nonnull
    public Log10RequestBuilder log10() {
        return new Log10RequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logNorm_Dist method.
     */
    @javax.annotation.Nonnull
    public LogNormDistRequestBuilder logNorm_Dist() {
        return new LogNormDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the logNorm_Inv method.
     */
    @javax.annotation.Nonnull
    public LogNormInvRequestBuilder logNorm_Inv() {
        return new LogNormInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lookup method.
     */
    @javax.annotation.Nonnull
    public LookupRequestBuilder lookup() {
        return new LookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lower method.
     */
    @javax.annotation.Nonnull
    public LowerRequestBuilder lower() {
        return new LowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the match method.
     */
    @javax.annotation.Nonnull
    public MatchRequestBuilder match() {
        return new MatchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the max method.
     */
    @javax.annotation.Nonnull
    public MaxRequestBuilder max() {
        return new MaxRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the maxA method.
     */
    @javax.annotation.Nonnull
    public MaxARequestBuilder maxA() {
        return new MaxARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mduration method.
     */
    @javax.annotation.Nonnull
    public MdurationRequestBuilder mduration() {
        return new MdurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the median method.
     */
    @javax.annotation.Nonnull
    public MedianRequestBuilder median() {
        return new MedianRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mid method.
     */
    @javax.annotation.Nonnull
    public MidRequestBuilder mid() {
        return new MidRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the midb method.
     */
    @javax.annotation.Nonnull
    public MidbRequestBuilder midb() {
        return new MidbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the min method.
     */
    @javax.annotation.Nonnull
    public MinRequestBuilder min() {
        return new MinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the minA method.
     */
    @javax.annotation.Nonnull
    public MinARequestBuilder minA() {
        return new MinARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the minute method.
     */
    @javax.annotation.Nonnull
    public MinuteRequestBuilder minute() {
        return new MinuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mirr method.
     */
    @javax.annotation.Nonnull
    public MirrRequestBuilder mirr() {
        return new MirrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mod method.
     */
    @javax.annotation.Nonnull
    public ModRequestBuilder mod() {
        return new ModRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the month method.
     */
    @javax.annotation.Nonnull
    public MonthRequestBuilder month() {
        return new MonthRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mround method.
     */
    @javax.annotation.Nonnull
    public MroundRequestBuilder mround() {
        return new MroundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the multiNomial method.
     */
    @javax.annotation.Nonnull
    public MultiNomialRequestBuilder multiNomial() {
        return new MultiNomialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the n method.
     */
    @javax.annotation.Nonnull
    public NRequestBuilder n() {
        return new NRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the na method.
     */
    @javax.annotation.Nonnull
    public NaRequestBuilder na() {
        return new NaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the negBinom_Dist method.
     */
    @javax.annotation.Nonnull
    public NegBinomDistRequestBuilder negBinom_Dist() {
        return new NegBinomDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the networkDays method.
     */
    @javax.annotation.Nonnull
    public NetworkDaysRequestBuilder networkDays() {
        return new NetworkDaysRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the networkDays_Intl method.
     */
    @javax.annotation.Nonnull
    public NetworkDaysIntlRequestBuilder networkDays_Intl() {
        return new NetworkDaysIntlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the nominal method.
     */
    @javax.annotation.Nonnull
    public NominalRequestBuilder nominal() {
        return new NominalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_Dist method.
     */
    @javax.annotation.Nonnull
    public NormDistRequestBuilder norm_Dist() {
        return new NormDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_Inv method.
     */
    @javax.annotation.Nonnull
    public NormInvRequestBuilder norm_Inv() {
        return new NormInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_S_Dist method.
     */
    @javax.annotation.Nonnull
    public NormSDistRequestBuilder norm_S_Dist() {
        return new NormSDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the norm_S_Inv method.
     */
    @javax.annotation.Nonnull
    public NormSInvRequestBuilder norm_S_Inv() {
        return new NormSInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the not method.
     */
    @javax.annotation.Nonnull
    public NotRequestBuilder not() {
        return new NotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the now method.
     */
    @javax.annotation.Nonnull
    public NowRequestBuilder now() {
        return new NowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the nper method.
     */
    @javax.annotation.Nonnull
    public NperRequestBuilder nper() {
        return new NperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the npv method.
     */
    @javax.annotation.Nonnull
    public NpvRequestBuilder npv() {
        return new NpvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the numberValue method.
     */
    @javax.annotation.Nonnull
    public NumberValueRequestBuilder numberValue() {
        return new NumberValueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Bin method.
     */
    @javax.annotation.Nonnull
    public Oct2BinRequestBuilder oct2Bin() {
        return new Oct2BinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Dec method.
     */
    @javax.annotation.Nonnull
    public Oct2DecRequestBuilder oct2Dec() {
        return new Oct2DecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oct2Hex method.
     */
    @javax.annotation.Nonnull
    public Oct2HexRequestBuilder oct2Hex() {
        return new Oct2HexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the odd method.
     */
    @javax.annotation.Nonnull
    public OddRequestBuilder odd() {
        return new OddRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddFPrice method.
     */
    @javax.annotation.Nonnull
    public OddFPriceRequestBuilder oddFPrice() {
        return new OddFPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddFYield method.
     */
    @javax.annotation.Nonnull
    public OddFYieldRequestBuilder oddFYield() {
        return new OddFYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddLPrice method.
     */
    @javax.annotation.Nonnull
    public OddLPriceRequestBuilder oddLPrice() {
        return new OddLPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the oddLYield method.
     */
    @javax.annotation.Nonnull
    public OddLYieldRequestBuilder oddLYield() {
        return new OddLYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the or method.
     */
    @javax.annotation.Nonnull
    public OrRequestBuilder or() {
        return new OrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pduration method.
     */
    @javax.annotation.Nonnull
    public PdurationRequestBuilder pduration() {
        return new PdurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentile_Exc method.
     */
    @javax.annotation.Nonnull
    public PercentileExcRequestBuilder percentile_Exc() {
        return new PercentileExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentile_Inc method.
     */
    @javax.annotation.Nonnull
    public PercentileIncRequestBuilder percentile_Inc() {
        return new PercentileIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentRank_Exc method.
     */
    @javax.annotation.Nonnull
    public PercentRankExcRequestBuilder percentRank_Exc() {
        return new PercentRankExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the percentRank_Inc method.
     */
    @javax.annotation.Nonnull
    public PercentRankIncRequestBuilder percentRank_Inc() {
        return new PercentRankIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permut method.
     */
    @javax.annotation.Nonnull
    public PermutRequestBuilder permut() {
        return new PermutRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the permutationa method.
     */
    @javax.annotation.Nonnull
    public PermutationaRequestBuilder permutationa() {
        return new PermutationaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the phi method.
     */
    @javax.annotation.Nonnull
    public PhiRequestBuilder phi() {
        return new PhiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pi method.
     */
    @javax.annotation.Nonnull
    public PiRequestBuilder pi() {
        return new PiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pmt method.
     */
    @javax.annotation.Nonnull
    public PmtRequestBuilder pmt() {
        return new PmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the poisson_Dist method.
     */
    @javax.annotation.Nonnull
    public PoissonDistRequestBuilder poisson_Dist() {
        return new PoissonDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the power method.
     */
    @javax.annotation.Nonnull
    public PowerRequestBuilder power() {
        return new PowerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the ppmt method.
     */
    @javax.annotation.Nonnull
    public PpmtRequestBuilder ppmt() {
        return new PpmtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the price method.
     */
    @javax.annotation.Nonnull
    public PriceRequestBuilder price() {
        return new PriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the priceDisc method.
     */
    @javax.annotation.Nonnull
    public PriceDiscRequestBuilder priceDisc() {
        return new PriceDiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the priceMat method.
     */
    @javax.annotation.Nonnull
    public PriceMatRequestBuilder priceMat() {
        return new PriceMatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the product method.
     */
    @javax.annotation.Nonnull
    public ProductRequestBuilder product() {
        return new ProductRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the proper method.
     */
    @javax.annotation.Nonnull
    public ProperRequestBuilder proper() {
        return new ProperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the pv method.
     */
    @javax.annotation.Nonnull
    public PvRequestBuilder pv() {
        return new PvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quartile_Exc method.
     */
    @javax.annotation.Nonnull
    public QuartileExcRequestBuilder quartile_Exc() {
        return new QuartileExcRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quartile_Inc method.
     */
    @javax.annotation.Nonnull
    public QuartileIncRequestBuilder quartile_Inc() {
        return new QuartileIncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the quotient method.
     */
    @javax.annotation.Nonnull
    public QuotientRequestBuilder quotient() {
        return new QuotientRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the radians method.
     */
    @javax.annotation.Nonnull
    public RadiansRequestBuilder radians() {
        return new RadiansRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rand method.
     */
    @javax.annotation.Nonnull
    public RandRequestBuilder rand() {
        return new RandRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the randBetween method.
     */
    @javax.annotation.Nonnull
    public RandBetweenRequestBuilder randBetween() {
        return new RandBetweenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rank_Avg method.
     */
    @javax.annotation.Nonnull
    public RankAvgRequestBuilder rank_Avg() {
        return new RankAvgRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rank_Eq method.
     */
    @javax.annotation.Nonnull
    public RankEqRequestBuilder rank_Eq() {
        return new RankEqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rate method.
     */
    @javax.annotation.Nonnull
    public RateRequestBuilder rate() {
        return new RateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the received method.
     */
    @javax.annotation.Nonnull
    public ReceivedRequestBuilder received() {
        return new ReceivedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replace method.
     */
    @javax.annotation.Nonnull
    public ReplaceRequestBuilder replace() {
        return new ReplaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the replaceB method.
     */
    @javax.annotation.Nonnull
    public ReplaceBRequestBuilder replaceB() {
        return new ReplaceBRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rept method.
     */
    @javax.annotation.Nonnull
    public ReptRequestBuilder rept() {
        return new ReptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the right method.
     */
    @javax.annotation.Nonnull
    public RightRequestBuilder right() {
        return new RightRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rightb method.
     */
    @javax.annotation.Nonnull
    public RightbRequestBuilder rightb() {
        return new RightbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roman method.
     */
    @javax.annotation.Nonnull
    public RomanRequestBuilder roman() {
        return new RomanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the round method.
     */
    @javax.annotation.Nonnull
    public RoundRequestBuilder round() {
        return new RoundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roundDown method.
     */
    @javax.annotation.Nonnull
    public RoundDownRequestBuilder roundDown() {
        return new RoundDownRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roundUp method.
     */
    @javax.annotation.Nonnull
    public RoundUpRequestBuilder roundUp() {
        return new RoundUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rows method.
     */
    @javax.annotation.Nonnull
    public RowsRequestBuilder rows() {
        return new RowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rri method.
     */
    @javax.annotation.Nonnull
    public RriRequestBuilder rri() {
        return new RriRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sec method.
     */
    @javax.annotation.Nonnull
    public SecRequestBuilder sec() {
        return new SecRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sech method.
     */
    @javax.annotation.Nonnull
    public SechRequestBuilder sech() {
        return new SechRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the second method.
     */
    @javax.annotation.Nonnull
    public SecondRequestBuilder second() {
        return new SecondRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the seriesSum method.
     */
    @javax.annotation.Nonnull
    public SeriesSumRequestBuilder seriesSum() {
        return new SeriesSumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sheet method.
     */
    @javax.annotation.Nonnull
    public SheetRequestBuilder sheet() {
        return new SheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sheets method.
     */
    @javax.annotation.Nonnull
    public SheetsRequestBuilder sheets() {
        return new SheetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sign method.
     */
    @javax.annotation.Nonnull
    public SignRequestBuilder sign() {
        return new SignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sin method.
     */
    @javax.annotation.Nonnull
    public SinRequestBuilder sin() {
        return new SinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sinh method.
     */
    @javax.annotation.Nonnull
    public SinhRequestBuilder sinh() {
        return new SinhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the skew method.
     */
    @javax.annotation.Nonnull
    public SkewRequestBuilder skew() {
        return new SkewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the skew_p method.
     */
    @javax.annotation.Nonnull
    public SkewPRequestBuilder skew_p() {
        return new SkewPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sln method.
     */
    @javax.annotation.Nonnull
    public SlnRequestBuilder sln() {
        return new SlnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the small method.
     */
    @javax.annotation.Nonnull
    public SmallRequestBuilder small() {
        return new SmallRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sqrt method.
     */
    @javax.annotation.Nonnull
    public SqrtRequestBuilder sqrt() {
        return new SqrtRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sqrtPi method.
     */
    @javax.annotation.Nonnull
    public SqrtPiRequestBuilder sqrtPi() {
        return new SqrtPiRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the standardize method.
     */
    @javax.annotation.Nonnull
    public StandardizeRequestBuilder standardize() {
        return new StandardizeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDev_P method.
     */
    @javax.annotation.Nonnull
    public StDevPRequestBuilder stDev_P() {
        return new StDevPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDev_S method.
     */
    @javax.annotation.Nonnull
    public StDevSRequestBuilder stDev_S() {
        return new StDevSRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDevA method.
     */
    @javax.annotation.Nonnull
    public StDevARequestBuilder stDevA() {
        return new StDevARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stDevPA method.
     */
    @javax.annotation.Nonnull
    public StDevPARequestBuilder stDevPA() {
        return new StDevPARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the substitute method.
     */
    @javax.annotation.Nonnull
    public SubstituteRequestBuilder substitute() {
        return new SubstituteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subtotal method.
     */
    @javax.annotation.Nonnull
    public SubtotalRequestBuilder subtotal() {
        return new SubtotalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sum method.
     */
    @javax.annotation.Nonnull
    public SumRequestBuilder sum() {
        return new SumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumIf method.
     */
    @javax.annotation.Nonnull
    public SumIfRequestBuilder sumIf() {
        return new SumIfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumIfs method.
     */
    @javax.annotation.Nonnull
    public SumIfsRequestBuilder sumIfs() {
        return new SumIfsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sumSq method.
     */
    @javax.annotation.Nonnull
    public SumSqRequestBuilder sumSq() {
        return new SumSqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the syd method.
     */
    @javax.annotation.Nonnull
    public SydRequestBuilder syd() {
        return new SydRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t method.
     */
    @javax.annotation.Nonnull
    public TRequestBuilder t() {
        return new TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist method.
     */
    @javax.annotation.Nonnull
    public TDistRequestBuilder t_Dist() {
        return new TDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist_2T method.
     */
    @javax.annotation.Nonnull
    public TDist2TRequestBuilder t_Dist_2T() {
        return new TDist2TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Dist_RT method.
     */
    @javax.annotation.Nonnull
    public TDistRTRequestBuilder t_Dist_RT() {
        return new TDistRTRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Inv method.
     */
    @javax.annotation.Nonnull
    public TInvRequestBuilder t_Inv() {
        return new TInvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the t_Inv_2T method.
     */
    @javax.annotation.Nonnull
    public TInv2TRequestBuilder t_Inv_2T() {
        return new TInv2TRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tan method.
     */
    @javax.annotation.Nonnull
    public TanRequestBuilder tan() {
        return new TanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tanh method.
     */
    @javax.annotation.Nonnull
    public TanhRequestBuilder tanh() {
        return new TanhRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillEq method.
     */
    @javax.annotation.Nonnull
    public TbillEqRequestBuilder tbillEq() {
        return new TbillEqRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillPrice method.
     */
    @javax.annotation.Nonnull
    public TbillPriceRequestBuilder tbillPrice() {
        return new TbillPriceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the tbillYield method.
     */
    @javax.annotation.Nonnull
    public TbillYieldRequestBuilder tbillYield() {
        return new TbillYieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the text method.
     */
    @javax.annotation.Nonnull
    public TextRequestBuilder text() {
        return new TextRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the time method.
     */
    @javax.annotation.Nonnull
    public TimeRequestBuilder time() {
        return new TimeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the timevalue method.
     */
    @javax.annotation.Nonnull
    public TimevalueRequestBuilder timevalue() {
        return new TimevalueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the today method.
     */
    @javax.annotation.Nonnull
    public TodayRequestBuilder today() {
        return new TodayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trim method.
     */
    @javax.annotation.Nonnull
    public TrimRequestBuilder trim() {
        return new TrimRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trimMean method.
     */
    @javax.annotation.Nonnull
    public TrimMeanRequestBuilder trimMean() {
        return new TrimMeanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the true method.
     */
    @javax.annotation.Nonnull
    public TrueRequestBuilder trueEscaped() {
        return new TrueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the trunc method.
     */
    @javax.annotation.Nonnull
    public TruncRequestBuilder trunc() {
        return new TruncRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the type method.
     */
    @javax.annotation.Nonnull
    public TypeRequestBuilder type() {
        return new TypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unichar method.
     */
    @javax.annotation.Nonnull
    public UnicharRequestBuilder unichar() {
        return new UnicharRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unicode method.
     */
    @javax.annotation.Nonnull
    public UnicodeRequestBuilder unicode() {
        return new UnicodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the upper method.
     */
    @javax.annotation.Nonnull
    public UpperRequestBuilder upper() {
        return new UpperRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usdollar method.
     */
    @javax.annotation.Nonnull
    public UsdollarRequestBuilder usdollar() {
        return new UsdollarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the value method.
     */
    @javax.annotation.Nonnull
    public ValueRequestBuilder value() {
        return new ValueRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the var_P method.
     */
    @javax.annotation.Nonnull
    public VarPRequestBuilder var_P() {
        return new VarPRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the var_S method.
     */
    @javax.annotation.Nonnull
    public VarSRequestBuilder var_S() {
        return new VarSRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the varA method.
     */
    @javax.annotation.Nonnull
    public VarARequestBuilder varA() {
        return new VarARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the varPA method.
     */
    @javax.annotation.Nonnull
    public VarPARequestBuilder varPA() {
        return new VarPARequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the vdb method.
     */
    @javax.annotation.Nonnull
    public VdbRequestBuilder vdb() {
        return new VdbRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the vlookup method.
     */
    @javax.annotation.Nonnull
    public VlookupRequestBuilder vlookup() {
        return new VlookupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weekday method.
     */
    @javax.annotation.Nonnull
    public WeekdayRequestBuilder weekday() {
        return new WeekdayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weekNum method.
     */
    @javax.annotation.Nonnull
    public WeekNumRequestBuilder weekNum() {
        return new WeekNumRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the weibull_Dist method.
     */
    @javax.annotation.Nonnull
    public WeibullDistRequestBuilder weibull_Dist() {
        return new WeibullDistRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the workDay method.
     */
    @javax.annotation.Nonnull
    public WorkDayRequestBuilder workDay() {
        return new WorkDayRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the workDay_Intl method.
     */
    @javax.annotation.Nonnull
    public WorkDayIntlRequestBuilder workDay_Intl() {
        return new WorkDayIntlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xirr method.
     */
    @javax.annotation.Nonnull
    public XirrRequestBuilder xirr() {
        return new XirrRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xnpv method.
     */
    @javax.annotation.Nonnull
    public XnpvRequestBuilder xnpv() {
        return new XnpvRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the xor method.
     */
    @javax.annotation.Nonnull
    public XorRequestBuilder xor() {
        return new XorRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the year method.
     */
    @javax.annotation.Nonnull
    public YearRequestBuilder year() {
        return new YearRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yearFrac method.
     */
    @javax.annotation.Nonnull
    public YearFracRequestBuilder yearFrac() {
        return new YearFracRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yield method.
     */
    @javax.annotation.Nonnull
    public YieldRequestBuilder yield() {
        return new YieldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yieldDisc method.
     */
    @javax.annotation.Nonnull
    public YieldDiscRequestBuilder yieldDisc() {
        return new YieldDiscRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the yieldMat method.
     */
    @javax.annotation.Nonnull
    public YieldMatRequestBuilder yieldMat() {
        return new YieldMatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the z_Test method.
     */
    @javax.annotation.Nonnull
    public ZTestRequestBuilder z_Test() {
        return new ZTestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new FunctionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public FunctionsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/functions{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new FunctionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public FunctionsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/functions{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property functions for drives
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property functions for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get functions from drives
     * @return a CompletableFuture of workbookFunctions
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctions> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFunctions::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFunctions> executionException = new java.util.concurrent.CompletableFuture<WorkbookFunctions>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get functions from drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookFunctions
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctions> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFunctions::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFunctions> executionException = new java.util.concurrent.CompletableFuture<WorkbookFunctions>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property functions in drives
     * @param body The request body
     * @return a CompletableFuture of workbookFunctions
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctions> patch(@javax.annotation.Nonnull final WorkbookFunctions body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFunctions::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFunctions> executionException = new java.util.concurrent.CompletableFuture<WorkbookFunctions>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property functions in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workbookFunctions
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctions> patch(@javax.annotation.Nonnull final WorkbookFunctions body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, WorkbookFunctions::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<WorkbookFunctions> executionException = new java.util.concurrent.CompletableFuture<WorkbookFunctions>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property functions for drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property functions for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get functions from drives
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get functions from drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property functions in drives
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookFunctions body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property functions in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final WorkbookFunctions body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get functions from drives
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

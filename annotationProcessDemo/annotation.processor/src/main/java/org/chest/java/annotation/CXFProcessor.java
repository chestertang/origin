package org.chest.java.annotation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;

import org.apache.log4j.Logger;

import com.google.auto.service.AutoService;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

@AutoService(Processor.class)
@SupportedAnnotationTypes("org.chest.java.annotation.clazz.CXFclass")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class CXFProcessor extends AbstractProcessor {

	protected final Logger logger = Logger.getLogger(CXFProcessor.class);

	private Types typeUtils;
	private Elements elementUtils;
	private Filer filer;
	private Messager messager;

	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
		typeUtils = processingEnv.getTypeUtils();
		elementUtils = processingEnv.getElementUtils(); 
		filer = processingEnv.getFiler();
		messager = processingEnv.getMessager();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annoations, RoundEnvironment roundEnv) {

		// processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, msg);
		// for (Element elem :
		// roundEnv.getElementsAnnotatedWith(CXFparameter.class)) {
		// CXFparameter anno = elem.getAnnotation(CXFparameter.class);
		// }

		if (roundEnv.processingOver()) {
			return true;
		}

		outClasssBaseInfo(roundEnv);

		writeLog(annoations.toString() + roundEnv.toString());

		return true;
	}

	/**
	 * @param roundEnv
	 * df
	 * df
	 */
	private void outClasssBaseInfo(RoundEnvironment roundEnv) {
		Set<? extends Element> root = roundEnv.getRootElements();

		// interface & class
		Set<? extends TypeElement> clazzs = ElementFilter.typesIn(root);
		logger.info(">>-- clazzs = " + clazzs);
		
		List<? extends Element> list = new ArrayList<>(clazzs);
		for (Element element : list) {
			
			//element = element.getEnclosingElement();
			
			logger.info(">>-- @ clazzs.element = " + element);
			logger.info(">>-- #DDDDDDDDDDDD# clazzs.getDocComment = " + elementUtils.getDocComment(element));
			
			logger.info(">>-- @## clazzs.Annotation = " + element.getAnnotationMirrors());
			
			// field
			List<? extends VariableElement> feilds = ElementFilter.fieldsIn(element.getEnclosedElements());
			logger.info(">>-- @@ fields = " + feilds);

			// method
			List<? extends ExecutableElement> methods = ElementFilter.methodsIn(element.getEnclosedElements());
			logger.info(">>-- @@ methods = " + methods);

			for (ExecutableElement menthodElement : methods) {
				
				logger.info(">>-- @@@ menthodElement = " + menthodElement);
				logger.info(">>-- @@@ DDDDDDDDDDDD menthod.getDocComment = " + elementUtils.getDocComment(menthodElement));
				logger.info(">>-- @@@ paramters = " + menthodElement.getParameters());
			}
		}
	}

	public static void writeLog(String str) {
		try {

			String path = "c://" + CXFProcessor.class + ".log";
			File file = new File(path);
			if (!file.exists())
				file.createNewFile();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			FileOutputStream out = new FileOutputStream(file, false);
			StringBuffer sb = new StringBuffer();
			sb.append("-----------" + sdf.format(new Date()) + "------------\n");
			sb.append(str + "\n");
			out.write(sb.toString().getBytes("utf-8"));
			out.close();
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
		}
	}

}
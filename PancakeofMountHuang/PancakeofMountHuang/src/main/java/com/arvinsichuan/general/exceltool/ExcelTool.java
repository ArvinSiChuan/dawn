/*
 *     This project is part of project Dawn, A Data Process Solution.
 *     Copyright (C) 2017, Dawn team<https://github.com/Dawn-Team>.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.arvinsichuan.general.exceltool;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

/**
 * Project PancakeofMountHuang
 * <p>
 * Author: arvinsc@foxmail.com
 * <p>
 * Date: 30-Oct-17
 * <p>
 * Package: com.arvinsichuan.general.exceltool
 *
 * @author ArvinSiChuan
 */
public class ExcelTool {

    public ExcelTool() {

    }

    public static Workbook readExcelFile(File file) throws EncryptedDocumentException, InvalidFormatException, IOException {
        return WorkbookFactory.create(file);
    }



}
